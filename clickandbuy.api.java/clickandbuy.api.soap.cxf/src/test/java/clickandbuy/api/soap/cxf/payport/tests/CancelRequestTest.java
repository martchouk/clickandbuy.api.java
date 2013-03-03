package clickandbuy.api.soap.cxf.payport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.CancelRequestDetails;
import com.clickandbuy.api.soap.cxf.CancelRequestRequest;
import com.clickandbuy.api.soap.cxf.CancelRequestResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;

/**
 * Tests related to CancelRequest
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CancelRequestTest extends PayPortParentTest {

	/** Test data */
	@Value("${merchantId}")
	private long	merchantId;

	@Value("${projectId}")
	private long	projectId;

	@Value("${secretKey}")
	private String	secretKey;

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the CancelRequest
	 */
	@Test
	public void testCancelRequest() {
		CancelRequestResponse cancelRequestResponse = null;

		CancelRequestRequest cancelRequestRequest = new CancelRequestRequest();
		cancelRequestRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		cancelRequestRequest.setDetails(prepareCancelRequestDetails());

		try {
			cancelRequestResponse = payPortType.cancelRequest(cancelRequestRequest);
			logger.debug("Created transaction with Id: " + cancelRequestResponse.getTransaction().getTransactionID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public CancelRequestDetails prepareCancelRequestDetails() {
		CancelRequestDetails cancelRequestDetails = new CancelRequestDetails();

		// TODO fill in necessary test data

		// cancelRequestDetails.setCancelIdentifier(value);
		// cancelRequestDetails.setCancelMode(value);

		return cancelRequestDetails;
	}
}
