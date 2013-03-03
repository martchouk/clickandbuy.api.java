
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get FeeCardInvoicingCycles Request root element
 * 
 * <p>Java class for GetFeeCardInvoicingCycles_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardInvoicingCycles_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}GetFeeCardInvoicingCyclesDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardInvoicingCycles_Request", propOrder = {
    "details"
})
public class GetFeeCardInvoicingCyclesRequest {

    @XmlElement(required = true)
    protected GetFeeCardInvoicingCyclesDetails details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link GetFeeCardInvoicingCyclesDetails }
     *     
     */
    public GetFeeCardInvoicingCyclesDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFeeCardInvoicingCyclesDetails }
     *     
     */
    public void setDetails(GetFeeCardInvoicingCyclesDetails value) {
        this.details = value;
    }

}
