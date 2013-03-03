
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for CreateBatch details
 * 
 * <p>Java class for CreateBatchDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateBatchDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="externalBatchID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExternalID" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateBatchDetails", propOrder = {

})
public class CreateBatchDetails {

    protected String externalBatchID;

    /**
     * Gets the value of the externalBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBatchID() {
        return externalBatchID;
    }

    /**
     * Sets the value of the externalBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBatchID(String value) {
        this.externalBatchID = value;
    }

}
