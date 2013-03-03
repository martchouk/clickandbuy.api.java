
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get FeeCardCurrencies Response root element
 * 
 * <p>Java class for GetFeeCardCurrencies_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardCurrencies_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}FeeCardCurrencyList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardCurrencies_Response", propOrder = {
    "currencyList"
})
public class GetFeeCardCurrenciesResponse {

    @XmlElement(required = true)
    protected FeeCardCurrencyList currencyList;

    /**
     * Gets the value of the currencyList property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCardCurrencyList }
     *     
     */
    public FeeCardCurrencyList getCurrencyList() {
        return currencyList;
    }

    /**
     * Sets the value of the currencyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCardCurrencyList }
     *     
     */
    public void setCurrencyList(FeeCardCurrencyList value) {
        this.currencyList = value;
    }

}
