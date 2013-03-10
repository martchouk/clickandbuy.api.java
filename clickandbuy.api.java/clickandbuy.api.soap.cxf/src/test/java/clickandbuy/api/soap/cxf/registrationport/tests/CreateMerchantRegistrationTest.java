/**
 * 
 */
package clickandbuy.api.soap.cxf.registrationport.tests;

import java.util.Random;

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

	/**
	 * class logger.
	 */
	private static final Logger	logger	= Logger.getLogger(CreateMerchantRegistrationTest.class);

	/**
	 * test setup.
	 */
	@Before
	public void setUp() {
		configureCertificatesPolicy();
	}

	/**
	 * Test the CreateMerchantRegistration operation.
	 * 
	 * @throws ErrorDetails_Exception
	 *             if during communication (between the client API implementation and the ClickandBuy API system) the communication is disturbed or a logical or technical error occurs. The response from ClickandBuy system contains detailed
	 *             error messages which facilitate the localization and eradication of the problem.
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
	 * Prepares an {@link CreateMerchantRegistrationDetails} based on the previously created batch
	 * 
	 * @return the {@link CreateMerchantRegistrationDetails}
	 */
	private CreateMerchantRegistrationDetails prepareCreateMerchantRegistrationDetails() {
		final CreateMerchantRegistrationDetails createMerchantRegistrationDetails = new CreateMerchantRegistrationDetails();

		final MerchantRegistrationData registrationData = new MerchantRegistrationData();
		registrationData.setCompanyName(testData.getMerchantCompanyName());

		// FIX for not registering the same merchant email address too many times.
		final Random randomEmailAddressSuffixGenerator = new Random();
		final String suffix = "" + randomEmailAddressSuffixGenerator.nextInt();
		registrationData.setEmailAddress("merchant" + suffix + "@merchant.com");
		// REMOVE the FIX above when performing the merchant registration for each email at a time.
		// registrationData.setEmailAddress(testData.getMerchantEmailAddress());
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
