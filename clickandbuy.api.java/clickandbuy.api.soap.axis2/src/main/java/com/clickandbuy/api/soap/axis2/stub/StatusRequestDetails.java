
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for StatusRequest details
 * 
 * <p>Java class for StatusRequestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRequestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="transactionIDList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}TransactionIDList" minOccurs="0"/>
 *         &lt;element name="externalIDList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExternalIDList" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusRequestDetails", propOrder = {
    "transactionIDList",
    "externalIDList"
})
public class StatusRequestDetails {

    protected TransactionIDList transactionIDList;
    protected ExternalIDList externalIDList;

    /**
     * Gets the value of the transactionIDList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIDList }
     *     
     */
    public TransactionIDList getTransactionIDList() {
        return transactionIDList;
    }

    /**
     * Sets the value of the transactionIDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIDList }
     *     
     */
    public void setTransactionIDList(TransactionIDList value) {
        this.transactionIDList = value;
    }

    /**
     * Gets the value of the externalIDList property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIDList }
     *     
     */
    public ExternalIDList getExternalIDList() {
        return externalIDList;
    }

    /**
     * Sets the value of the externalIDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIDList }
     *     
     */
    public void setExternalIDList(ExternalIDList value) {
        this.externalIDList = value;
    }

}
