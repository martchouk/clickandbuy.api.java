
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * account details
 * 
 * <p>Java class for PublicAccountDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicAccountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="domesticAccount" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}PublicDomesticAccount" minOccurs="0"/>
 *         &lt;element name="internationalAccount" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}PublicInternationalAccount" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicAccountDetails", propOrder = {

})
public class PublicAccountDetails {

    protected PublicDomesticAccount domesticAccount;
    protected PublicInternationalAccount internationalAccount;

    /**
     * Gets the value of the domesticAccount property.
     * 
     * @return
     *     possible object is
     *     {@link PublicDomesticAccount }
     *     
     */
    public PublicDomesticAccount getDomesticAccount() {
        return domesticAccount;
    }

    /**
     * Sets the value of the domesticAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicDomesticAccount }
     *     
     */
    public void setDomesticAccount(PublicDomesticAccount value) {
        this.domesticAccount = value;
    }

    /**
     * Gets the value of the internationalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link PublicInternationalAccount }
     *     
     */
    public PublicInternationalAccount getInternationalAccount() {
        return internationalAccount;
    }

    /**
     * Sets the value of the internationalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicInternationalAccount }
     *     
     */
    public void setInternationalAccount(PublicInternationalAccount value) {
        this.internationalAccount = value;
    }

}
