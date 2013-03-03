
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Create Merchant Registration Response root element
 * 
 * <p>Java class for CreateMerchantRegistration_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateMerchantRegistration_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestTrackingID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RequestTrackingID"/>
 *         &lt;element name="registrationInfo" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}MerchantRegistrationIDStatus"/>
 *         &lt;element name="integrationInfoList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}MerchantIntegrationInfoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMerchantRegistration_Response", propOrder = {
    "requestTrackingID",
    "registrationInfo",
    "integrationInfoList"
})
public class CreateMerchantRegistrationResponse {

    @XmlElement(required = true)
    protected String requestTrackingID;
    @XmlElement(required = true)
    protected MerchantRegistrationIDStatus registrationInfo;
    protected MerchantIntegrationInfoList integrationInfoList;

    /**
     * Gets the value of the requestTrackingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTrackingID() {
        return requestTrackingID;
    }

    /**
     * Sets the value of the requestTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTrackingID(String value) {
        this.requestTrackingID = value;
    }

    /**
     * Gets the value of the registrationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantRegistrationIDStatus }
     *     
     */
    public MerchantRegistrationIDStatus getRegistrationInfo() {
        return registrationInfo;
    }

    /**
     * Sets the value of the registrationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantRegistrationIDStatus }
     *     
     */
    public void setRegistrationInfo(MerchantRegistrationIDStatus value) {
        this.registrationInfo = value;
    }

    /**
     * Gets the value of the integrationInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantIntegrationInfoList }
     *     
     */
    public MerchantIntegrationInfoList getIntegrationInfoList() {
        return integrationInfoList;
    }

    /**
     * Sets the value of the integrationInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantIntegrationInfoList }
     *     
     */
    public void setIntegrationInfoList(MerchantIntegrationInfoList value) {
        this.integrationInfoList = value;
    }

}
