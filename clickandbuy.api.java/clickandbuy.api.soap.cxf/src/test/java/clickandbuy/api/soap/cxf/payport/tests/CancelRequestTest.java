package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareCancelRequestDetails;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.CancelMode;
import com.clickandbuy.api.soap.cxf.CancelRequestRequest;
import com.clickandbuy.api.soap.cxf.CancelRequestResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
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
	@Value("${merchantId}")
	private long		merchantId;

	@Value("${projectId}")
	private long		projectId;

	@Value("${secretKey}")
	private String		secretKey;

	@Value("${payPort.cancelRequest.cancelIdentifier.recurringPaymentAuthorizationID}")
	private Long		recurringPaymentAuthorizationID;

	@Value("${payPort.cancelRequest.cancelIdentifier.transactionID}")
	//may not be required anymore as it is taken from payRequestTest
	private Long		transactionID;

	@Value("${payPort.cancelRequest.cancelMode}")
	private CancelMode	cancelMode;
	
	@Autowired
	private PayRequestTest payRequestTest;
	
	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
		
		transactionID = payRequestTest.testPayRequest();
	}

	/**
	 * Test the CancelRequest
	 */
	@Test
	public void testCancelRequest() {
		CancelRequestResponse cancelRequestResponse = null;

		CancelRequestRequest cancelRequestRequest = new CancelRequestRequest();
		cancelRequestRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		cancelRequestRequest.setDetails(prepareCancelRequestDetails(recurringPaymentAuthorizationID, transactionID, cancelMode));

		try {
			cancelRequestResponse = payPortType.cancelRequest(cancelRequestRequest);
			logger.debug("RequestTrackingID: [" + cancelRequestResponse.getRequestTrackingID() + "]");
			display(cancelRequestResponse.getTransaction());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}
	
	public void display(TransactionIDStatus transactionIDStatus){
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
