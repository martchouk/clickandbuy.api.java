
package com.clickandbuy.api.soap.axis2.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * structure containing upto 128 batch item request details
 * 
 * <p>Java class for BatchItemDetailsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchItemDetailsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchItemDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BatchItemDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchItemDetailsList", propOrder = {
    "batchItemDetails"
})
public class BatchItemDetailsList {

    protected List<BatchItemDetails> batchItemDetails;

    /**
     * Gets the value of the batchItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchItemDetails }
     * 
     * 
     */
    public List<BatchItemDetails> getBatchItemDetails() {
        if (batchItemDetails == null) {
            batchItemDetails = new ArrayList<BatchItemDetails>();
        }
        return this.batchItemDetails;
    }

}
