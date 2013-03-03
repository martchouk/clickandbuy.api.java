
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * credit recipient
 * 
 * <p>Java class for CreditRecipientIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditRecipientIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="emailAddress" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Email"/>
 *         &lt;element name="crn" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditRecipientIdentifier", propOrder = {
    "emailAddress",
    "crn"
})
public class CreditRecipientIdentifier {

    protected String emailAddress;
    protected Long crn;

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the crn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCrn() {
        return crn;
    }

    /**
     * Sets the value of the crn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCrn(Long value) {
        this.crn = value;
    }

}
