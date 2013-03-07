/**
 * 
 */
package clickandbuy.api.soap.cxf.registrationport.data;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
public class RegistrationPortTestDataSupplier {

	/**
	 * merchant company name.
	 */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.companyName}")
	private String	merchantCompanyName;

	/**
	 * merchant city.
	 */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.city}")
	private String	merchantCity;

	/**
	 * merchant country.
	 */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.country}")
	private String	merchantCountry;

	/**
	 * merchant street address.
	 */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.street}")
	private String	merchantStreet;

	/**
	 * merchant House number.
	 */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.houseNumber}")
	private String	merchantHouseNumber;

	/**
	 * merchant Zip Code.
	 */
	@Value("${createMerchantRegistration.createMerchantRegistrationDetails.merchant.zipCode}")
	private String	merchantZipCode;

	/**
	 * merchant Zip Code.
	 */
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
