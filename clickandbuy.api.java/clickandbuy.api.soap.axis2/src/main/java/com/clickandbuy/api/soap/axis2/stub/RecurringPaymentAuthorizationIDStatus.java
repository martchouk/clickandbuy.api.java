
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurringPaymentAuthorizationIDStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringPaymentAuthorizationIDStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="recurringPaymentAuthorizationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="recurringPaymentAuthorizationStatus" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RecurringPaymentAuthorizationStatus"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringPaymentAuthorizationIDStatus", propOrder = {

})
public class RecurringPaymentAuthorizationIDStatus {

    protected long recurringPaymentAuthorizationID;
    @XmlElement(required = true)
    protected RecurringPaymentAuthorizationStatus recurringPaymentAuthorizationStatus;

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
     * Gets the value of the recurringPaymentAuthorizationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringPaymentAuthorizationStatus }
     *     
     */
    public RecurringPaymentAuthorizationStatus getRecurringPaymentAuthorizationStatus() {
        return recurringPaymentAuthorizationStatus;
    }

    /**
     * Sets the value of the recurringPaymentAuthorizationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringPaymentAuthorizationStatus }
     *     
     */
    public void setRecurringPaymentAuthorizationStatus(RecurringPaymentAuthorizationStatus value) {
        this.recurringPaymentAuthorizationStatus = value;
    }

}
