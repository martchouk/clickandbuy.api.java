package clickandbuy.api.soap.cxf.payport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.AddBatchItemDetails;
import com.clickandbuy.api.soap.cxf.AddBatchItemRequest;
import com.clickandbuy.api.soap.cxf.AddBatchItemResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;

/**
 * Tests related to AddBatchItem
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class AddBathItemTest extends PayPortParentTest {

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
	 * Test the AddBathItem
	 */
	@Test
	public void testAddBatchItem() {
		AddBatchItemResponse addBatchItemResponse = null;

		AddBatchItemRequest addBatchItemRequest = new AddBatchItemRequest();
		addBatchItemRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		addBatchItemRequest.setDetails(prepareAddBatchItemDetails());

		try {
			addBatchItemResponse = payPortType.addBatchItem(addBatchItemRequest);
			logger.debug("Created transaction with Id: " + addBatchItemResponse.getRequestTrackingID());
			logger.debug("Created transaction with Id: " + addBatchItemResponse.getBatch().getBatchID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public AddBatchItemDetails prepareAddBatchItemDetails() {
		AddBatchItemDetails addBatchItemDetails = new AddBatchItemDetails();

		// TODO fill in necessary test data

		// addBatchItemDetails.setBatchID(value);
		// addBatchItemDetails.setBatchItemDetailsList(value);

		return addBatchItemDetails;
	}
}