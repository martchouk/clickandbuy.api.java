
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get FeeCardInvoicingCycles Response root element
 * 
 * <p>Java class for GetFeeCardInvoicingCycles_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardInvoicingCycles_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoicingCycleList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}FeeCardInvoicingCycleList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardInvoicingCycles_Response", propOrder = {
    "invoicingCycleList"
})
public class GetFeeCardInvoicingCyclesResponse {

    @XmlElement(required = true)
    protected FeeCardInvoicingCycleList invoicingCycleList;

    /**
     * Gets the value of the invoicingCycleList property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCardInvoicingCycleList }
     *     
     */
    public FeeCardInvoicingCycleList getInvoicingCycleList() {
        return invoicingCycleList;
    }

    /**
     * Sets the value of the invoicingCycleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCardInvoicingCycleList }
     *     
     */
    public void setInvoicingCycleList(FeeCardInvoicingCycleList value) {
        this.invoicingCycleList = value;
    }

}
