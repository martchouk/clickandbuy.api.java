
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * the document's links
 * 
 * <p>Java class for AccountingDocumentLinks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingDocumentLinks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceAreaLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="directLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingDocumentLinks", propOrder = {
    "serviceAreaLink",
    "directLink"
})
public class AccountingDocumentLinks {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String serviceAreaLink;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String directLink;

    /**
     * Gets the value of the serviceAreaLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAreaLink() {
        return serviceAreaLink;
    }

    /**
     * Sets the value of the serviceAreaLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAreaLink(String value) {
        this.serviceAreaLink = value;
    }

    /**
     * Gets the value of the directLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectLink() {
        return directLink;
    }

    /**
     * Sets the value of the directLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectLink(String value) {
        this.directLink = value;
    }

}
