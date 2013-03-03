
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about a Merchant Registration
 * 
 * <p>Java class for MerchantRegistrationIDStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantRegistrationIDStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="registrationStatus" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}MerchantRegistrationStatus"/>
 *         &lt;element name="registrationSharedSecret" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}MerchantRegistrationSharedSecret" minOccurs="0"/>
 *         &lt;element name="registrationURL" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}URL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantRegistrationIDStatus", propOrder = {
    "merchantID",
    "registrationStatus",
    "registrationSharedSecret",
    "registrationURL"
})
public class MerchantRegistrationIDStatus {

    protected long merchantID;
    @XmlElement(required = true)
    protected MerchantRegistrationStatus registrationStatus;
    protected String registrationSharedSecret;
    protected String registrationURL;

    /**
     * Gets the value of the merchantID property.
     * 
     */
    public long getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     */
    public void setMerchantID(long value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantRegistrationStatus }
     *     
     */
    public MerchantRegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantRegistrationStatus }
     *     
     */
    public void setRegistrationStatus(MerchantRegistrationStatus value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the registrationSharedSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationSharedSecret() {
        return registrationSharedSecret;
    }

    /**
     * Sets the value of the registrationSharedSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationSharedSecret(String value) {
        this.registrationSharedSecret = value;
    }

    /**
     * Gets the value of the registrationURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationURL() {
        return registrationURL;
    }

    /**
     * Sets the value of the registrationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationURL(String value) {
        this.registrationURL = value;
    }

}
