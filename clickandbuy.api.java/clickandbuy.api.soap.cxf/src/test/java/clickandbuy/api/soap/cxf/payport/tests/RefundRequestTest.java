/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareMoney;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.data.PayPortTestDataSupplier;
import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.OrderDetailItemList;
import com.clickandbuy.api.soap.cxf.OrderDetails;
import com.clickandbuy.api.soap.cxf.PayRequestDetails;
import com.clickandbuy.api.soap.cxf.PayRequestRequest;
import com.clickandbuy.api.soap.cxf.PayRequestResponse;
import com.clickandbuy.api.soap.cxf.RefundRequestDetails;
import com.clickandbuy.api.soap.cxf.RefundRequestRequest;
import com.clickandbuy.api.soap.cxf.RefundRequestResponse;

/**
 * Tests related to RefundRequest
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class RefundRequestTest extends PayPortParentTest {

	private Long			transactionID	= null;

	@Autowired
	PayPortTestDataSupplier	payPortTestDataSupplier;

	/**
	 * 
	 */
	@Before
	public void setUp() {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("externalId: [" + externalId + "]");

		transactionID = doPayRequest();
	}

	/**
	 * Tests the RefundRequest operation
	 */
	@Test
	public void testRefundRequest() {
		RefundRequestResponse refundRequestResponse = null;

		RefundRequestRequest refundRequestRequest = new RefundRequestRequest();
		refundRequestRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		refundRequestRequest.setDetails(prepareRefundRequestDetails());

		try {
			refundRequestResponse = payPortType.refundRequest(refundRequestRequest);

			Assert.assertNotNull("refundRequestResponse should not be null!", refundRequestResponse);
			Assert.assertNotNull("refundRequestResponse.getTransaction() should not be null!", refundRequestResponse.getTransaction());
			Assert.assertNotNull("refundRequestResponse.getTransaction().getTransactionID() should not be null!", refundRequestResponse.getTransaction().getTransactionID());
			Assert.assertNotNull("refundRequestResponse.getTransaction().getTransactionStatus() should not be null!", refundRequestResponse.getTransaction().getTransactionStatus());
			Assert.assertNotNull("refundRequestResponse.getTransaction().getTransactionType() should not be null!", refundRequestResponse.getTransaction().getTransactionType());

			logger.debug("Requested refund for transaction with ID: [" + refundRequestResponse.getTransaction().getTransactionID() + "]");
			logger.debug("Having transaction status: [" + refundRequestResponse.getTransaction().getTransactionStatus() + "]");
			logger.debug("And transaction type: [" + refundRequestResponse.getTransaction().getTransactionType() + "]");
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * Executes a PayRequest
	 * 
	 * @return the transaction ID received from the PayRequest
	 */
	public long doPayRequest() {
		Long payRequestTransactionID = null;
		PayRequestResponse payRequestResponse = null;

		PayRequestRequest payRequestRequest = new PayRequestRequest();
		payRequestRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		payRequestRequest.setDetails(preparePayRequestDetails());

		try {
			payRequestResponse = payPortType.payRequest(payRequestRequest);

			Assert.assertNotNull("payRequestResponse should not be null!", payRequestResponse);
			Assert.assertNotNull("payRequestResponse.getTransaction() should not be null!", payRequestResponse.getTransaction());
			Assert.assertNotNull("payRequestResponse.getTransaction().getTransactionID() should not be null!", payRequestResponse.getTransaction().getTransactionID());

			payRequestTransactionID = payRequestResponse.getTransaction().getTransactionID();
			logger.debug("Created transaction with ID: [" + payRequestTransactionID + "]");
		} catch (ErrorDetails_Exception errorDetails_Exception) {
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
		PayRequestDetails payRequestDetails = new PayRequestDetails();

		payRequestDetails.setAmount(prepareMoney(payPortTestDataSupplier.getPayRequestAmount(), payPortTestDataSupplier.getPayRequestCurrency()));
		payRequestDetails.setAuthExpiration(payPortTestDataSupplier.getPayRequestAuthExpiration());
		payRequestDetails.setBasketRisk(payPortTestDataSupplier.getPayRequestBasketRisk());
		payRequestDetails.setClientRisk(payPortTestDataSupplier.getPayRequestClientRisk());
		payRequestDetails.setConfirmExpiration(payPortTestDataSupplier.getPayRequestConfirmExpiration());
		payRequestDetails.setConsumerCountry(payPortTestDataSupplier.getPayRequestConsumerNation());
		payRequestDetails.setConsumerIPAddress(payPortTestDataSupplier.getPayRequestConsumerIPAddress());
		payRequestDetails.setConsumerLanguage(payPortTestDataSupplier.getPayRequestConsumerLanguage());
		payRequestDetails.setExternalID(externalId);
		payRequestDetails.setFailureURL(payPortTestDataSupplier.getPayRequestFailureURI());
		payRequestDetails.setOrderDetails(prepareOrderDetails());
		payRequestDetails.setSuccessExpiration(payPortTestDataSupplier.getPayRequestSuccessExpiration());
		payRequestDetails.setSuccessURL(payPortTestDataSupplier.getPayRequestSuccessURI());

		return payRequestDetails;
	}

	/**
	 * Prepares an {@link OrderDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link OrderDetails}
	 */
	private OrderDetails prepareOrderDetails() {
		OrderDetails orderDetails = new OrderDetails();

		orderDetails.setItemList(new OrderDetailItemList());
		orderDetails.setText(payPortTestDataSupplier.getPayRequestText());

		return orderDetails;
	}

	/**
	 * @return
	 */
	public RefundRequestDetails prepareRefundRequestDetails() {
		RefundRequestDetails refundRequestDetails = new RefundRequestDetails();

		 refundRequestDetails.setAmount(prepareMoney(payPortTestDataSupplier.getPayRequestAmount(), payPortTestDataSupplier.getPayRequestCurrency()));
		 refundRequestDetails.setTransactionID(transactionID);

		return refundRequestDetails;
	}
}
