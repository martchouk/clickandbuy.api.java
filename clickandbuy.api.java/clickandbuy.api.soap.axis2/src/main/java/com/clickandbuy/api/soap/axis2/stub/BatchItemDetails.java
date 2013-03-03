
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * structure containing a batch item request details
 * 
 * <p>Java class for BatchItemDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchItemDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExternalID" minOccurs="0"/>
 *         &lt;element name="details" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}AddBatchItemProcessingDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchItemDetails", propOrder = {
    "externalID",
    "details"
})
public class BatchItemDetails {

    protected String externalID;
    @XmlElement(required = true)
    protected AddBatchItemProcessingDetails details;

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link AddBatchItemProcessingDetails }
     *     
     */
    public AddBatchItemProcessingDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddBatchItemProcessingDetails }
     *     
     */
    public void setDetails(AddBatchItemProcessingDetails value) {
        this.details = value;
    }

}
