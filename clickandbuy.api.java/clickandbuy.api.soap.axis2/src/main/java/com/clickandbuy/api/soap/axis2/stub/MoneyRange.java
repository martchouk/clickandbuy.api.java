
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a Money range with optional upper and lower bounds
 * 
 * <p>Java class for MoneyRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="from" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Money" minOccurs="0"/>
 *         &lt;element name="until" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyRange", propOrder = {
    "from",
    "until"
})
public class MoneyRange {

    protected Money from;
    protected Money until;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setFrom(Money value) {
        this.from = value;
    }

    /**
     * Gets the value of the until property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUntil() {
        return until;
    }

    /**
     * Sets the value of the until property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUntil(Money value) {
        this.until = value;
    }

}
