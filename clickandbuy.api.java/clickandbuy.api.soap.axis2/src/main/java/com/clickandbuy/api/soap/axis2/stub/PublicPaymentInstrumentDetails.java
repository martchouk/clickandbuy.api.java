
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * public payment instrument details
 * 
 * <p>Java class for PublicPaymentInstrumentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicPaymentInstrumentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="creditCard" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}PublicCreditCard" minOccurs="0"/>
 *         &lt;element name="debitCard" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}PublicDebitCard" minOccurs="0"/>
 *         &lt;element name="bankAccount" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}PublicBankAccount" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicPaymentInstrumentDetails", propOrder = {
    "creditCard",
    "debitCard",
    "bankAccount"
})
public class PublicPaymentInstrumentDetails {

    protected PublicCreditCard creditCard;
    protected PublicDebitCard debitCard;
    protected PublicBankAccount bankAccount;

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link PublicCreditCard }
     *     
     */
    public PublicCreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCreditCard }
     *     
     */
    public void setCreditCard(PublicCreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the debitCard property.
     * 
     * @return
     *     possible object is
     *     {@link PublicDebitCard }
     *     
     */
    public PublicDebitCard getDebitCard() {
        return debitCard;
    }

    /**
     * Sets the value of the debitCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicDebitCard }
     *     
     */
    public void setDebitCard(PublicDebitCard value) {
        this.debitCard = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link PublicBankAccount }
     *     
     */
    public PublicBankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicBankAccount }
     *     
     */
    public void setBankAccount(PublicBankAccount value) {
        this.bankAccount = value;
    }

}
