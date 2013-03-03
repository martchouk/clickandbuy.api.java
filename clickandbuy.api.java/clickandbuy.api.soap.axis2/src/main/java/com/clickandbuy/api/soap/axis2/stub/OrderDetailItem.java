
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * details of a single order item
 * 
 * <p>Java class for OrderDetailItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetailItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemType" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}OrderDetailItemType"/>
 *         &lt;element name="description" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}OrderDetailText"/>
 *         &lt;element name="quantity" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Quantity" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Money" minOccurs="0"/>
 *         &lt;element name="totalPrice" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDetailItem", propOrder = {
    "itemType",
    "description",
    "quantity",
    "unitPrice",
    "totalPrice"
})
public class OrderDetailItem {

    @XmlElement(required = true)
    protected OrderDetailItemType itemType;
    @XmlElement(required = true)
    protected String description;
    protected Integer quantity;
    protected Money unitPrice;
    protected Money totalPrice;

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetailItemType }
     *     
     */
    public OrderDetailItemType getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetailItemType }
     *     
     */
    public void setItemType(OrderDetailItemType value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUnitPrice(Money value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalPrice(Money value) {
        this.totalPrice = value;
    }

}
