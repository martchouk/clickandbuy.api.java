/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.CancelBatchDetails;
import com.clickandbuy.api.soap.cxf.CancelBatchRequest;
import com.clickandbuy.api.soap.cxf.CancelBatchResponse;
import com.clickandbuy.api.soap.cxf.CreateBatchDetails;
import com.clickandbuy.api.soap.cxf.CreateBatchRequest;
import com.clickandbuy.api.soap.cxf.CreateBatchResponse;
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

	private Long					batchID	= null;

	// @Autowired
	// private PayPortTestDataSupplier payPortTestDataSupplier;

	@Value("${externalId}")
	String							externalId;

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("***externalId:" + externalId);

		batchID = doCreateBatch();
	}

	/**
	 * Test the CancelBatch
	 */
	@Test
	public void testCancelBatch() {
		CancelBatchResponse cancelBatchResponse = new CancelBatchResponse();

		CancelBatchRequest cancelBatchRequest = new CancelBatchRequest();
		cancelBatchRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		cancelBatchRequest.setDetails(prepareCancelBatchDetails());

		try {
			cancelBatchResponse = payPortType.cancelBatch(cancelBatchRequest);
			logger.debug("Canceled batch with Id: " + cancelBatchResponse.getBatch().getBatchID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}
	}

	public Long doCreateBatch() {
		Long tempBatchID = null;

		CreateBatchResponse createBatchResponse = null;

		CreateBatchRequest createBatchRequest = new CreateBatchRequest();
		createBatchRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		createBatchRequest.setDetails(prepareCreateBatchDetails());

		try {
			createBatchResponse = payPortType.createBatch(createBatchRequest);
			tempBatchID = createBatchResponse.getBatch().getBatchID();
			logger.debug("Created batch with ID: " + tempBatchID);
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		return tempBatchID;
	}

	/**
	 * @return
	 */
	public CancelBatchDetails prepareCancelBatchDetails() {
		CancelBatchDetails cancelBatchDetails = new CancelBatchDetails();

		cancelBatchDetails.setBatchID(batchID);

		return cancelBatchDetails;
	}

	/**
	 * @return
	 */
	public CreateBatchDetails prepareCreateBatchDetails() {
		CreateBatchDetails createBatchDetails = new CreateBatchDetails();

		createBatchDetails.setExternalBatchID(externalId);

		return createBatchDetails;
	}
}
