
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * account details
 * 
 * <p>Java class for AccountDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="domesticAccount" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}DomesticAccount" minOccurs="0"/>
 *         &lt;element name="internationalAccount" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}InternationalAccount" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetails", propOrder = {

})
public class AccountDetails {

    protected DomesticAccount domesticAccount;
    protected InternationalAccount internationalAccount;

    /**
     * Gets the value of the domesticAccount property.
     * 
     * @return
     *     possible object is
     *     {@link DomesticAccount }
     *     
     */
    public DomesticAccount getDomesticAccount() {
        return domesticAccount;
    }

    /**
     * Sets the value of the domesticAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticAccount }
     *     
     */
    public void setDomesticAccount(DomesticAccount value) {
        this.domesticAccount = value;
    }

    /**
     * Gets the value of the internationalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalAccount }
     *     
     */
    public InternationalAccount getInternationalAccount() {
        return internationalAccount;
    }

    /**
     * Sets the value of the internationalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalAccount }
     *     
     */
    public void setInternationalAccount(InternationalAccount value) {
        this.internationalAccount = value;
    }

}
