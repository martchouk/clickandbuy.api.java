
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * identification
 * 
 * <p>Java class for Identity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentType" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}IdentificationDocument"/>
 *         &lt;element name="identifier" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Identifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identity", propOrder = {
    "documentType",
    "identifier"
})
public class Identity {

    @XmlElement(required = true)
    protected IdentificationDocument documentType;
    @XmlElement(required = true)
    protected String identifier;

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationDocument }
     *     
     */
    public IdentificationDocument getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationDocument }
     *     
     */
    public void setDocumentType(IdentificationDocument value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

}
