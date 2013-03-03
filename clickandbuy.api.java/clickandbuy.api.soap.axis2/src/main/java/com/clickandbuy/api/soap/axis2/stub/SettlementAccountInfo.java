
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about a Merchant Integration SettlementAccount
 * 
 * <p>Java class for SettlementAccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementAccountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementAccountID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="settlementAccountCurrency" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Currency"/>
 *         &lt;element name="settlementAccountName" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}SettlementAccountName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementAccountInfo", propOrder = {
    "settlementAccountID",
    "settlementAccountCurrency",
    "settlementAccountName"
})
public class SettlementAccountInfo {

    protected long settlementAccountID;
    @XmlElement(required = true)
    protected String settlementAccountCurrency;
    protected String settlementAccountName;

    /**
     * Gets the value of the settlementAccountID property.
     * 
     */
    public long getSettlementAccountID() {
        return settlementAccountID;
    }

    /**
     * Sets the value of the settlementAccountID property.
     * 
     */
    public void setSettlementAccountID(long value) {
        this.settlementAccountID = value;
    }

    /**
     * Gets the value of the settlementAccountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAccountCurrency() {
        return settlementAccountCurrency;
    }

    /**
     * Sets the value of the settlementAccountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAccountCurrency(String value) {
        this.settlementAccountCurrency = value;
    }

    /**
     * Gets the value of the settlementAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAccountName() {
        return settlementAccountName;
    }

    /**
     * Sets the value of the settlementAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAccountName(String value) {
        this.settlementAccountName = value;
    }

}
