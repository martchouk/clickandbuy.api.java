package clickandbuy.api.soap.cxf.registrationport.tests;

import java.util.Random;

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
import com.clickandbuy.api.soap.cxf.MerchantRegistrationData;
import com.clickandbuy.api.soap.cxf.MerchantRegistrationSettings;

/**
 * Tests related to CreateMerchantRegistration
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CreateMerchantRegistrationTest extends RegistrationPortParentTest {

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the CreateMerchantRegistration
	 * 
	 * @throws ErrorDetails_Exception
	 *             : thrown in case the merchant registration is not successfull.
	 */
	@Test
	public void testCreateMerchantRegistration() throws ErrorDetails_Exception {
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

	}

	/**
	 * @return
	 */
	public CreateMerchantRegistrationDetails prepareCreateMerchantRegistrationDetails() {
		final CreateMerchantRegistrationDetails createMerchantRegistrationDetails = new CreateMerchantRegistrationDetails();

		// optional values
		// createMerchantRegistrationDetails.setIntegrationData(merchantIntegration);
		final MerchantRegistrationData registrationData = new MerchantRegistrationData();
		registrationData.setCompanyName("testMerchant");
		final Random randomEmailAddressSuffixGenerator = new Random();
		final String suffix = "" + randomEmailAddressSuffixGenerator.nextInt();
		registrationData.setEmailAddress("test" + suffix + "@merchant.com");
		final Address companyAddress = new Address();
		companyAddress.setCity("Cologne");
		companyAddress.setCountry("DE");
		companyAddress.setStreet("Im Mediapark");
		companyAddress.setHouseNumber("5");
		companyAddress.setZip("50670");
		registrationData.setCompanyAddress(companyAddress);
		createMerchantRegistrationDetails.setMerchantData(registrationData);

		final MerchantRegistrationSettings registrationSettings = new MerchantRegistrationSettings();
		registrationSettings.setBusinessOriginID(businessOriginID);
		createMerchantRegistrationDetails.setRegistrationData(registrationSettings);

		return createMerchantRegistrationDetails;
	}
}
