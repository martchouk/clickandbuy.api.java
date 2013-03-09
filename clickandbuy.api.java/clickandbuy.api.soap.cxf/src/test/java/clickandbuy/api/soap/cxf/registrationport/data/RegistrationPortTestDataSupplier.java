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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RegistrationPortTestDataSupplier [merchantCompanyName=" + merchantCompanyName + ", merchantCity=" + merchantCity + ", merchantCountry=" + merchantCountry + ", merchantStreet=" + merchantStreet + ", merchantHouseNumber="
				+ merchantHouseNumber + ", merchantZipCode=" + merchantZipCode + ", merchantEmailAddress=" + merchantEmailAddress + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((merchantCity == null) ? 0 : merchantCity.hashCode());
		result = prime * result + ((merchantCompanyName == null) ? 0 : merchantCompanyName.hashCode());
		result = prime * result + ((merchantCountry == null) ? 0 : merchantCountry.hashCode());
		result = prime * result + ((merchantEmailAddress == null) ? 0 : merchantEmailAddress.hashCode());
		result = prime * result + ((merchantHouseNumber == null) ? 0 : merchantHouseNumber.hashCode());
		result = prime * result + ((merchantStreet == null) ? 0 : merchantStreet.hashCode());
		result = prime * result + ((merchantZipCode == null) ? 0 : merchantZipCode.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		RegistrationPortTestDataSupplier other = (RegistrationPortTestDataSupplier) obj;
		if (merchantCity == null) {
			if (other.merchantCity != null) {
				return false;
			}
		} else if (!merchantCity.equals(other.merchantCity)) {
			return false;
		}
		if (merchantCompanyName == null) {
			if (other.merchantCompanyName != null) {
				return false;
			}
		} else if (!merchantCompanyName.equals(other.merchantCompanyName)) {
			return false;
		}
		if (merchantCountry == null) {
			if (other.merchantCountry != null) {
				return false;
			}
		} else if (!merchantCountry.equals(other.merchantCountry)) {
			return false;
		}
		if (merchantEmailAddress == null) {
			if (other.merchantEmailAddress != null) {
				return false;
			}
		} else if (!merchantEmailAddress.equals(other.merchantEmailAddress)) {
			return false;
		}
		if (merchantHouseNumber == null) {
			if (other.merchantHouseNumber != null) {
				return false;
			}
		} else if (!merchantHouseNumber.equals(other.merchantHouseNumber)) {
			return false;
		}
		if (merchantStreet == null) {
			if (other.merchantStreet != null) {
				return false;
			}
		} else if (!merchantStreet.equals(other.merchantStreet)) {
			return false;
		}
		if (merchantZipCode == null) {
			if (other.merchantZipCode != null) {
				return false;
			}
		} else if (!merchantZipCode.equals(other.merchantZipCode)) {
			return false;
		}
		return true;
	}

}
