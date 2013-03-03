
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Credit Request_ Response root element
 * 
 * <p>Java class for CreditRequest_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditRequest_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestTrackingID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RequestTrackingID"/>
 *         &lt;element name="transaction" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}TransactionIDStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditRequest_Response", propOrder = {
    "requestTrackingID",
    "transaction"
})
public class CreditRequestResponse {

    @XmlElement(required = true)
    protected String requestTrackingID;
    @XmlElement(required = true)
    protected TransactionIDStatus transaction;

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
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIDStatus }
     *     
     */
    public TransactionIDStatus getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIDStatus }
     *     
     */
    public void setTransaction(TransactionIDStatus value) {
        this.transaction = value;
    }

}
