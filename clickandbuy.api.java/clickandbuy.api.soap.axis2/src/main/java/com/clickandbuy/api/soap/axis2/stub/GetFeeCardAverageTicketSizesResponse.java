
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get FeeCardAverageTicketSizes Response root element
 * 
 * <p>Java class for GetFeeCardAverageTicketSizes_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardAverageTicketSizes_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averageTicketSizeList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}FeeCardAverageTicketSizeList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardAverageTicketSizes_Response", propOrder = {
    "averageTicketSizeList"
})
public class GetFeeCardAverageTicketSizesResponse {

    @XmlElement(required = true)
    protected FeeCardAverageTicketSizeList averageTicketSizeList;

    /**
     * Gets the value of the averageTicketSizeList property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCardAverageTicketSizeList }
     *     
     */
    public FeeCardAverageTicketSizeList getAverageTicketSizeList() {
        return averageTicketSizeList;
    }

    /**
     * Sets the value of the averageTicketSizeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCardAverageTicketSizeList }
     *     
     */
    public void setAverageTicketSizeList(FeeCardAverageTicketSizeList value) {
        this.averageTicketSizeList = value;
    }

}
