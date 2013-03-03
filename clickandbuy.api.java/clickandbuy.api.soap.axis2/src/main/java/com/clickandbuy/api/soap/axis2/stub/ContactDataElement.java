
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * contact data element
 * 
 * <p>Java class for ContactDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactDataElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="item" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ContactDataElementItem"/>
 *         &lt;element name="value" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ContactDataElementValue"/>
 *         &lt;element name="type" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ContactDataElementType"/>
 *         &lt;element name="pattern" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ContactDataElementPattern" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDataElement", propOrder = {

})
public class ContactDataElement {

    @XmlElement(required = true)
    protected ContactDataElementItem item;
    @XmlElement(required = true)
    protected String value;
    @XmlElement(required = true)
    protected ContactDataElementType type;
    protected String pattern;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDataElementItem }
     *     
     */
    public ContactDataElementItem getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDataElementItem }
     *     
     */
    public void setItem(ContactDataElementItem value) {
        this.item = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDataElementType }
     *     
     */
    public ContactDataElementType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDataElementType }
     *     
     */
    public void setType(ContactDataElementType value) {
        this.type = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

}
