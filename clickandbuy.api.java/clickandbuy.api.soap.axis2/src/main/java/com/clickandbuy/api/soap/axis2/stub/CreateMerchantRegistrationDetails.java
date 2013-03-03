
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for CreateMerchantRegistration details
 * 
 * <p>Java class for CreateMerchantRegistrationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateMerchantRegistrationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="registrationData" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}MerchantRegistrationSettings"/>
 *         &lt;element name="merchantData" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}MerchantRegistrationData"/>
 *         &lt;element name="integrationData" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}MerchantIntegrationData" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMerchantRegistrationDetails", propOrder = {

})
public class CreateMerchantRegistrationDetails {

    @XmlElement(required = true)
    protected MerchantRegistrationSettings registrationData;
    @XmlElement(required = true)
    protected MerchantRegistrationData merchantData;
    protected MerchantIntegrationData integrationData;

    /**
     * Gets the value of the registrationData property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantRegistrationSettings }
     *     
     */
    public MerchantRegistrationSettings getRegistrationData() {
        return registrationData;
    }

    /**
     * Sets the value of the registrationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantRegistrationSettings }
     *     
     */
    public void setRegistrationData(MerchantRegistrationSettings value) {
        this.registrationData = value;
    }

    /**
     * Gets the value of the merchantData property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantRegistrationData }
     *     
     */
    public MerchantRegistrationData getMerchantData() {
        return merchantData;
    }

    /**
     * Sets the value of the merchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantRegistrationData }
     *     
     */
    public void setMerchantData(MerchantRegistrationData value) {
        this.merchantData = value;
    }

    /**
     * Gets the value of the integrationData property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantIntegrationData }
     *     
     */
    public MerchantIntegrationData getIntegrationData() {
        return integrationData;
    }

    /**
     * Sets the value of the integrationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantIntegrationData }
     *     
     */
    public void setIntegrationData(MerchantIntegrationData value) {
        this.integrationData = value;
    }

}
