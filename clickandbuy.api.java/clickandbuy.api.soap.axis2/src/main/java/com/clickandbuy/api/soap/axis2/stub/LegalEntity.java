
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * legal entity (either a person or a company)
 * 
 * <p>Java class for LegalEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="consumer" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Consumer" minOccurs="0"/>
 *         &lt;element name="company" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Company" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEntity", propOrder = {
    "consumer",
    "company"
})
public class LegalEntity {

    protected Consumer consumer;
    protected Company company;

    /**
     * Gets the value of the consumer property.
     * 
     * @return
     *     possible object is
     *     {@link Consumer }
     *     
     */
    public Consumer getConsumer() {
        return consumer;
    }

    /**
     * Sets the value of the consumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consumer }
     *     
     */
    public void setConsumer(Consumer value) {
        this.consumer = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCompany(Company value) {
        this.company = value;
    }

}
