
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about a Merchant Integration FeeCard
 * 
 * <p>Java class for FeeCardInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeCardInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoicingCycle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="settlementDelay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="averageTicketSize" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Money"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeCardInfo", propOrder = {
    "invoicingCycle",
    "settlementDelay",
    "averageTicketSize"
})
public class FeeCardInfo {

    protected int invoicingCycle;
    protected int settlementDelay;
    @XmlElement(required = true)
    protected Money averageTicketSize;

    /**
     * Gets the value of the invoicingCycle property.
     * 
     */
    public int getInvoicingCycle() {
        return invoicingCycle;
    }

    /**
     * Sets the value of the invoicingCycle property.
     * 
     */
    public void setInvoicingCycle(int value) {
        this.invoicingCycle = value;
    }

    /**
     * Gets the value of the settlementDelay property.
     * 
     */
    public int getSettlementDelay() {
        return settlementDelay;
    }

    /**
     * Sets the value of the settlementDelay property.
     * 
     */
    public void setSettlementDelay(int value) {
        this.settlementDelay = value;
    }

    /**
     * Gets the value of the averageTicketSize property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAverageTicketSize() {
        return averageTicketSize;
    }

    /**
     * Sets the value of the averageTicketSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAverageTicketSize(Money value) {
        this.averageTicketSize = value;
    }

}
