package clickandbuy.api.soap.cxf.registrationport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.registrationport.parent.RegistrationPortParentTest;

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

		GetMerchantRegistrationStatusRequest registrationStatusReq = new GetMerchantRegistrationStatusRequest();
		registrationStatusReq.setDetails(prepareGetMerchantRegistrationStatusDetails());

		try {
			getMerchantRegistrationStatusResponse = registrationPortType.getMerchantRegistrationStatus(registrationStatusReq);
			logger.debug("Created transaction with Id: " + getMerchantRegistrationStatusResponse.getRequestTrackingID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}
	}

	/**
	 * @return
	 */
	public GetMerchantRegistrationStatusDetails prepareGetMerchantRegistrationStatusDetails() {
		final GetMerchantRegistrationStatusDetails getMerchantRegistrationStatusDetails = new GetMerchantRegistrationStatusDetails();

		getMerchantRegistrationStatusDetails.setBusinessOriginID(businessOriginID);
		getMerchantRegistrationStatusDetails.setMerchantID(merchantId);
		getMerchantRegistrationStatusDetails.setToken(signatureHandler.createMerchantRegistrationToken(businessOriginID, merchantId, secretKey));

		return getMerchantRegistrationStatusDetails;
	}
}
