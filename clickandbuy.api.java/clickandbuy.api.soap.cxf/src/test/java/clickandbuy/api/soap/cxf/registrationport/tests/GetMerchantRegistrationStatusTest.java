package clickandbuy.api.soap.cxf.registrationport.tests;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.registrationport.parent.RegistrationPortParentTest;

import com.clickandbuy.api.soap.cxf.Address;
import com.clickandbuy.api.soap.cxf.CreateMerchantRegistrationDetails;
import com.clickandbuy.api.soap.cxf.CreateMerchantRegistrationRequest;
import com.clickandbuy.api.soap.cxf.CreateMerchantRegistrationResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetMerchantRegistrationStatusDetails;
import com.clickandbuy.api.soap.cxf.GetMerchantRegistrationStatusRequest;
import com.clickandbuy.api.soap.cxf.GetMerchantRegistrationStatusResponse;
import com.clickandbuy.api.soap.cxf.MerchantRegistrationData;
import com.clickandbuy.api.soap.cxf.MerchantRegistrationSettings;

/**
 * Tests related to GetMerchantRegistrationStatus
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetMerchantRegistrationStatusTest extends RegistrationPortParentTest {

	/**
	 * class logger.
	 */
	private static final Logger	logger	= Logger.getLogger(GetMerchantRegistrationStatusTest.class);

	/**
	 * test setup.
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the AddBathItem
	 * 
	 * @throws ErrorDetails_Exception
	 */
	@Test
	public void testGetMerchantRegistrationStatus() throws ErrorDetails_Exception {

		CreateMerchantRegistrationResponse createMerchantRegistrationResponse = null;

		final CreateMerchantRegistrationRequest createMerchantRegistrationRequest = new CreateMerchantRegistrationRequest();
		createMerchantRegistrationRequest.setDetails(prepareCreateMerchantRegistrationDetails());

		try {
			createMerchantRegistrationResponse = registrationPortType.createMerchantRegistration(createMerchantRegistrationRequest);
			logger.debug("Created transaction with Id: " + createMerchantRegistrationResponse.getRequestTrackingID());
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}

		GetMerchantRegistrationStatusResponse getMerchantRegistrationStatusResponse = null;

		final GetMerchantRegistrationStatusRequest registrationStatusReq = new GetMerchantRegistrationStatusRequest();
		registrationStatusReq.setDetails(prepareGetMerchantRegistrationStatusDetails(createMerchantRegistrationResponse));

		try {
			getMerchantRegistrationStatusResponse = registrationPortType.getMerchantRegistrationStatus(registrationStatusReq);
			logger.debug("Created transaction with Id: " + getMerchantRegistrationStatusResponse.getRequestTrackingID());
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}
	}

	/**
	 * Prepare get merchant registration status request.
	 * 
	 * @param createMerchantRegistrationResponse
	 * @return
	 */
	private GetMerchantRegistrationStatusDetails prepareGetMerchantRegistrationStatusDetails(final CreateMerchantRegistrationResponse createMerchantRegistrationResponse) {
		final GetMerchantRegistrationStatusDetails getMerchantRegistrationStatusDetails = new GetMerchantRegistrationStatusDetails();

		getMerchantRegistrationStatusDetails.setBusinessOriginID(businessOriginID);
		final long createdMerchantId = createMerchantRegistrationResponse.getRegistrationInfo().getMerchantID();
		final String createdMerchantSharedSecret = createMerchantRegistrationResponse.getRegistrationInfo().getRegistrationSharedSecret();
		getMerchantRegistrationStatusDetails.setMerchantID(createdMerchantId);
		getMerchantRegistrationStatusDetails.setToken(signatureHandler.createMerchantRegistrationToken(businessOriginID, createdMerchantId, createdMerchantSharedSecret));

		return getMerchantRegistrationStatusDetails;
	}

	/**
	 * Prepare create merchant registration request.
	 * 
	 * @return
	 */
	private CreateMerchantRegistrationDetails prepareCreateMerchantRegistrationDetails() {
		final CreateMerchantRegistrationDetails createMerchantRegistrationDetails = new CreateMerchantRegistrationDetails();

		// optional values
		// createMerchantRegistrationDetails.setIntegrationData(merchantIntegration);
		final MerchantRegistrationData registrationData = new MerchantRegistrationData();
		registrationData.setCompanyName(testData.getMerchantCompanyName());
		/*
		 * final Random randomEmailAddressSuffixGenerator = new Random(); final String suffix = "" + randomEmailAddressSuffixGenerator.nextInt(); registrationData.setEmailAddress("test" + suffix + "@merchant.com");
		 */
		registrationData.setEmailAddress(testData.getMerchantEmailAddress());
		final Address companyAddress = new Address();
		companyAddress.setCity(testData.getMerchantCity());
		companyAddress.setCountry(testData.getMerchantCountry());
		companyAddress.setStreet(testData.getMerchantStreet());
		companyAddress.setHouseNumber(testData.getMerchantHouseNumber());
		companyAddress.setZip(testData.getMerchantZipCode());
		registrationData.setCompanyAddress(companyAddress);
		createMerchantRegistrationDetails.setMerchantData(registrationData);

		final MerchantRegistrationSettings registrationSettings = new MerchantRegistrationSettings();
		registrationSettings.setBusinessOriginID(businessOriginID);
		createMerchantRegistrationDetails.setRegistrationData(registrationSettings);

		return createMerchantRegistrationDetails;
	}
}
