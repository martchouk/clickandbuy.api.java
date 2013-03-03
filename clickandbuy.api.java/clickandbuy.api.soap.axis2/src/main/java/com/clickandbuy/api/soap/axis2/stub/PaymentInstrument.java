
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * payment instrument (card or account)
 * 
 * <p>Java class for PaymentInstrument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInstrument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encryptedPaymentInstrument" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}EncryptedPaymentInstrument" minOccurs="0"/>
 *         &lt;element name="creditCard" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CreditCard" minOccurs="0"/>
 *         &lt;element name="debitCard" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}DebitCard" minOccurs="0"/>
 *         &lt;element name="bankAccount" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BankAccount" minOccurs="0"/>
 *         &lt;element name="targetBankAccount" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}TargetBankAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument", propOrder = {
    "encryptedPaymentInstrument",
    "creditCard",
    "debitCard",
    "bankAccount",
    "targetBankAccount"
})
public class PaymentInstrument {

    protected EncryptedPaymentInstrument encryptedPaymentInstrument;
    protected CreditCard creditCard;
    protected DebitCard debitCard;
    protected BankAccount bankAccount;
    protected TargetBankAccount targetBankAccount;

    /**
     * Gets the value of the encryptedPaymentInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedPaymentInstrument }
     *     
     */
    public EncryptedPaymentInstrument getEncryptedPaymentInstrument() {
        return encryptedPaymentInstrument;
    }

    /**
     * Sets the value of the encryptedPaymentInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedPaymentInstrument }
     *     
     */
    public void setEncryptedPaymentInstrument(EncryptedPaymentInstrument value) {
        this.encryptedPaymentInstrument = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the debitCard property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCard }
     *     
     */
    public DebitCard getDebitCard() {
        return debitCard;
    }

    /**
     * Sets the value of the debitCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCard }
     *     
     */
    public void setDebitCard(DebitCard value) {
        this.debitCard = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBankAccount(BankAccount value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the targetBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link TargetBankAccount }
     *     
     */
    public TargetBankAccount getTargetBankAccount() {
        return targetBankAccount;
    }

    /**
     * Sets the value of the targetBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetBankAccount }
     *     
     */
    public void setTargetBankAccount(TargetBankAccount value) {
        this.targetBankAccount = value;
    }

}
