
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * address data
 * 
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="street" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Street" minOccurs="0"/>
 *         &lt;element name="houseNumber" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}HouseNumber" minOccurs="0"/>
 *         &lt;element name="houseNumberSuffix" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}HouseNumberSuffix" minOccurs="0"/>
 *         &lt;element name="zip" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Zip" minOccurs="0"/>
 *         &lt;element name="city" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}City" minOccurs="0"/>
 *         &lt;element name="country" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Country" minOccurs="0"/>
 *         &lt;element name="state" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}State" minOccurs="0"/>
 *         &lt;element name="addressSuffix" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}AddressSuffix" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "street",
    "houseNumber",
    "houseNumberSuffix",
    "zip",
    "city",
    "country",
    "state",
    "addressSuffix"
})
public class Address {

    protected String street;
    protected String houseNumber;
    protected String houseNumberSuffix;
    protected String zip;
    protected String city;
    protected String country;
    protected String state;
    protected String addressSuffix;

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the houseNumberSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberSuffix() {
        return houseNumberSuffix;
    }

    /**
     * Sets the value of the houseNumberSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberSuffix(String value) {
        this.houseNumberSuffix = value;
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

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the addressSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressSuffix() {
        return addressSuffix;
    }

    /**
     * Sets the value of the addressSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressSuffix(String value) {
        this.addressSuffix = value;
    }

}
