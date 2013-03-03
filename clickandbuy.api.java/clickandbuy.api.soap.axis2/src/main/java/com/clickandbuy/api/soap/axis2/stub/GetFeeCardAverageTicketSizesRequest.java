
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get FeeCardAverageTicketSizes Request root element
 * 
 * <p>Java class for GetFeeCardAverageTicketSizes_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardAverageTicketSizes_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}GetFeeCardAverageTicketSizesDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardAverageTicketSizes_Request", propOrder = {
    "details"
})
public class GetFeeCardAverageTicketSizesRequest {

    @XmlElement(required = true)
    protected GetFeeCardAverageTicketSizesDetails details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link GetFeeCardAverageTicketSizesDetails }
     *     
     */
    public GetFeeCardAverageTicketSizesDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFeeCardAverageTicketSizesDetails }
     *     
     */
    public void setDetails(GetFeeCardAverageTicketSizesDetails value) {
        this.details = value;
    }

}
