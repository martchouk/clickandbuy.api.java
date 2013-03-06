/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.data.PayPortTestDataSupplier;
import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.CancelBatchDetails;
import com.clickandbuy.api.soap.cxf.CancelBatchRequest;
import com.clickandbuy.api.soap.cxf.CancelBatchResponse;
import com.clickandbuy.api.soap.cxf.CreateBatchDetails;
import com.clickandbuy.api.soap.cxf.CreateBatchRequest;
import com.clickandbuy.api.soap.cxf.CreateBatchResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;

/**
 * Test(s) related to CancelBatch
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CancelBatchTest extends PayPortParentTest {

	private Long	batchID	= null;

	/**
	 * 
	 */
	@Before
	public void setUp() {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("externalId: [" + externalId + "]");

		batchID = doCreateBatch();
	}

	/**
	 * Tests the CancelBatch operation
	 */
	@Test
	public void testCancelBatch() {
		CancelBatchResponse cancelBatchResponse = new CancelBatchResponse();

		CancelBatchRequest cancelBatchRequest = new CancelBatchRequest();
		cancelBatchRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		cancelBatchRequest.setDetails(prepareCancelBatchDetails());

		try {
			cancelBatchResponse = payPortType.cancelBatch(cancelBatchRequest);

			Assert.assertNotNull("cancelBatchResponse should not be null!", cancelBatchResponse);
			Assert.assertNotNull("cancelBatchResponse.getBatch() should not be null!", cancelBatchResponse);

			logger.debug("Canceled batch with Id: [" + cancelBatchResponse.getBatch().getBatchID() + "]");
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}
	}

	/**
	 * Runs a CreateBatch operation.
	 * 
	 * @return the ID of the created batch
	 */
	public Long doCreateBatch() {
		Long tempBatchID = null;

		CreateBatchResponse createBatchResponse = null;

		CreateBatchRequest createBatchRequest = new CreateBatchRequest();
		createBatchRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		createBatchRequest.setDetails(prepareCreateBatchDetails());

		try {
			createBatchResponse = payPortType.createBatch(createBatchRequest);

			Assert.assertNotNull("createBatchResponse should not be null!", createBatchResponse);
			Assert.assertNotNull("createBatchResponse.getBatch() should not be null!", createBatchResponse.getBatch());
			Assert.assertNotNull("createBatchResponse.getBatch().getBatchID() should not be null!", createBatchResponse.getBatch().getBatchID());

			tempBatchID = createBatchResponse.getBatch().getBatchID();
			logger.debug("Created batch with ID: [" + tempBatchID + "]");
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		return tempBatchID;
	}

	/**
	 * Prepares an {@link CancelBatchDetails} based on the previously created batch
	 * 
	 * @return the {@link CancelBatchDetails}
	 */
	public CancelBatchDetails prepareCancelBatchDetails() {
		CancelBatchDetails cancelBatchDetails = new CancelBatchDetails();

		cancelBatchDetails.setBatchID(batchID);

		return cancelBatchDetails;
	}

	/**
	 * Prepares an {@link CreateBatchDetails} based on the parameters provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the {@link CreateBatchDetails}
	 */
	public CreateBatchDetails prepareCreateBatchDetails() {
		CreateBatchDetails createBatchDetails = new CreateBatchDetails();

		createBatchDetails.setExternalBatchID(externalId);

		return createBatchDetails;
	}
}
