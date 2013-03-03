
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get FeeCardCategories Response root element
 * 
 * <p>Java class for GetFeeCardCategories_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardCategories_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}FeeCardCategoryList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardCategories_Response", propOrder = {
    "categoryList"
})
public class GetFeeCardCategoriesResponse {

    @XmlElement(required = true)
    protected FeeCardCategoryList categoryList;

    /**
     * Gets the value of the categoryList property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCardCategoryList }
     *     
     */
    public FeeCardCategoryList getCategoryList() {
        return categoryList;
    }

    /**
     * Sets the value of the categoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCardCategoryList }
     *     
     */
    public void setCategoryList(FeeCardCategoryList value) {
        this.categoryList = value;
    }

}
