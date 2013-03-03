
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get Batch Status_ Request root element
 * 
 * <p>Java class for GetBatchStatus_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBatchStatus_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authentication" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Authentication"/>
 *         &lt;element name="details" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}GetBatchStatusDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBatchStatus_Request", propOrder = {
    "authentication",
    "details"
})
public class GetBatchStatusRequest {

    @XmlElement(required = true)
    protected Authentication authentication;
    @XmlElement(required = true)
    protected GetBatchStatusDetails details;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuthentication(Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link GetBatchStatusDetails }
     *     
     */
    public GetBatchStatusDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBatchStatusDetails }
     *     
     */
    public void setDetails(GetBatchStatusDetails value) {
        this.details = value;
    }

}
