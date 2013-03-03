package clickandbuy.api.soap.cxf.payport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.ExecuteBatchDetails;
import com.clickandbuy.api.soap.cxf.ExecuteBatchRequest;
import com.clickandbuy.api.soap.cxf.ExecuteBatchResponse;

/**
 * Tests related to ExecuteBatch
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class ExecuteBatchTest extends PayPortParentTest {

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
	 * Test the ExecuteBatch
	 */
	@Test
	public void testExecuteBatch() {
		ExecuteBatchResponse executeBatchResponse = null;

		ExecuteBatchRequest executeBatchRequest = new ExecuteBatchRequest();
		executeBatchRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		executeBatchRequest.setDetails(prepareExecuteBatchDetails());

		try {
			executeBatchResponse = payPortType.executeBatch(executeBatchRequest);
			logger.debug("Created transaction with Id: " + executeBatchResponse.getRequestTrackingID());
			logger.debug("Created transaction with Id: " + executeBatchResponse.getBatch().getBatchID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public ExecuteBatchDetails prepareExecuteBatchDetails() {
		ExecuteBatchDetails executeBatchDetails = new ExecuteBatchDetails();

		// TODO fill in necessary test data

		// executeBatchDetails.setBatchID(value);

		return executeBatchDetails;
	}
}