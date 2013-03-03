
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get FeeCardCategories Request root element
 * 
 * <p>Java class for GetFeeCardCategories_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardCategories_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}GetFeeCardCategoriesDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardCategories_Request", propOrder = {
    "details"
})
public class GetFeeCardCategoriesRequest {

    @XmlElement(required = true)
    protected GetFeeCardCategoriesDetails details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link GetFeeCardCategoriesDetails }
     *     
     */
    public GetFeeCardCategoriesDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFeeCardCategoriesDetails }
     *     
     */
    public void setDetails(GetFeeCardCategoriesDetails value) {
        this.details = value;
    }

}
