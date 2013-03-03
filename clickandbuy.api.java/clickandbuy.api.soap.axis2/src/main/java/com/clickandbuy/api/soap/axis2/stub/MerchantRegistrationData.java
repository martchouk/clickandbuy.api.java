
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the known data for the Merchant to prefill the Registration
 * 
 * <p>Java class for MerchantRegistrationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantRegistrationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyName" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CompanyName"/>
 *         &lt;element name="vatID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}VatID" minOccurs="0"/>
 *         &lt;element name="companyAddress" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Address" minOccurs="0"/>
 *         &lt;element name="countryOfIncorporation" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Country" minOccurs="0"/>
 *         &lt;element name="dateOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="companyType" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CompanyType" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Email"/>
 *         &lt;element name="website" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}URL" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}TimeZone" minOccurs="0"/>
 *         &lt;element name="telephoneNumber" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}TelephoneNumber" minOccurs="0"/>
 *         &lt;element name="language" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Language" minOccurs="0"/>
 *         &lt;element name="adminFirstName" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}FirstName" minOccurs="0"/>
 *         &lt;element name="adminMiddleName" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}LastName" minOccurs="0"/>
 *         &lt;element name="adminLastName" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}LastName" minOccurs="0"/>
 *         &lt;element name="adminGender" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Gender" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantRegistrationData", propOrder = {
    "companyName",
    "vatID",
    "companyAddress",
    "countryOfIncorporation",
    "dateOfIncorporation",
    "companyType",
    "emailAddress",
    "website",
    "timeZone",
    "telephoneNumber",
    "language",
    "adminFirstName",
    "adminMiddleName",
    "adminLastName",
    "adminGender"
})
public class MerchantRegistrationData {

    @XmlElement(required = true)
    protected String companyName;
    protected String vatID;
    protected Address companyAddress;
    protected String countryOfIncorporation;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfIncorporation;
    protected CompanyType companyType;
    @XmlElement(required = true)
    protected String emailAddress;
    protected String website;
    protected String timeZone;
    protected TelephoneNumber telephoneNumber;
    protected String language;
    protected String adminFirstName;
    protected String adminMiddleName;
    protected String adminLastName;
    protected Gender adminGender;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the vatID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatID() {
        return vatID;
    }

    /**
     * Sets the value of the vatID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatID(String value) {
        this.vatID = value;
    }

    /**
     * Gets the value of the companyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCompanyAddress() {
        return companyAddress;
    }

    /**
     * Sets the value of the companyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCompanyAddress(Address value) {
        this.companyAddress = value;
    }

    /**
     * Gets the value of the countryOfIncorporation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfIncorporation() {
        return countryOfIncorporation;
    }

    /**
     * Sets the value of the countryOfIncorporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfIncorporation(String value) {
        this.countryOfIncorporation = value;
    }

    /**
     * Gets the value of the dateOfIncorporation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfIncorporation() {
        return dateOfIncorporation;
    }

    /**
     * Sets the value of the dateOfIncorporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfIncorporation(XMLGregorianCalendar value) {
        this.dateOfIncorporation = value;
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setCompanyType(CompanyType value) {
        this.companyType = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setTelephoneNumber(TelephoneNumber value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the adminFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminFirstName() {
        return adminFirstName;
    }

    /**
     * Sets the value of the adminFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminFirstName(String value) {
        this.adminFirstName = value;
    }

    /**
     * Gets the value of the adminMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminMiddleName() {
        return adminMiddleName;
    }

    /**
     * Sets the value of the adminMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminMiddleName(String value) {
        this.adminMiddleName = value;
    }

    /**
     * Gets the value of the adminLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLastName() {
        return adminLastName;
    }

    /**
     * Sets the value of the adminLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLastName(String value) {
        this.adminLastName = value;
    }

    /**
     * Gets the value of the adminGender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getAdminGender() {
        return adminGender;
    }

    /**
     * Sets the value of the adminGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setAdminGender(Gender value) {
        this.adminGender = value;
    }

}
