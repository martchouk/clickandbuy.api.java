
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for GetFeeCardCurrencies details
 * 
 * <p>Java class for GetFeeCardCurrenciesDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardCurrenciesDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="businessOriginID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BusinessOriginID" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardCurrenciesDetails", propOrder = {

})
public class GetFeeCardCurrenciesDetails {

    protected String businessOriginID;

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

}
