
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for PayRequest details
 * 
 * <p>Java class for PayRequestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayRequestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="amount" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Money"/>
 *         &lt;element name="orderDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}OrderDetails" minOccurs="0"/>
 *         &lt;element name="billing" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}LegalEntity" minOccurs="0"/>
 *         &lt;element name="shipping" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}LegalEntity" minOccurs="0"/>
 *         &lt;element name="basketRisk" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RiskScore" minOccurs="0"/>
 *         &lt;element name="clientRisk" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RiskScore" minOccurs="0"/>
 *         &lt;element name="authExpiration" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExpirationTime" minOccurs="0"/>
 *         &lt;element name="confirmExpiration" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExpirationTime" minOccurs="0"/>
 *         &lt;element name="successExpiration" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExpirationTime" minOccurs="0"/>
 *         &lt;element name="successURL" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}URL" minOccurs="0"/>
 *         &lt;element name="failureURL" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}URL" minOccurs="0"/>
 *         &lt;element name="createRecurring" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RecurringPaymentAuthorization" minOccurs="0"/>
 *         &lt;element name="externalID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExternalID" minOccurs="0"/>
 *         &lt;element name="consumerIPAddress" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}IPAddress" minOccurs="0"/>
 *         &lt;element name="consumerLanguage" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Language" minOccurs="0"/>
 *         &lt;element name="consumerCountry" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Country" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayRequestDetails", propOrder = {

})
public class PayRequestDetails {

    @XmlElement(required = true)
    protected Money amount;
    protected OrderDetails orderDetails;
    protected LegalEntity billing;
    protected LegalEntity shipping;
    protected Integer basketRisk;
    protected Integer clientRisk;
    protected Integer authExpiration;
    protected Integer confirmExpiration;
    protected Integer successExpiration;
    protected String successURL;
    protected String failureURL;
    protected RecurringPaymentAuthorization createRecurring;
    protected String externalID;
    protected String consumerIPAddress;
    protected String consumerLanguage;
    protected String consumerCountry;

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
     * Gets the value of the billing property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntity }
     *     
     */
    public LegalEntity getBilling() {
        return billing;
    }

    /**
     * Sets the value of the billing property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntity }
     *     
     */
    public void setBilling(LegalEntity value) {
        this.billing = value;
    }

    /**
     * Gets the value of the shipping property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntity }
     *     
     */
    public LegalEntity getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntity }
     *     
     */
    public void setShipping(LegalEntity value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the basketRisk property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBasketRisk() {
        return basketRisk;
    }

    /**
     * Sets the value of the basketRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBasketRisk(Integer value) {
        this.basketRisk = value;
    }

    /**
     * Gets the value of the clientRisk property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientRisk() {
        return clientRisk;
    }

    /**
     * Sets the value of the clientRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientRisk(Integer value) {
        this.clientRisk = value;
    }

    /**
     * Gets the value of the authExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthExpiration() {
        return authExpiration;
    }

    /**
     * Sets the value of the authExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthExpiration(Integer value) {
        this.authExpiration = value;
    }

    /**
     * Gets the value of the confirmExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfirmExpiration() {
        return confirmExpiration;
    }

    /**
     * Sets the value of the confirmExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfirmExpiration(Integer value) {
        this.confirmExpiration = value;
    }

    /**
     * Gets the value of the successExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccessExpiration() {
        return successExpiration;
    }

    /**
     * Sets the value of the successExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccessExpiration(Integer value) {
        this.successExpiration = value;
    }

    /**
     * Gets the value of the successURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessURL() {
        return successURL;
    }

    /**
     * Sets the value of the successURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessURL(String value) {
        this.successURL = value;
    }

    /**
     * Gets the value of the failureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureURL() {
        return failureURL;
    }

    /**
     * Sets the value of the failureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureURL(String value) {
        this.failureURL = value;
    }

    /**
     * Gets the value of the createRecurring property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringPaymentAuthorization }
     *     
     */
    public RecurringPaymentAuthorization getCreateRecurring() {
        return createRecurring;
    }

    /**
     * Sets the value of the createRecurring property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringPaymentAuthorization }
     *     
     */
    public void setCreateRecurring(RecurringPaymentAuthorization value) {
        this.createRecurring = value;
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

    /**
     * Gets the value of the consumerIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerIPAddress() {
        return consumerIPAddress;
    }

    /**
     * Sets the value of the consumerIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerIPAddress(String value) {
        this.consumerIPAddress = value;
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
     * Gets the value of the consumerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerCountry() {
        return consumerCountry;
    }

    /**
     * Sets the value of the consumerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerCountry(String value) {
        this.consumerCountry = value;
    }

}
