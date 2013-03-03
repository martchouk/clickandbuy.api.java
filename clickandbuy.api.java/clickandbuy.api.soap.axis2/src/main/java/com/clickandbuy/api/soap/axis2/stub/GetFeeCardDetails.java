
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for GetFeeCard details
 * 
 * <p>Java class for GetFeeCardDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="businessOriginID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BusinessOriginID" minOccurs="0"/>
 *         &lt;element name="categoryID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="averageTicketSize" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Money"/>
 *         &lt;element name="invoicingCycle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="settlementDelay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardDetails", propOrder = {

})
public class GetFeeCardDetails {

    protected String businessOriginID;
    protected long categoryID;
    @XmlElement(required = true)
    protected Money averageTicketSize;
    protected int invoicingCycle;
    protected int settlementDelay;

    /**
     * Gets the value of the businessOriginID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessOriginID() {
        return businessOriginID;
    }

    /**
     * Sets the value of the businessOriginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessOriginID(String value) {
        this.businessOriginID = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     */
    public long getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     */
    public void setCategoryID(long value) {
        this.categoryID = value;
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

}
