
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for CancelRequest details
 * 
 * <p>Java class for CancelRequestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelRequestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="cancelMode" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CancelMode"/>
 *         &lt;element name="cancelIdentifier" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CancelIdentifier"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelRequestDetails", propOrder = {

})
public class CancelRequestDetails {

    @XmlElement(required = true)
    protected CancelMode cancelMode;
    @XmlElement(required = true)
    protected CancelIdentifier cancelIdentifier;

    /**
     * Gets the value of the cancelMode property.
     * 
     * @return
     *     possible object is
     *     {@link CancelMode }
     *     
     */
    public CancelMode getCancelMode() {
        return cancelMode;
    }

    /**
     * Sets the value of the cancelMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelMode }
     *     
     */
    public void setCancelMode(CancelMode value) {
        this.cancelMode = value;
    }

    /**
     * Gets the value of the cancelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CancelIdentifier }
     *     
     */
    public CancelIdentifier getCancelIdentifier() {
        return cancelIdentifier;
    }

    /**
     * Sets the value of the cancelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelIdentifier }
     *     
     */
    public void setCancelIdentifier(CancelIdentifier value) {
        this.cancelIdentifier = value;
    }

}
