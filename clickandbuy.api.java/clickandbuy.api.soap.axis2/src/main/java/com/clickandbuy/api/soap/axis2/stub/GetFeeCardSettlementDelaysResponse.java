
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get FeeCardSettlementDelays Response root element
 * 
 * <p>Java class for GetFeeCardSettlementDelays_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardSettlementDelays_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementDelayList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}FeeCardSettlementDelayList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardSettlementDelays_Response", propOrder = {
    "settlementDelayList"
})
public class GetFeeCardSettlementDelaysResponse {

    @XmlElement(required = true)
    protected FeeCardSettlementDelayList settlementDelayList;

    /**
     * Gets the value of the settlementDelayList property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCardSettlementDelayList }
     *     
     */
    public FeeCardSettlementDelayList getSettlementDelayList() {
        return settlementDelayList;
    }

    /**
     * Sets the value of the settlementDelayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCardSettlementDelayList }
     *     
     */
    public void setSettlementDelayList(FeeCardSettlementDelayList value) {
        this.settlementDelayList = value;
    }

}
