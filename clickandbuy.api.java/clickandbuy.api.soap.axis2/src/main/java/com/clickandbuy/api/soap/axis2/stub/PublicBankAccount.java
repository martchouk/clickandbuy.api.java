
package com.clickandbuy.api.soap.axis2.stub;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * bank account
 * 
 * <p>Java class for PublicBankAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicBankAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Country" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BankName" minOccurs="0"/>
 *         &lt;element name="accountHolder" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}AccountHolder"/>
 *         &lt;element name="bankAccountType" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BankAccountType"/>
 *         &lt;element name="limit" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}AccountLimit" minOccurs="0"/>
 *         &lt;element name="accountDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}PublicAccountDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicBankAccount", propOrder = {
    "country",
    "bankName",
    "accountHolder",
    "bankAccountType",
    "limit",
    "accountDetails"
})
public class PublicBankAccount {

    protected String country;
    protected String bankName;
    @XmlElement(required = true)
    protected String accountHolder;
    @XmlElement(required = true)
    protected BankAccountType bankAccountType;
    protected BigDecimal limit;
    @XmlElement(required = true)
    protected PublicAccountDetails accountDetails;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the accountHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Sets the value of the accountHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolder(String value) {
        this.accountHolder = value;
    }

    /**
     * Gets the value of the bankAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountType }
     *     
     */
    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Sets the value of the bankAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountType }
     *     
     */
    public void setBankAccountType(BankAccountType value) {
        this.bankAccountType = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimit(BigDecimal value) {
        this.limit = value;
    }

    /**
     * Gets the value of the accountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PublicAccountDetails }
     *     
     */
    public PublicAccountDetails getAccountDetails() {
        return accountDetails;
    }

    /**
     * Sets the value of the accountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicAccountDetails }
     *     
     */
    public void setAccountDetails(PublicAccountDetails value) {
        this.accountDetails = value;
    }

}
