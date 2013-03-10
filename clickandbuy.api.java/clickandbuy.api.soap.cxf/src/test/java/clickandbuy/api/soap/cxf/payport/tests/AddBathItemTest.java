/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareMoney;
import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.data.PayPortTestDataSupplier;
import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.AddBatchItemDetails;
import com.clickandbuy.api.soap.cxf.AddBatchItemProcessingDetails;
import com.clickandbuy.api.soap.cxf.AddBatchItemRequest;
import com.clickandbuy.api.soap.cxf.AddBatchItemResponse;
import com.clickandbuy.api.soap.cxf.BatchItemDetails;
import com.clickandbuy.api.soap.cxf.BatchItemDetailsList;
import com.clickandbuy.api.soap.cxf.CreateBatchDetails;
import com.clickandbuy.api.soap.cxf.CreateBatchRequest;
import com.clickandbuy.api.soap.cxf.CreateBatchResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.OrderDetailItemList;
import com.clickandbuy.api.soap.cxf.OrderDetails;
import com.clickandbuy.api.soap.cxf.PayRequestDetails;

/**
 * Test(s) related to AddBatchItem
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class AddBathItemTest extends PayPortParentTest {

	/**
	 * class logger.
	 */
	private static final Logger	logger	= Logger.getLogger(AddBathItemTest.class);

	/**
	 * batch id.
	 */
	private Long				batchID	= null;

	/**
	 * test setup.
	 */
	@Before
	public void setUp() {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("externalId: [" + externalId + "]");

		batchID = doCreateBatch();
	}

	/**
	 * Tests the AddBatchItem operation
	 */
	@Test
	public void testAddBatchItem() {
		AddBatchItemResponse addBatchItemResponse = null;

		final AddBatchItemRequest addBatchItemRequest = new AddBatchItemRequest();
		addBatchItemRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		addBatchItemRequest.setDetails(prepareAddBatchItemDetails());

		try {
			addBatchItemResponse = payPortType.addBatchItem(addBatchItemRequest);

			Assert.assertNotNull("addBatchItemResponse should not be null!", addBatchItemResponse);
			Assert.assertNotNull("addBatchItemResponse.getBatchItemList() should not be null!", addBatchItemResponse.getBatchItemList());
			Assert.assertNotNull("addBatchItemResponse.getBatchItemList().getBatchItem() should not be null!", addBatchItemResponse.getBatchItemList().getBatchItem());
			Assert.assertEquals("addBatchItemResponse.getBatchItemList().getBatchItem() list should contain only 1 element!", 1, addBatchItemResponse.getBatchItemList().getBatchItem().size());
			Assert.assertNotNull("addBatchItemResponse.getBatchItemList().getBatchItem().get(0) should not be null!", addBatchItemResponse.getBatchItemList().getBatchItem().get(0));
			Assert.assertNotNull("addBatchItemResponse.getBatchItemList().getBatchItem().get(0).getBatchItemID() should not be null!", addBatchItemResponse.getBatchItemList().getBatchItem().get(0).getBatchItemID());

			logger.debug("RequestTrackingId: [" + addBatchItemResponse.getRequestTrackingID() + "]");
			logger.debug("Successfully added BatchItem with ID: [" + addBatchItemResponse.getBatchItemList().getBatchItem().get(0).getBatchItemID() + "] to Batch with BatchID: [" + addBatchItemResponse.getBatch().getBatchID() + "]");
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}
	}

	/**
	 * Runs a CreateBatch operation.
	 * 
	 * @return the ID of the created batch
	 */
	private Long doCreateBatch() {
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
		}

		return tempBatchID;
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

	/**
	 * Prepares an {@link AddBatchItemDetails} based on the parameters provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the {@link AddBatchItemDetails}
	 */
	private AddBatchItemDetails prepareAddBatchItemDetails() {
		final AddBatchItemDetails addBatchItemDetails = new AddBatchItemDetails();

		addBatchItemDetails.setBatchID(batchID);
		addBatchItemDetails.setBatchItemDetailsList(prepareBatchItemDetailsList());

		return addBatchItemDetails;
	}

	/**
	 * Prepares an {@link BatchItemDetailsList} based on the parameters provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the {@link BatchItemDetailsList}
	 */
	private BatchItemDetailsList prepareBatchItemDetailsList() {
		final BatchItemDetailsList batchItemDetailsList = new BatchItemDetailsList();

		batchItemDetailsList.getBatchItemDetails().add(prepareBatchItemDetails());

		return batchItemDetailsList;
	}

	/**
	 * Prepares an {@link BatchItemDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the {@link BatchItemDetails}
	 */
	private BatchItemDetails prepareBatchItemDetails() {
		final BatchItemDetails batchItemDetails = new BatchItemDetails();

		batchItemDetails.setDetails(prepareAddBatchItemProcessingDetails());
		batchItemDetails.setExternalID(externalId);

		return batchItemDetails;
	}

	/**
	 * Prepares an {@link AddBatchItemProcessingDetail} in which we set a {@link PayRequestDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link AddBatchItemProcessingDetails}
	 */
	private AddBatchItemProcessingDetails prepareAddBatchItemProcessingDetails() {
		final AddBatchItemProcessingDetails addBatchItemProcessingDetails = new AddBatchItemProcessingDetails();

		addBatchItemProcessingDetails.setPayRequestDetails(preparePayRequestDetails());

		return addBatchItemProcessingDetails;
	}

	/**
	 * Prepares an {@link PayRequestDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the {@link PayRequestDetails}
	 */
	private PayRequestDetails preparePayRequestDetails() {
		final PayRequestDetails payRequestDetails = new PayRequestDetails();

		payRequestDetails.setAmount(prepareMoney(testData.getPayRequestAmount(), testData.getPayRequestCurrency()));
		payRequestDetails.setOrderDetails(prepareOrderDetails());

		return payRequestDetails;
	}

	/**
	 * Prepares an {@link OrderDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the {@link OrderDetails}
	 */
	private OrderDetails prepareOrderDetails() {
		final OrderDetails orderDetails = new OrderDetails();

		orderDetails.setItemList(new OrderDetailItemList());
		orderDetails.setText(testData.getPayRequestText());

		return orderDetails;
	}
}
