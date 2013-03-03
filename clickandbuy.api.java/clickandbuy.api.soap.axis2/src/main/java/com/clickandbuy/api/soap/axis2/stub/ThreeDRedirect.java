
package com.clickandbuy.api.soap.axis2.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Verified by Visa/Mastercard SecureCode redirect
 * 
 * <p>Java class for ThreeDRedirect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThreeDRedirect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acsURL" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}URL"/>
 *         &lt;element name="element" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ThreeDRedirectElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreeDRedirect", propOrder = {
    "acsURL",
    "element"
})
public class ThreeDRedirect {

    @XmlElement(required = true)
    protected String acsURL;
    protected List<ThreeDRedirectElement> element;

    /**
     * Gets the value of the acsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsURL() {
        return acsURL;
    }

    /**
     * Sets the value of the acsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsURL(String value) {
        this.acsURL = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThreeDRedirectElement }
     * 
     * 
     */
    public List<ThreeDRedirectElement> getElement() {
        if (element == null) {
            element = new ArrayList<ThreeDRedirectElement>();
        }
        return this.element;
    }

}
