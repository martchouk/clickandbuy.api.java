
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for GetFeeCardAverageTicketSizes details
 * 
 * <p>Java class for GetFeeCardAverageTicketSizesDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardAverageTicketSizesDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="businessOriginID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BusinessOriginID" minOccurs="0"/>
 *         &lt;element name="categoryID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="currency" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Currency"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardAverageTicketSizesDetails", propOrder = {

})
public class GetFeeCardAverageTicketSizesDetails {

    protected String businessOriginID;
    protected long categoryID;
    @XmlElement(required = true)
    protected String currency;

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
     * Gets the value of the categoryID property.
     * 
     */
    public long getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     */
    public void setCategoryID(long value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
