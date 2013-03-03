
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get Merchant Registration Status Request root element
 * 
 * <p>Java class for GetMerchantRegistrationStatus_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMerchantRegistrationStatus_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}GetMerchantRegistrationStatusDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMerchantRegistrationStatus_Request", propOrder = {
    "details"
})
public class GetMerchantRegistrationStatusRequest {

    @XmlElement(required = true)
    protected GetMerchantRegistrationStatusDetails details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link GetMerchantRegistrationStatusDetails }
     *     
     */
    public GetMerchantRegistrationStatusDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMerchantRegistrationStatusDetails }
     *     
     */
    public void setDetails(GetMerchantRegistrationStatusDetails value) {
        this.details = value;
    }

}
