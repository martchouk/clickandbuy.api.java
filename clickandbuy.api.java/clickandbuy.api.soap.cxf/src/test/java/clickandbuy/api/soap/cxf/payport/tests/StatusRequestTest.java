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

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.OrderDetailItemList;
import com.clickandbuy.api.soap.cxf.OrderDetails;
import com.clickandbuy.api.soap.cxf.PayRequestDetails;
import com.clickandbuy.api.soap.cxf.PayRequestRequest;
import com.clickandbuy.api.soap.cxf.PayRequestResponse;
import com.clickandbuy.api.soap.cxf.StatusRequestDetails;
import com.clickandbuy.api.soap.cxf.StatusRequestRequest;
import com.clickandbuy.api.soap.cxf.StatusRequestResponse;
import com.clickandbuy.api.soap.cxf.TransactionIDList;

/**
 * Tests related to StatusRequest
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class StatusRequestTest extends PayPortParentTest {

	/**
	 * class logger.
	 */
	private static final Logger	logger			= Logger.getLogger(StatusRequestTest.class);

	/**
	 * transaction ID.
	 */
	private Long				transactionID	= null;

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
	 * Tests the StatusRequest operation
	 */
	@Test
	public void testStatusRequest() {
		StatusRequestResponse statusRequestResponse = null;

		final StatusRequestRequest statusRequestRequest = new StatusRequestRequest();
		statusRequestRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		statusRequestRequest.setDetails(prepareStatusRequestDetails());

		try {
			statusRequestResponse = payPortType.statusRequest(statusRequestRequest);

			Assert.assertNotNull("statusRequestResponse should not be null!", statusRequestResponse);
			Assert.assertNotNull("statusRequestResponse.getTransactionList() should not be null!", statusRequestResponse.getTransactionList());
			Assert.assertNotNull("statusRequestResponse.getTransactionList().getTransaction() should not be null!", statusRequestResponse.getTransactionList().getTransaction());
			Assert.assertEquals("statusRequestResponse.getTransactionList().getTransaction() list should contain only 1 element!", 1, statusRequestResponse.getTransactionList().getTransaction().size());
			Assert.assertNotNull("statusRequestResponse.getTransactionList().getTransaction().get(0) should not be null!", statusRequestResponse.getTransactionList().getTransaction().get(0));
			Assert.assertNotNull("statusRequestResponse.getTransactionList().getTransaction().get(0).getTransactionStatus() should not be null!", statusRequestResponse.getTransactionList().getTransaction().get(0).getTransactionStatus());

			logger.debug("The transaction with ID: [" + transactionID + "] have the status: [" + statusRequestResponse.getTransactionList().getTransaction().get(0).getTransactionStatus() + "]");
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
	 * Prepares an {@link StatusRequestDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link StatusRequestDetails}
	 */
	private StatusRequestDetails prepareStatusRequestDetails() {
		final StatusRequestDetails statusRequestDetails = new StatusRequestDetails();

		statusRequestDetails.setTransactionIDList(prepareTransactionIDList());

		return statusRequestDetails;
	}

	/**
	 * Prepares an {@link TransactionIDList} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link TransactionIDList}
	 */
	private TransactionIDList prepareTransactionIDList() {
		final TransactionIDList transactionIDList = new TransactionIDList();

		transactionIDList.getTransactionID().add(transactionID);

		return transactionIDList;
	}
}
