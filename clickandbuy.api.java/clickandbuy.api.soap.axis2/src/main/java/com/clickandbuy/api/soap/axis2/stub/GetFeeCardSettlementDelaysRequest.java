
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get FeeCardSettlementDelays Request root element
 * 
 * <p>Java class for GetFeeCardSettlementDelays_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardSettlementDelays_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}GetFeeCardSettlementDelaysDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardSettlementDelays_Request", propOrder = {
    "details"
})
public class GetFeeCardSettlementDelaysRequest {

    @XmlElement(required = true)
    protected GetFeeCardSettlementDelaysDetails details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link GetFeeCardSettlementDelaysDetails }
     *     
     */
    public GetFeeCardSettlementDelaysDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFeeCardSettlementDelaysDetails }
     *     
     */
    public void setDetails(GetFeeCardSettlementDelaysDetails value) {
        this.details = value;
    }

}
