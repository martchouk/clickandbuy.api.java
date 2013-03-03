
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for GetMerchantRegistrationStatus details
 * 
 * <p>Java class for GetMerchantRegistrationStatusDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMerchantRegistrationStatusDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="businessOriginID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BusinessOriginID"/>
 *         &lt;element name="merchantID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="token" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Token"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMerchantRegistrationStatusDetails", propOrder = {

})
public class GetMerchantRegistrationStatusDetails {

    @XmlElement(required = true)
    protected String businessOriginID;
    protected long merchantID;
    @XmlElement(required = true)
    protected String token;

    /**
     * Gets the value of the businessOriginID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessOriginID() {
        return businessOriginID;
    }

    /**
     * Sets the value of the businessOriginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessOriginID(String value) {
        this.businessOriginID = value;
    }

    /**
     * Gets the value of the merchantID property.
     * 
     */
    public long getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     */
    public void setMerchantID(long value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
