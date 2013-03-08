/**
 * 
 */
package clickandbuy.api.soap.cxf.registrationport.data;

import org.springframework.beans.factory.annotation.Value;

import com.clickandbuy.api.soap.cxf.RegistrationPortType;

/**
 * Holds all necessary test data for {@link RegistrationPortType} related tests.
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class RegistrationPortTestDataSupplier {

	/**
	 * CreateMerchantRegistrationDetails Test data
	 */

	/** The company name of the merchant for the create merchant registration request */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.companyName}")
	private String	merchantCompanyName;

	/** The city of the merchant for the create merchant registration request */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.city}")
	private String	merchantCity;

	/** The country of the merchant for the create merchant registration request */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.country}")
	private String	merchantCountry;

	/** The street of the merchant for the create merchant registration request */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.street}")
	private String	merchantStreet;

	/** The house number of the merchant for the create merchant registration request */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.houseNumber}")
	private String	merchantHouseNumber;

	/** The zip code of the merchant for the create merchant registration request */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.zipCode}")
	private String	merchantZipCode;

	/** The email address of the merchant for the create merchant registration request */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.emailAddress}")
	private String	merchantEmailAddress;

	/**
	 * @return the merchantCompanyName
	 */
	public String getMerchantCompanyName() {
		return merchantCompanyName;
	}

	/**
	 * @return the merchantCity
	 */
	public String getMerchantCity() {
		return merchantCity;
	}

	/**
	 * @return the merchantCountry
	 */
	public String getMerchantCountry() {
		return merchantCountry;
	}

	/**
	 * @return the merchantStreet
	 */
	public String getMerchantStreet() {
		return merchantStreet;
	}

	/**
	 * @return the merchantHouseNumber
	 */
	public String getMerchantHouseNumber() {
		return merchantHouseNumber;
	}

	/**
	 * @return the merchantZipCode
	 */
	public String getMerchantZipCode() {
		return merchantZipCode;
	}

	/**
	 * @return the merchantEmailAddress
	 */
	public String getMerchantEmailAddress() {
		return merchantEmailAddress;
	}

}
