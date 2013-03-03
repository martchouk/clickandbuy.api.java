package clickandbuy.api.soap.cxf.payport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.StatusRequestDetails;
import com.clickandbuy.api.soap.cxf.StatusRequestRequest;
import com.clickandbuy.api.soap.cxf.StatusRequestResponse;

/**
 * Tests related to StatusRequest
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class StatusRequestTest extends PayPortParentTest {

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
	 * Test the StatusRequest
	 */
	@Test
	public void testStatusRequest() {
		StatusRequestResponse statusRequestResponse = null;

		StatusRequestRequest statusRequestRequest = new StatusRequestRequest();
		statusRequestRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		statusRequestRequest.setDetails(prepareStatusRequestDetails());

		try {
			statusRequestResponse = payPortType.statusRequest(statusRequestRequest);
			logger.debug("Created transaction with Id: " + statusRequestResponse.getRequestTrackingID());
			logger.debug("Created transaction with Id: " + statusRequestResponse.getTransactionList());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public StatusRequestDetails prepareStatusRequestDetails() {
		StatusRequestDetails statusRequestDetails = new StatusRequestDetails();

		// TODO fill in necessary test data

		// statusRequestDetails.setExternalIDList(value);
		// statusRequestDetails.setTransactionIDList(value);

		return statusRequestDetails;
	}
}
