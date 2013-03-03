
package com.clickandbuy.api.soap.axis2.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * structure containing upto 128 batch item status
 * 
 * <p>Java class for BatchItemIDStatusList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchItemIDStatusList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchItem" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BatchItemIDStatus" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchItemIDStatusList", propOrder = {
    "batchItem"
})
public class BatchItemIDStatusList {

    @XmlElement(required = true)
    protected List<BatchItemIDStatus> batchItem;

    /**
     * Gets the value of the batchItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchItemIDStatus }
     * 
     * 
     */
    public List<BatchItemIDStatus> getBatchItem() {
        if (batchItem == null) {
            batchItem = new ArrayList<BatchItemIDStatus>();
        }
        return this.batchItem;
    }

}
