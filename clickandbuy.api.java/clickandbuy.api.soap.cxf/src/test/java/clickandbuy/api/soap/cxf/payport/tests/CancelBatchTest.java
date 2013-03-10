/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import junit.framework.Assert;

import org.apache.log4j.Logger;
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

	/**
	 * class logger.
	 */
	private static final Logger	logger	= Logger.getLogger(CancelBatchTest.class);

	/**
	 * batch id.
	 */
	private Long				batchID	= null;

	/**
	 * @throws ErrorDetails_Exception
	 * 
	 */
	@Before
	public void setUp() throws ErrorDetails_Exception {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("externalId: [" + externalId + "]");

		batchID = doCreateBatch();
	}

	/**
	 * Tests the CancelBatch operation
	 * 
	 * @throws ErrorDetails_Exception
	 */
	@Test
	public void testCancelBatch() throws ErrorDetails_Exception {
		CancelBatchResponse cancelBatchResponse = new CancelBatchResponse();

		final CancelBatchRequest cancelBatchRequest = new CancelBatchRequest();
		cancelBatchRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		cancelBatchRequest.setDetails(prepareCancelBatchDetails());

		try {
			cancelBatchResponse = payPortType.cancelBatch(cancelBatchRequest);

			Assert.assertNotNull("cancelBatchResponse should not be null!", cancelBatchResponse);
			Assert.assertNotNull("cancelBatchResponse.getBatch() should not be null!", cancelBatchResponse);

			logger.debug("Canceled batch with Id: [" + cancelBatchResponse.getBatch().getBatchID() + "]");
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}
	}

	/**
	 * Runs a CreateBatch operation.
	 * 
	 * @return the ID of the created batch
	 * 
	 * @throws ErrorDetails_Exception
	 */
	private Long doCreateBatch() throws ErrorDetails_Exception {
		Long tempBatchID = null;

		CreateBatchResponse createBatchResponse = null;

		final CreateBatchRequest createBatchRequest = new CreateBatchRequest();
		createBatchRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		createBatchRequest.setDetails(prepareCreateBatchDetails());

		try {
			createBatchResponse = payPortType.createBatch(createBatchRequest);

			Assert.assertNotNull("createBatchResponse should not be null!", createBatchResponse);
			Assert.assertNotNull("createBatchResponse.getBatch() should not be null!", createBatchResponse.getBatch());
			Assert.assertNotNull("createBatchResponse.getBatch().getBatchID() should not be null!", createBatchResponse.getBatch().getBatchID());

			tempBatchID = createBatchResponse.getBatch().getBatchID();
			logger.debug("Created batch with ID: [" + tempBatchID + "]");
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}

		return tempBatchID;
	}

	/**
	 * Prepares an {@link CancelBatchDetails} based on the previously created batch
	 * 
	 * @return the {@link CancelBatchDetails}
	 */
	private CancelBatchDetails prepareCancelBatchDetails() {
		final CancelBatchDetails cancelBatchDetails = new CancelBatchDetails();

		cancelBatchDetails.setBatchID(batchID);

		return cancelBatchDetails;
	}

	/**
	 * Prepares an {@link CreateBatchDetails} based on the parameters provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the {@link CreateBatchDetails}
	 */
	private CreateBatchDetails prepareCreateBatchDetails() {
		final CreateBatchDetails createBatchDetails = new CreateBatchDetails();

		createBatchDetails.setExternalBatchID(externalId);

		return createBatchDetails;
	}
}
