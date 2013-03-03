
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for PayRequestRecurring details
 * 
 * <p>Java class for PayRequestRecurringDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayRequestRecurringDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="amount" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Money"/>
 *         &lt;element name="recurringPaymentAuthorizationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="orderDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}OrderDetails" minOccurs="0"/>
 *         &lt;element name="billing" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}LegalEntity" minOccurs="0"/>
 *         &lt;element name="shipping" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}LegalEntity" minOccurs="0"/>
 *         &lt;element name="basketRisk" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RiskScore" minOccurs="0"/>
 *         &lt;element name="clientRisk" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RiskScore" minOccurs="0"/>
 *         &lt;element name="successExpiration" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExpirationTime" minOccurs="0"/>
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
@XmlType(name = "PayRequestRecurringDetails", propOrder = {

})
public class PayRequestRecurringDetails {

    @XmlElement(required = true)
    protected Money amount;
    protected long recurringPaymentAuthorizationID;
    protected OrderDetails orderDetails;
    protected LegalEntity billing;
    protected LegalEntity shipping;
    protected Integer basketRisk;
    protected Integer clientRisk;
    protected Integer successExpiration;
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
     * Gets the value of the recurringPaymentAuthorizationID property.
     * 
     */
    public long getRecurringPaymentAuthorizationID() {
        return recurringPaymentAuthorizationID;
    }

    /**
     * Sets the value of the recurringPaymentAuthorizationID property.
     * 
     */
    public void setRecurringPaymentAuthorizationID(long value) {
        this.recurringPaymentAuthorizationID = value;
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
