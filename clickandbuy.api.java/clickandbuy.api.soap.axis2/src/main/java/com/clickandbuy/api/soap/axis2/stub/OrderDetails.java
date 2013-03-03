
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * structure defining the order detail, as text and/or an item-list
 * 
 * <p>Java class for OrderDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="text" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}OrderDetailText" minOccurs="0"/>
 *         &lt;element name="itemList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}OrderDetailItemList" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDetails", propOrder = {

})
public class OrderDetails {

    protected String text;
    protected OrderDetailItemList itemList;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the itemList property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetailItemList }
     *     
     */
    public OrderDetailItemList getItemList() {
        return itemList;
    }

    /**
     * Sets the value of the itemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetailItemList }
     *     
     */
    public void setItemList(OrderDetailItemList value) {
        this.itemList = value;
    }

}
