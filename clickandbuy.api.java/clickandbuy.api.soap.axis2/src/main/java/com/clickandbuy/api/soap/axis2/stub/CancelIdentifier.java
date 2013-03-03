
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * identifier for cancel request (Transaction-ID or RPA-ID)
 * 
 * <p>Java class for CancelIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="recurringPaymentAuthorizationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelIdentifier", propOrder = {
    "transactionID",
    "recurringPaymentAuthorizationID"
})
public class CancelIdentifier {

    protected Long transactionID;
    protected Long recurringPaymentAuthorizationID;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionID(Long value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the recurringPaymentAuthorizationID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurringPaymentAuthorizationID() {
        return recurringPaymentAuthorizationID;
    }

    /**
     * Sets the value of the recurringPaymentAuthorizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurringPaymentAuthorizationID(Long value) {
        this.recurringPaymentAuthorizationID = value;
    }

}
