
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines settings for the Fee card
 * 
 * <p>Java class for FeeCardData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeCardData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoicingCycle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="settlementDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="averageTicketSize" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeCardData", propOrder = {
    "invoicingCycle",
    "settlementDelay",
    "averageTicketSize"
})
public class FeeCardData {

    protected Integer invoicingCycle;
    protected Integer settlementDelay;
    protected Money averageTicketSize;

    /**
     * Gets the value of the invoicingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvoicingCycle() {
        return invoicingCycle;
    }

    /**
     * Sets the value of the invoicingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvoicingCycle(Integer value) {
        this.invoicingCycle = value;
    }

    /**
     * Gets the value of the settlementDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettlementDelay() {
        return settlementDelay;
    }

    /**
     * Sets the value of the settlementDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettlementDelay(Integer value) {
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
