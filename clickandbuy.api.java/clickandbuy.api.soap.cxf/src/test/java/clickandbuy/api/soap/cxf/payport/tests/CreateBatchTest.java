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

import com.clickandbuy.api.soap.cxf.CreateBatchDetails;
import com.clickandbuy.api.soap.cxf.CreateBatchRequest;
import com.clickandbuy.api.soap.cxf.CreateBatchResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;

/**
 * Test(s) related to CreateBatch
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CreateBatchTest extends PayPortParentTest {

	/**
	 * class logger.
	 */
	private static final Logger	logger	= Logger.getLogger(CreateBatchTest.class);

	/**
	 * test setup.
	 */
	@Before
	public void setUp() {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("externalId: [" + externalId + "]");
	}

	/**
	 * Tests the CreateBatch operation
	 * 
	 * @throws ErrorDetails_Exception
	 *             if during communication (between the client API implementation and the ClickandBuy API system) the communication is disturbed or a logical or technical error occurs. The response from ClickandBuy system contains detailed
	 *             error messages which facilitate the localization and eradication of the problem.
	 */
	@Test
	public void testCreateBatch() throws ErrorDetails_Exception {
		CreateBatchResponse createBatchResponse = null;

		final CreateBatchRequest createBatchRequest = new CreateBatchRequest();
		createBatchRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		createBatchRequest.setDetails(prepareCreateBatchDetails());

		try {
			createBatchResponse = payPortType.createBatch(createBatchRequest);

			Assert.assertNotNull("createBatchResponse should not be null!", createBatchResponse);
			Assert.assertNotNull("createBatchResponse.getBatch() should not be null!", createBatchResponse.getBatch());
			Assert.assertNotNull("createBatchResponse.getBatch().getBatchID() should not be null!", createBatchResponse.getBatch().getBatchID());

			logger.debug("Created batch with ID: [" + createBatchResponse.getBatch().getBatchID() + "]");
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}
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
