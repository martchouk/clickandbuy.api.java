
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * structure with error details
 * 
 * <p>Java class for ErrorDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestTrackingID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RequestTrackingID" minOccurs="0"/>
 *         &lt;element name="code" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ErrorCode"/>
 *         &lt;element name="detailCode" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ErrorDetailCode"/>
 *         &lt;element name="description" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Text"/>
 *         &lt;element name="retry" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Flag"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDetails", propOrder = {
    "requestTrackingID",
    "code",
    "detailCode",
    "description",
    "retry"
})
public class ErrorDetails {

    protected String requestTrackingID;
    protected int code;
    protected long detailCode;
    @XmlElement(required = true)
    protected String description;
    protected boolean retry;

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
     * Gets the value of the code property.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Gets the value of the detailCode property.
     * 
     */
    public long getDetailCode() {
        return detailCode;
    }

    /**
     * Sets the value of the detailCode property.
     * 
     */
    public void setDetailCode(long value) {
        this.detailCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the retry property.
     * 
     */
    public boolean isRetry() {
        return retry;
    }

    /**
     * Sets the value of the retry property.
     * 
     */
    public void setRetry(boolean value) {
        this.retry = value;
    }

}
