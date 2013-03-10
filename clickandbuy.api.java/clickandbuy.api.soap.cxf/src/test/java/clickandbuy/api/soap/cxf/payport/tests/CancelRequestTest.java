/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareMoney;
import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.data.PayPortTestDataSupplier;
import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.CancelIdentifier;
import com.clickandbuy.api.soap.cxf.CancelMode;
import com.clickandbuy.api.soap.cxf.CancelRequestDetails;
import com.clickandbuy.api.soap.cxf.CancelRequestRequest;
import com.clickandbuy.api.soap.cxf.CancelRequestResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.OrderDetailItemList;
import com.clickandbuy.api.soap.cxf.OrderDetails;
import com.clickandbuy.api.soap.cxf.PayRequestDetails;
import com.clickandbuy.api.soap.cxf.PayRequestRequest;
import com.clickandbuy.api.soap.cxf.PayRequestResponse;

/**
 * Tests related to CancelRequest
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CancelRequestTest extends PayPortParentTest {

	/**
	 * class logger.
	 */
	private static final Logger	logger							= Logger.getLogger(CancelRequestTest.class);

	/**
	 * transaction id.
	 */
	private Long				transactionID					= null;

	/**
	 * recurring payment authorization id.
	 */
	private final Long			recurringPaymentAuthorizationID	= null;

	/**
	 * test setup.
	 */
	@Before
	public void setUp() {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("externalId: [" + externalId + "]");

		transactionID = doPayRequest();
	}

	/**
	 * Tests the CancelRequest operation
	 */
	@Test
	public void testCancelRequest() {
		CancelRequestResponse cancelRequestResponse = null;

		final CancelRequestRequest cancelRequestRequest = new CancelRequestRequest();
		cancelRequestRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		cancelRequestRequest.setDetails(prepareCancelRequestDetails(recurringPaymentAuthorizationID, transactionID, testData.getCancelRequestCancelMode()));

		try {
			cancelRequestResponse = payPortType.cancelRequest(cancelRequestRequest);

			Assert.assertNotNull("cancelRequestResponse should not be null!", cancelRequestResponse);
			Assert.assertNotNull("cancelRequestResponse.getTransaction() should not be null!", cancelRequestResponse.getTransaction());
			Assert.assertNotNull("cancelRequestResponse.getTransaction().getTransactionID() should not be null!", cancelRequestResponse.getTransaction().getTransactionID());
			Assert.assertNotNull("cancelRequestResponse.getTransaction().getTransactionStatus() should not be null!", cancelRequestResponse.getTransaction().getTransactionStatus());

			logger.debug("Pay request with transaction ID: [" + cancelRequestResponse.getTransaction().getTransactionID() + "] was canceled");
			logger.debug("Its current transaction status is: [" + cancelRequestResponse.getTransaction().getTransactionStatus() + "]");
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}
	}

	/**
	 * Executes a PayRequest
	 * 
	 * @return the transaction ID received from the PayRequest
	 */
	private long doPayRequest() {
		Long payRequestTransactionID = null;
		PayRequestResponse payRequestResponse = null;

		final PayRequestRequest payRequestRequest = new PayRequestRequest();
		payRequestRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		payRequestRequest.setDetails(preparePayRequestDetails());

		try {
			payRequestResponse = payPortType.payRequest(payRequestRequest);

			Assert.assertNotNull("payRequestResponse should not be null!", payRequestResponse);
			Assert.assertNotNull("payRequestResponse.getTransaction() should not be null!", payRequestResponse.getTransaction());
			Assert.assertNotNull("payRequestResponse.getTransaction().getTransactionID() should not be null!", payRequestResponse.getTransaction().getTransactionID());

			payRequestTransactionID = payRequestResponse.getTransaction().getTransactionID();
			logger.debug("Created transaction with ID: [" + payRequestTransactionID + "]");
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		return payRequestTransactionID;
	}

	/**
	 * Prepares an {@link PayRequestDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link PayRequestDetails}
	 */
	private PayRequestDetails preparePayRequestDetails() {
		final PayRequestDetails payRequestDetails = new PayRequestDetails();

		payRequestDetails.setAmount(prepareMoney(testData.getPayRequestAmount(), testData.getPayRequestCurrency()));
		payRequestDetails.setAuthExpiration(testData.getPayRequestAuthExpiration());
		payRequestDetails.setBasketRisk(testData.getPayRequestBasketRisk());
		payRequestDetails.setClientRisk(testData.getPayRequestClientRisk());
		payRequestDetails.setConfirmExpiration(testData.getPayRequestConfirmExpiration());
		payRequestDetails.setConsumerCountry(testData.getPayRequestConsumerNation());
		payRequestDetails.setConsumerIPAddress(testData.getPayRequestConsumerIPAddress());
		payRequestDetails.setConsumerLanguage(testData.getPayRequestConsumerLanguage());
		payRequestDetails.setExternalID(externalId);
		payRequestDetails.setFailureURL(testData.getPayRequestFailureURI());
		payRequestDetails.setOrderDetails(prepareOrderDetails());
		payRequestDetails.setSuccessExpiration(testData.getPayRequestSuccessExpiration());
		payRequestDetails.setSuccessURL(testData.getPayRequestSuccessURI());

		return payRequestDetails;
	}

	/**
	 * Prepares an {@link OrderDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link OrderDetails}
	 */
	private OrderDetails prepareOrderDetails() {
		final OrderDetails orderDetails = new OrderDetails();

		orderDetails.setItemList(new OrderDetailItemList());
		orderDetails.setText(testData.getPayRequestText());

		return orderDetails;
	}

	/**
	 * Prepare cancel request details.
	 * 
	 * @param recurringPaymentAuthorizationID
	 * @param transactionID
	 * @param cancelMode
	 * @return
	 */
	public static CancelRequestDetails prepareCancelRequestDetails(final Long recurringPaymentAuthorizationID, final Long transactionID, final CancelMode cancelMode) {
		final CancelRequestDetails cancelRequestDetails = new CancelRequestDetails();

		cancelRequestDetails.setCancelIdentifier(prepareCancelIdentifier(recurringPaymentAuthorizationID, transactionID));
		cancelRequestDetails.setCancelMode(cancelMode);
		return cancelRequestDetails;
	}

	/**
	 * Prepare cancel identifier.
	 * 
	 * @param recurringPaymentAuthorizationID
	 * @param transactionID
	 * @return
	 */
	private static CancelIdentifier prepareCancelIdentifier(final Long recurringPaymentAuthorizationID, final Long transactionID) {
		final CancelIdentifier cancelIdentifier = new CancelIdentifier();
		if (recurringPaymentAuthorizationID != null) {
			cancelIdentifier.setRecurringPaymentAuthorizationID(recurringPaymentAuthorizationID);
		} else {
			cancelIdentifier.setTransactionID(transactionID);
		}
		return cancelIdentifier;
	}
}
