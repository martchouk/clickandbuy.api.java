/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareMoney;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
 * Tests related to AddBatchItem
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class AddBathItemTest extends PayPortParentTest {

	@Autowired
	PayPortTestDataSupplier	payPortTestDataSupplier;

	private Long			batchID	= null;

	/** Test data */
	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("***externalId:" + externalId);

		batchID = doCreateBatch();
	}

	/**
	 * Test the AddBathItem
	 */
	@Test
	public void testAddBatchItem() {
		AddBatchItemResponse addBatchItemResponse = null;

		AddBatchItemRequest addBatchItemRequest = new AddBatchItemRequest();
		addBatchItemRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		addBatchItemRequest.setDetails(prepareAddBatchItemDetails());

		try {
			addBatchItemResponse = payPortType.addBatchItem(addBatchItemRequest);
			logger.debug("Created transaction with Id: " + addBatchItemResponse.getRequestTrackingID());
			logger.debug("Successfully added BatchItem with BatchItemID: " + addBatchItemResponse.getBatchItemList().getBatchItem().get(0).getBatchItemID() + " to Batch with Id: " + addBatchItemResponse.getBatch().getBatchID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}
	}

	private Long doCreateBatch() {
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
	private CreateBatchDetails prepareCreateBatchDetails() {
		CreateBatchDetails createBatchDetails = new CreateBatchDetails();

		createBatchDetails.setExternalBatchID(externalId);

		return createBatchDetails;
	}

	/**
	 * @return
	 */
	private AddBatchItemDetails prepareAddBatchItemDetails() {
		AddBatchItemDetails addBatchItemDetails = new AddBatchItemDetails();

		addBatchItemDetails.setBatchID(batchID);
		addBatchItemDetails.setBatchItemDetailsList(prepareBatchItemDetailsList());

		return addBatchItemDetails;
	}

	private BatchItemDetailsList prepareBatchItemDetailsList() {
		BatchItemDetailsList batchItemDetailsList = new BatchItemDetailsList();

		batchItemDetailsList.getBatchItemDetails().add(prepareBatchItemDetails());

		return batchItemDetailsList;
	}

	/**
	 * Prepares and BatchItemDetails
	 * 
	 * @return
	 */
	private BatchItemDetails prepareBatchItemDetails() {
		BatchItemDetails batchItemDetails = new BatchItemDetails();

		batchItemDetails.setDetails(prepareAddBatchItemProcessingDetails());
		batchItemDetails.setExternalID(externalId);

		return batchItemDetails;

	}

	/**
	 * Prepares an AddBatchItemProcessingDetail. As stated in the WSDL, at this point we can add one of the following:
	 * <ul>
	 * <li>CancelRequestDetails</li>
	 * <li>CreditRequestDetails</li>
	 * <li>PayRequestDetails</li>
	 * <li>PayRequestRecurringDetails</li>
	 * <li>RefundRequestDetails</li>
	 * </ul>
	 * 
	 * For this test we chosen the PayRequestDetails
	 * 
	 * @return
	 */
	private AddBatchItemProcessingDetails prepareAddBatchItemProcessingDetails() {
		AddBatchItemProcessingDetails addBatchItemProcessingDetails = new AddBatchItemProcessingDetails();

		// addBatchItemProcessingDetails.setCancelRequestDetails(value);
		// addBatchItemProcessingDetails.setCreditRequestDetails(value);
		addBatchItemProcessingDetails.setPayRequestDetails(preparePayRequestDetails());
		// addBatchItemProcessingDetails.setPayRequestRecurringDetails(value);
		// addBatchItemProcessingDetails.setRefundRequestDetails(value);

		return addBatchItemProcessingDetails;

	}

	/**
	 * Prepares the soap {@link PayRequest_Request} object from given parameters
	 */
	private PayRequestDetails preparePayRequestDetails() {
		PayRequestDetails payRequestDetails = new PayRequestDetails();

		// Order Details
		OrderDetails order = new OrderDetails();
		order.setItemList(new OrderDetailItemList());
		order.setText(payPortTestDataSupplier.getPayRequestText());

		// Request Details
		payRequestDetails.setAmount(prepareMoney(payPortTestDataSupplier.getPayRequestAmount(), payPortTestDataSupplier.getPayRequestCurrency()));
		payRequestDetails.setAuthExpiration(payPortTestDataSupplier.getPayRequestAuthExpiration());
		payRequestDetails.setBasketRisk(payPortTestDataSupplier.getPayRequestBasketRisk());
		payRequestDetails.setClientRisk(payPortTestDataSupplier.getPayRequestClientRisk());
		payRequestDetails.setConfirmExpiration(payPortTestDataSupplier.getPayRequestConfirmExpiration());
		payRequestDetails.setConsumerCountry(payPortTestDataSupplier.getPayRequestConsumerNation());
		payRequestDetails.setConsumerIPAddress(payPortTestDataSupplier.getPayRequestConsumerIPAddress());
		payRequestDetails.setConsumerLanguage(payPortTestDataSupplier.getPayRequestConsumerLanguage());
		payRequestDetails.setExternalID(externalId);
		payRequestDetails.setFailureURL(payPortTestDataSupplier.getPayRequestFailureURI());
		payRequestDetails.setOrderDetails(order);
		payRequestDetails.setSuccessExpiration(payPortTestDataSupplier.getPayRequestSuccessExpiration());
		payRequestDetails.setSuccessURL(payPortTestDataSupplier.getPayRequestSuccessURI());

		return payRequestDetails;
	}
}
