
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * domestic account
 * 
 * <p>Java class for PublicDomesticAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicDomesticAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bankZipCode" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BankZipCode"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicDomesticAccount", propOrder = {

})
public class PublicDomesticAccount {

    @XmlElement(required = true)
    protected String bankZipCode;

    /**
     * Gets the value of the bankZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankZipCode() {
        return bankZipCode;
    }

    /**
     * Sets the value of the bankZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankZipCode(String value) {
        this.bankZipCode = value;
    }

}
