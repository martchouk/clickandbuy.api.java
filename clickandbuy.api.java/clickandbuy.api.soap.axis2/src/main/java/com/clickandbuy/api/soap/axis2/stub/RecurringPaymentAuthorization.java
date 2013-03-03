
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * structure describing a recurring payment authorization
 * 
 * <p>Java class for RecurringPaymentAuthorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringPaymentAuthorization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="description" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Text"/>
 *         &lt;element name="numberLimit" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}NumberLimit" minOccurs="0"/>
 *         &lt;element name="amountLimit" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Money" minOccurs="0"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="revokableByConsumer" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Flag" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringPaymentAuthorization", propOrder = {

})
public class RecurringPaymentAuthorization {

    @XmlElement(required = true)
    protected String description;
    protected Integer numberLimit;
    protected Money amountLimit;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    protected Boolean revokableByConsumer;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the numberLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberLimit() {
        return numberLimit;
    }

    /**
     * Sets the value of the numberLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberLimit(Integer value) {
        this.numberLimit = value;
    }

    /**
     * Gets the value of the amountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmountLimit() {
        return amountLimit;
    }

    /**
     * Sets the value of the amountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmountLimit(Money value) {
        this.amountLimit = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the revokableByConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevokableByConsumer() {
        return revokableByConsumer;
    }

    /**
     * Sets the value of the revokableByConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevokableByConsumer(Boolean value) {
        this.revokableByConsumer = value;
    }

}
