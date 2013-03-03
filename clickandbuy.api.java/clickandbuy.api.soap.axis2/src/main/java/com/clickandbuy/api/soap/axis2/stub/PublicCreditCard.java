
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * credit card
 * 
 * <p>Java class for PublicCreditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicCreditCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brand" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CreditCardBrand" minOccurs="0"/>
 *         &lt;element name="cardHolder" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CardHolder"/>
 *         &lt;element name="dateOfBirth" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Date" minOccurs="0"/>
 *         &lt;element name="expiry" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExpiryDate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicCreditCard", propOrder = {
    "brand",
    "cardHolder",
    "dateOfBirth",
    "expiry"
})
public class PublicCreditCard {

    protected CreditCardBrand brand;
    @XmlElement(required = true)
    protected String cardHolder;
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(required = true)
    protected ExpiryDate expiry;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardBrand }
     *     
     */
    public CreditCardBrand getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardBrand }
     *     
     */
    public void setBrand(CreditCardBrand value) {
        this.brand = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the expiry property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDate }
     *     
     */
    public ExpiryDate getExpiry() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDate }
     *     
     */
    public void setExpiry(ExpiryDate value) {
        this.expiry = value;
    }

}