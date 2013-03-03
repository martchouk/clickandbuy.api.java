
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for AddBatchItem details (upto 128 items can be specified)
 * 
 * <p>Java class for AddBatchItemDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddBatchItemDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="batchID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="batchItemDetailsList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BatchItemDetailsList"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddBatchItemDetails", propOrder = {

})
public class AddBatchItemDetails {

    protected long batchID;
    @XmlElement(required = true)
    protected BatchItemDetailsList batchItemDetailsList;

    /**
     * Gets the value of the batchID property.
     * 
     */
    public long getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     */
    public void setBatchID(long value) {
        this.batchID = value;
    }

    /**
     * Gets the value of the batchItemDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link BatchItemDetailsList }
     *     
     */
    public BatchItemDetailsList getBatchItemDetailsList() {
        return batchItemDetailsList;
    }

    /**
     * Sets the value of the batchItemDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchItemDetailsList }
     *     
     */
    public void setBatchItemDetailsList(BatchItemDetailsList value) {
        this.batchItemDetailsList = value;
    }

}
