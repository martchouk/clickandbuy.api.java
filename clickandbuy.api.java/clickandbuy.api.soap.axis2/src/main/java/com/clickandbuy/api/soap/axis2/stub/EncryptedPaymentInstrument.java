
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * encrypted payment instrument
 * 
 * <p>Java class for EncryptedPaymentInstrument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptedPaymentInstrument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Token"/>
 *         &lt;element name="searchValue" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Token" minOccurs="0"/>
 *         &lt;element name="displayValue" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}DisplayValue" minOccurs="0"/>
 *         &lt;element name="publicPaymentInstrumentDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}PublicPaymentInstrumentDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedPaymentInstrument", propOrder = {
    "token",
    "searchValue",
    "displayValue",
    "publicPaymentInstrumentDetails"
})
public class EncryptedPaymentInstrument {

    @XmlElement(required = true)
    protected String token;
    protected String searchValue;
    protected String displayValue;
    protected PublicPaymentInstrumentDetails publicPaymentInstrumentDetails;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the searchValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchValue() {
        return searchValue;
    }

    /**
     * Sets the value of the searchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchValue(String value) {
        this.searchValue = value;
    }

    /**
     * Gets the value of the displayValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * Sets the value of the displayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayValue(String value) {
        this.displayValue = value;
    }

    /**
     * Gets the value of the publicPaymentInstrumentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PublicPaymentInstrumentDetails }
     *     
     */
    public PublicPaymentInstrumentDetails getPublicPaymentInstrumentDetails() {
        return publicPaymentInstrumentDetails;
    }

    /**
     * Sets the value of the publicPaymentInstrumentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicPaymentInstrumentDetails }
     *     
     */
    public void setPublicPaymentInstrumentDetails(PublicPaymentInstrumentDetails value) {
        this.publicPaymentInstrumentDetails = value;
    }

}
