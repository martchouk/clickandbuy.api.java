package clickandbuy.api.soap.cxf.payport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetBatchStatusDetails;
import com.clickandbuy.api.soap.cxf.GetBatchStatusRequest;
import com.clickandbuy.api.soap.cxf.GetBatchStatusResponse;

/**
 * Tests related to GetBatchStatus
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetBatchStatusTest extends PayPortParentTest {

	/** Test data */
	@Value("${externalId}")
	private String	externalId;

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("***externalId:" + externalId);
	}

	/**
	 * Test the GetBatchStatus
	 */
	@Test
	public void testGetBatchStatus() {
		GetBatchStatusResponse getBatchStatusResponse = null;

		GetBatchStatusRequest getBatchStatusRequest = new GetBatchStatusRequest();
		getBatchStatusRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		getBatchStatusRequest.setDetails(prepareGetBatchStatusDetails());

		try {
			getBatchStatusResponse = payPortType.getBatchStatus(getBatchStatusRequest);
			logger.debug("Created transaction with Id: " + getBatchStatusResponse.getRequestTrackingID());
			logger.debug("Created transaction with Id: " + getBatchStatusResponse.getBatch().getBatchID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public GetBatchStatusDetails prepareGetBatchStatusDetails() {
		GetBatchStatusDetails getBatchStatusDetails = new GetBatchStatusDetails();

		// TODO fill in necessary test data

		// getBatchStatusDetails.setBatchID(value);
		// getBatchStatusDetails.setBatchItemIDList(value);
		// getBatchStatusDetails.setExternalBatchID(value);

		return getBatchStatusDetails;
	}
}
