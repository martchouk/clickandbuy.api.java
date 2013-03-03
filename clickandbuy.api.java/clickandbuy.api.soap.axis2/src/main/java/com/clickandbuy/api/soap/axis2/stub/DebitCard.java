
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * debit card
 * 
 * <p>Java class for DebitCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebitCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brand" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}DebitCardBrand" minOccurs="0"/>
 *         &lt;element name="cardHolder" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CardHolder"/>
 *         &lt;element name="dateOfBirth" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Date" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}DebitCardNumber"/>
 *         &lt;element name="issueNumber" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}IssueNumber" minOccurs="0"/>
 *         &lt;element name="CSC" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CSC" minOccurs="0"/>
 *         &lt;element name="expiry" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExpiryDate"/>
 *         &lt;element name="start" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}StartDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitCard", propOrder = {
    "brand",
    "cardHolder",
    "dateOfBirth",
    "cardNumber",
    "issueNumber",
    "csc",
    "expiry",
    "start"
})
public class DebitCard {

    protected DebitCardBrand brand;
    @XmlElement(required = true)
    protected String cardHolder;
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(required = true)
    protected String cardNumber;
    protected String issueNumber;
    @XmlElement(name = "CSC")
    protected String csc;
    @XmlElement(required = true)
    protected ExpiryDate expiry;
    protected StartDate start;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCardBrand }
     *     
     */
    public DebitCardBrand getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCardBrand }
     *     
     */
    public void setBrand(DebitCardBrand value) {
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
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
    }

    /**
     * Gets the value of the csc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSC() {
        return csc;
    }

    /**
     * Sets the value of the csc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSC(String value) {
        this.csc = value;
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

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link StartDate }
     *     
     */
    public StartDate getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDate }
     *     
     */
    public void setStart(StartDate value) {
        this.start = value;
    }

}
