
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for CreditRequest details
 * 
 * <p>Java class for CreditRequestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditRequestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="amount" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Money"/>
 *         &lt;element name="recipient" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CreditRecipientIdentifier"/>
 *         &lt;element name="consumerLanguage" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Language" minOccurs="0"/>
 *         &lt;element name="orderDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}OrderDetails" minOccurs="0"/>
 *         &lt;element name="externalID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExternalID" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditRequestDetails", propOrder = {

})
public class CreditRequestDetails {

    @XmlElement(required = true)
    protected Money amount;
    @XmlElement(required = true)
    protected CreditRecipientIdentifier recipient;
    protected String consumerLanguage;
    protected OrderDetails orderDetails;
    protected String externalID;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRecipientIdentifier }
     *     
     */
    public CreditRecipientIdentifier getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRecipientIdentifier }
     *     
     */
    public void setRecipient(CreditRecipientIdentifier value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the consumerLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerLanguage() {
        return consumerLanguage;
    }

    /**
     * Sets the value of the consumerLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerLanguage(String value) {
        this.consumerLanguage = value;
    }

    /**
     * Gets the value of the orderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetails }
     *     
     */
    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    /**
     * Sets the value of the orderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetails }
     *     
     */
    public void setOrderDetails(OrderDetails value) {
        this.orderDetails = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

}
