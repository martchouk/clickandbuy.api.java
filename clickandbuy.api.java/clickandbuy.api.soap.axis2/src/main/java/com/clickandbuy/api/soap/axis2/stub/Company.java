
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * company
 * 
 * <p>Java class for Company complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Company">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}CompanyName"/>
 *         &lt;element name="vatID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}VatID" minOccurs="0"/>
 *         &lt;element name="registry" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Registry" minOccurs="0"/>
 *         &lt;element name="address" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company", propOrder = {
    "name",
    "vatID",
    "registry",
    "address"
})
public class Company {

    @XmlElement(required = true)
    protected String name;
    protected String vatID;
    protected Registry registry;
    protected Address address;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the vatID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatID() {
        return vatID;
    }

    /**
     * Sets the value of the vatID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatID(String value) {
        this.vatID = value;
    }

    /**
     * Gets the value of the registry property.
     * 
     * @return
     *     possible object is
     *     {@link Registry }
     *     
     */
    public Registry getRegistry() {
        return registry;
    }

    /**
     * Sets the value of the registry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registry }
     *     
     */
    public void setRegistry(Registry value) {
        this.registry = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

}
