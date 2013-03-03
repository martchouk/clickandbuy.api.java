
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get FeeCard Response root element
 * 
 * <p>Java class for GetFeeCard_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCard_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}FeeCardCommissionList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCard_Response", propOrder = {
    "commissionList"
})
public class GetFeeCardResponse {

    @XmlElement(required = true)
    protected FeeCardCommissionList commissionList;

    /**
     * Gets the value of the commissionList property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCardCommissionList }
     *     
     */
    public FeeCardCommissionList getCommissionList() {
        return commissionList;
    }

    /**
     * Sets the value of the commissionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCardCommissionList }
     *     
     */
    public void setCommissionList(FeeCardCommissionList value) {
        this.commissionList = value;
    }

}
