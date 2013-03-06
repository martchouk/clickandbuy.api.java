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
	 * @param merchantCompanyName
	 *            the merchantCompanyName to set
	 */
	public void setMerchantCompanyName(final String merchantCompanyName) {
		this.merchantCompanyName = merchantCompanyName;
	}

	/**
	 * @return the merchantCity
	 */
	public String getMerchantCity() {
		return merchantCity;
	}

	/**
	 * @param merchantCity
	 *            the merchantCity to set
	 */
	public void setMerchantCity(final String merchantCity) {
		this.merchantCity = merchantCity;
	}

	/**
	 * @return the merchantCountry
	 */
	public String getMerchantCountry() {
		return merchantCountry;
	}

	/**
	 * @param merchantCountry
	 *            the merchantCountry to set
	 */
	public void setMerchantCountry(final String merchantCountry) {
		this.merchantCountry = merchantCountry;
	}

	/**
	 * @return the merchantStreet
	 */
	public String getMerchantStreet() {
		return merchantStreet;
	}

	/**
	 * @param merchantStreet
	 *            the merchantStreet to set
	 */
	public void setMerchantStreet(final String merchantStreet) {
		this.merchantStreet = merchantStreet;
	}

	/**
	 * @return the merchantHouseNumber
	 */
	public String getMerchantHouseNumber() {
		return merchantHouseNumber;
	}

	/**
	 * @param merchantHouseNumber
	 *            the merchantHouseNumber to set
	 */
	public void setMerchantHouseNumber(final String merchantHouseNumber) {
		this.merchantHouseNumber = merchantHouseNumber;
	}

	/**
	 * @return the merchantZipCode
	 */
	public String getMerchantZipCode() {
		return merchantZipCode;
	}

	/**
	 * @param merchantZipCode
	 *            the merchantZipCode to set
	 */
	public void setMerchantZipCode(final String merchantZipCode) {
		this.merchantZipCode = merchantZipCode;
	}

	/**
	 * @return the merchantEmailAddress
	 */
	public String getMerchantEmailAddress() {
		return merchantEmailAddress;
	}

	/**
	 * @param merchantEmailAddress the merchantEmailAddress to set
	 */
	public void setMerchantEmailAddress(String merchantEmailAddress) {
		this.merchantEmailAddress = merchantEmailAddress;
	}

}
