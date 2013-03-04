package clickandbuy.api.soap.cxf.registrationport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetMerchantRegistrationStatusDetails;
import com.clickandbuy.api.soap.cxf.GetMerchantRegistrationStatusRequest;
import com.clickandbuy.api.soap.cxf.GetMerchantRegistrationStatusResponse;

/**
 * Tests related to GetMerchantRegistrationStatus
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetMerchantRegistrationStatusTest extends RegistrationPortParentTest {

	/** Test data */
	@Value("${merchantId}")
	private long	merchantId;
	
	/** Test data */
	@Value("${projectId}")
	private long	businessOriginId;
	
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
		GetMerchantRegistrationStatusResponse getMerchantRegistrationStatusResponse = null;

		GetMerchantRegistrationStatusRequest addBatchItemRequest = new GetMerchantRegistrationStatusRequest();
		addBatchItemRequest.setDetails(prepareGetMerchantRegistrationStatusDetails());

		try {
			getMerchantRegistrationStatusResponse = registrationPortType.getMerchantRegistrationStatus(addBatchItemRequest);
			logger.debug("Created transaction with Id: " + getMerchantRegistrationStatusResponse.getRequestTrackingID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}
		
		//TODO finish test logic
	}

	/**
	 * @return
	 */
	public GetMerchantRegistrationStatusDetails prepareGetMerchantRegistrationStatusDetails() {
		GetMerchantRegistrationStatusDetails getMerchantRegistrationStatusDetails = new GetMerchantRegistrationStatusDetails();

		// TODO fill in necessary test data
		
		getMerchantRegistrationStatusDetails.setBusinessOriginID(businessOriginId + "");
		getMerchantRegistrationStatusDetails.setMerchantID(merchantId);
		getMerchantRegistrationStatusDetails.setToken(getAuthenticationToken(businessOriginId, secretKey));

		return getMerchantRegistrationStatusDetails;
	}
}
