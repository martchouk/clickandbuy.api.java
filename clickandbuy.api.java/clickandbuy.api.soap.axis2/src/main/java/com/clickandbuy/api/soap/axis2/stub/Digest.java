
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * message digest
 * 
 * <p>Java class for Digest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Digest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hmac" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}HMAC"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Digest", propOrder = {
    "hmac"
})
public class Digest {

    @XmlElement(required = true)
    protected String hmac;

    /**
     * Gets the value of the hmac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmac() {
        return hmac;
    }

    /**
     * Sets the value of the hmac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmac(String value) {
        this.hmac = value;
    }

}
