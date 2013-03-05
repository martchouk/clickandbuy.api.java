/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareCancelRequestDetails;
import static clickandbuy.api.soap.cxf.util.TestUtil.prepareMoney;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.data.PayPortTestDataSupplier;
import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.CancelRequestRequest;
import com.clickandbuy.api.soap.cxf.CancelRequestResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.OrderDetailItemList;
import com.clickandbuy.api.soap.cxf.OrderDetails;
import com.clickandbuy.api.soap.cxf.PayRequestDetails;
import com.clickandbuy.api.soap.cxf.PayRequestRequest;
import com.clickandbuy.api.soap.cxf.PayRequestResponse;
import com.clickandbuy.api.soap.cxf.TransactionIDStatus;

/**
 * Tests related to CancelRequest
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CancelRequestTest extends PayPortParentTest {

	/** Test data */

	private Long			transactionID					= null;

	private Long			recurringPaymentAuthorizationID	= null;

	@Autowired
	PayPortTestDataSupplier	payPortTestDataSupplier;

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();

		transactionID = doPayRequest();
	}

	/**
	 * Test the CancelRequest
	 */
	@Test
	public void testCancelRequest() {
		CancelRequestResponse cancelRequestResponse = null;

		CancelRequestRequest cancelRequestRequest = new CancelRequestRequest();
		cancelRequestRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		cancelRequestRequest.setDetails(prepareCancelRequestDetails(recurringPaymentAuthorizationID, transactionID, payPortTestDataSupplier.getCancelRequestCancelMode()));

		try {
			cancelRequestResponse = payPortType.cancelRequest(cancelRequestRequest);
			logger.debug("RequestTrackingID: [" + cancelRequestResponse.getRequestTrackingID() + "]");
			display(cancelRequestResponse.getTransaction());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	public long doPayRequest() {
		Long payRequestTransactionID = null;
		PayRequestResponse payRequestResponse = null;

		PayRequestRequest payRequestRequest = new PayRequestRequest();
		payRequestRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		payRequestRequest.setDetails(preparePayRequestDetails());

		try {
			payRequestResponse = payPortType.payRequest(payRequestRequest);
			payRequestTransactionID = payRequestResponse.getTransaction().getTransactionID();
			logger.debug("Created transaction with Id: " + payRequestTransactionID);
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		return payRequestTransactionID;
	}

	/**
	 * Prepares the soap {@link PayRequest_Request} object from given parameters
	 * 
	 * @param payRequestFormBean
	 * @return T_PayRequest_Details
	 * @throws PayServiceException
	 */
	private PayRequestDetails preparePayRequestDetails() {
		PayRequestDetails payRequestDetails = new PayRequestDetails();

		// Order Details
		OrderDetails order = new OrderDetails();
		order.setItemList(new OrderDetailItemList());
		order.setText(payPortTestDataSupplier.getPayRequestText());

		// Request Details
		payRequestDetails.setAmount(prepareMoney(payPortTestDataSupplier.getPayRequestAmount(), payPortTestDataSupplier.getPayRequestCurrency()));
		payRequestDetails.setAuthExpiration(payPortTestDataSupplier.getPayRequestAuthExpiration());
		payRequestDetails.setBasketRisk(payPortTestDataSupplier.getPayRequestBasketRisk());
		payRequestDetails.setClientRisk(payPortTestDataSupplier.getPayRequestClientRisk());
		payRequestDetails.setConfirmExpiration(payPortTestDataSupplier.getPayRequestConfirmExpiration());
		payRequestDetails.setConsumerCountry(payPortTestDataSupplier.getPayRequestConsumerNation());
		payRequestDetails.setConsumerIPAddress(payPortTestDataSupplier.getPayRequestConsumerIPAddress());
		payRequestDetails.setConsumerLanguage(payPortTestDataSupplier.getPayRequestConsumerLanguage());
		payRequestDetails.setExternalID(payPortTestDataSupplier.getPayRequestExternalId());
		payRequestDetails.setFailureURL(payPortTestDataSupplier.getPayRequestFailureURI());
		payRequestDetails.setOrderDetails(order);
		payRequestDetails.setSuccessExpiration(payPortTestDataSupplier.getPayRequestSuccessExpiration());
		payRequestDetails.setSuccessURL(payPortTestDataSupplier.getPayRequestSuccessURI());

		return payRequestDetails;
	}

	public void display(TransactionIDStatus transactionIDStatus) {
		logger.debug("TransactionIDStatus:");
		logger.debug("TransactionIDStatus:" + transactionIDStatus.getExternalID());
		logger.debug("TransactionIDStatus:" + transactionIDStatus.getRedirectURL());
		logger.debug("TransactionIDStatus:" + transactionIDStatus.getCrn());
		logger.debug("TransactionIDStatus:" + transactionIDStatus.getTransactionID());
		logger.debug("TransactionIDStatus:" + transactionIDStatus.getCreatedRecurringPaymentAuthorization());
		logger.debug("TransactionIDStatus:" + transactionIDStatus.getErrorDetails());
		logger.debug("TransactionIDStatus:" + transactionIDStatus.getTransactionStatus());
		logger.debug("TransactionIDStatus:" + transactionIDStatus.getTransactionType());
	}
}
