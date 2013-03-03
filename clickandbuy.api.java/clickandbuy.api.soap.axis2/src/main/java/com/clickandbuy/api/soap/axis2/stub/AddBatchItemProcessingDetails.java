
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * the details of the batch item to add
 * 
 * <p>Java class for AddBatchItemProcessingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddBatchItemProcessingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="payRequestDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}PayRequestDetails"/>
 *         &lt;element name="payRequestRecurringDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}PayRequestRecurringDetails"/>
 *         &lt;element name="refundRequestDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RefundRequestDetails"/>
 *         &lt;element name="creditRequestDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CreditRequestDetails"/>
 *         &lt;element name="cancelRequestDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CancelRequestDetails"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddBatchItemProcessingDetails", propOrder = {
    "payRequestDetails",
    "payRequestRecurringDetails",
    "refundRequestDetails",
    "creditRequestDetails",
    "cancelRequestDetails"
})
public class AddBatchItemProcessingDetails {

    protected PayRequestDetails payRequestDetails;
    protected PayRequestRecurringDetails payRequestRecurringDetails;
    protected RefundRequestDetails refundRequestDetails;
    protected CreditRequestDetails creditRequestDetails;
    protected CancelRequestDetails cancelRequestDetails;

    /**
     * Gets the value of the payRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PayRequestDetails }
     *     
     */
    public PayRequestDetails getPayRequestDetails() {
        return payRequestDetails;
    }

    /**
     * Sets the value of the payRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayRequestDetails }
     *     
     */
    public void setPayRequestDetails(PayRequestDetails value) {
        this.payRequestDetails = value;
    }

    /**
     * Gets the value of the payRequestRecurringDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PayRequestRecurringDetails }
     *     
     */
    public PayRequestRecurringDetails getPayRequestRecurringDetails() {
        return payRequestRecurringDetails;
    }

    /**
     * Sets the value of the payRequestRecurringDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayRequestRecurringDetails }
     *     
     */
    public void setPayRequestRecurringDetails(PayRequestRecurringDetails value) {
        this.payRequestRecurringDetails = value;
    }

    /**
     * Gets the value of the refundRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RefundRequestDetails }
     *     
     */
    public RefundRequestDetails getRefundRequestDetails() {
        return refundRequestDetails;
    }

    /**
     * Sets the value of the refundRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundRequestDetails }
     *     
     */
    public void setRefundRequestDetails(RefundRequestDetails value) {
        this.refundRequestDetails = value;
    }

    /**
     * Gets the value of the creditRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRequestDetails }
     *     
     */
    public CreditRequestDetails getCreditRequestDetails() {
        return creditRequestDetails;
    }

    /**
     * Sets the value of the creditRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRequestDetails }
     *     
     */
    public void setCreditRequestDetails(CreditRequestDetails value) {
        this.creditRequestDetails = value;
    }

    /**
     * Gets the value of the cancelRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CancelRequestDetails }
     *     
     */
    public CancelRequestDetails getCancelRequestDetails() {
        return cancelRequestDetails;
    }

    /**
     * Sets the value of the cancelRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelRequestDetails }
     *     
     */
    public void setCancelRequestDetails(CancelRequestDetails value) {
        this.cancelRequestDetails = value;
    }

}
