package clickandbuy.api.soap.cxf.registrationport.tests;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.apache.xerces.impl.xs.identity.UniqueOrKey;
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
import com.clickandbuy.api.util.auth.CabApiUniqueDateFormat;

/**
 * Tests related to CreateMerchantRegistration
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CreateMerchantRegistrationTest extends RegistrationPortParentTest {

	/** Test data */

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the CreateMerchantRegistration
	 * @throws ErrorDetails_Exception : thrown in case the merchant registration is not successfull.
	 */
	@Test
	public void testCreateMerchantRegistration() throws ErrorDetails_Exception {
		CreateMerchantRegistrationResponse createMerchantRegistrationResponse = null;

		CreateMerchantRegistrationRequest createMerchantRegistrationRequest = new CreateMerchantRegistrationRequest();
		createMerchantRegistrationRequest.setDetails(prepareCreateMerchantRegistrationDetails());

		try {
			createMerchantRegistrationResponse = registrationPortType.createMerchantRegistration(createMerchantRegistrationRequest);
			logger.debug("Created transaction with Id: " + createMerchantRegistrationResponse.getRequestTrackingID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public CreateMerchantRegistrationDetails prepareCreateMerchantRegistrationDetails() {
		CreateMerchantRegistrationDetails createMerchantRegistrationDetails = new CreateMerchantRegistrationDetails();

		//optional values
		//createMerchantRegistrationDetails.setIntegrationData(merchantIntegration);
		final MerchantRegistrationData registrationData = new MerchantRegistrationData();
		registrationData.setCompanyName("testMerchant");
		final Random randomEmailAddressSuffixGenerator = new Random();
		String suffix = "" + randomEmailAddressSuffixGenerator.nextInt();
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
