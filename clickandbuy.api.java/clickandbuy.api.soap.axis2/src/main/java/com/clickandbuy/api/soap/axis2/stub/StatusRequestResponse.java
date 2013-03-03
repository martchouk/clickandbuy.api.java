
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Status Request_ Response root element
 * 
 * <p>Java class for StatusRequest_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRequest_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestTrackingID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RequestTrackingID"/>
 *         &lt;element name="transactionList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}TransactionStatusList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusRequest_Response", propOrder = {
    "requestTrackingID",
    "transactionList"
})
public class StatusRequestResponse {

    @XmlElement(required = true)
    protected String requestTrackingID;
    @XmlElement(required = true)
    protected TransactionStatusList transactionList;

    /**
     * Gets the value of the requestTrackingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTrackingID() {
        return requestTrackingID;
    }

    /**
     * Sets the value of the requestTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTrackingID(String value) {
        this.requestTrackingID = value;
    }

    /**
     * Gets the value of the transactionList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatusList }
     *     
     */
    public TransactionStatusList getTransactionList() {
        return transactionList;
    }

    /**
     * Sets the value of the transactionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatusList }
     *     
     */
    public void setTransactionList(TransactionStatusList value) {
        this.transactionList = value;
    }

}
