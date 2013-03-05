/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.CancelBatchDetails;
import com.clickandbuy.api.soap.cxf.CancelBatchRequest;
import com.clickandbuy.api.soap.cxf.CancelBatchResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;

/**
 * Tests related to CancelBatch
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CancelBatchTest extends PayPortParentTest {

	/** Test data */

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the CancelBatch
	 */
	@Test
	public void testCancelBatch() {
		CancelBatchResponse cancelBatchResponse = new CancelBatchResponse();

		CancelBatchRequest cancelBatchRequest = new CancelBatchRequest();
		cancelBatchRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		cancelBatchRequest.setDetails(prepareCancelBatchDetails());

		try {
			cancelBatchResponse = payPortType.cancelBatch(cancelBatchRequest);
			logger.debug("Created transaction with Id: " + cancelBatchResponse.getRequestTrackingID());
			logger.debug("Created transaction with Id: " + cancelBatchResponse.getBatch().getBatchID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public CancelBatchDetails prepareCancelBatchDetails() {
		CancelBatchDetails cancelBatchDetails = new CancelBatchDetails();

		// TODO fill in necessary test data

		// cancelBatchDetails.setBatchID(value);

		return cancelBatchDetails;
	}
}
