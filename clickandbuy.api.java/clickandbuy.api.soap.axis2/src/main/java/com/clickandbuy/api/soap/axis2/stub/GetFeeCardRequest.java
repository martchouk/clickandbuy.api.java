
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get FeeCard Request root element
 * 
 * <p>Java class for GetFeeCard_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCard_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}GetFeeCardDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCard_Request", propOrder = {
    "details"
})
public class GetFeeCardRequest {

    @XmlElement(required = true)
    protected GetFeeCardDetails details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link GetFeeCardDetails }
     *     
     */
    public GetFeeCardDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFeeCardDetails }
     *     
     */
    public void setDetails(GetFeeCardDetails value) {
        this.details = value;
    }

}
