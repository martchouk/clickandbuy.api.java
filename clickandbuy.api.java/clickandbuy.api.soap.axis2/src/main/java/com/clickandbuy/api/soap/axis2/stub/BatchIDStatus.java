
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * structure containing the status of a given batch ID or extern batch ID
 * 
 * <p>Java class for BatchIDStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchIDStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="externalBatchID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExternalID" minOccurs="0"/>
 *         &lt;element name="batchStatus" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BatchStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchIDStatus", propOrder = {
    "batchID",
    "externalBatchID",
    "batchStatus"
})
public class BatchIDStatus {

    protected long batchID;
    protected String externalBatchID;
    protected BatchStatus batchStatus;

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

    /**
     * Gets the value of the batchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BatchStatus }
     *     
     */
    public BatchStatus getBatchStatus() {
        return batchStatus;
    }

    /**
     * Sets the value of the batchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchStatus }
     *     
     */
    public void setBatchStatus(BatchStatus value) {
        this.batchStatus = value;
    }

}
