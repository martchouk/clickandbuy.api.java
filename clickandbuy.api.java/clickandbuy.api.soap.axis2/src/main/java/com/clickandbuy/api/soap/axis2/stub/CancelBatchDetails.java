
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for CancelBatch details
 * 
 * <p>Java class for CancelBatchDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelBatchDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="batchID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelBatchDetails", propOrder = {

})
public class CancelBatchDetails {

    protected long batchID;

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

}
