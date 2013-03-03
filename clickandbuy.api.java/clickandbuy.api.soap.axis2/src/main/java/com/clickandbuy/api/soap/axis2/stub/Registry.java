
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * commercial registry data
 * 
 * <p>Java class for Registry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Registry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registryID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RegistryID"/>
 *         &lt;element name="zip" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Zip" minOccurs="0"/>
 *         &lt;element name="city" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}City" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registry", propOrder = {
    "registryID",
    "zip",
    "city"
})
public class Registry {

    @XmlElement(required = true)
    protected String registryID;
    protected String zip;
    protected String city;

    /**
     * Gets the value of the registryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryID() {
        return registryID;
    }

    /**
     * Sets the value of the registryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryID(String value) {
        this.registryID = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

}
