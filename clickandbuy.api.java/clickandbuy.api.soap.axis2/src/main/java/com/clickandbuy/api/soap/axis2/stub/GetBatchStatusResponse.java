
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get Batch Status_ Response root element
 * 
 * <p>Java class for GetBatchStatus_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBatchStatus_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestTrackingID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RequestTrackingID"/>
 *         &lt;element name="batch" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BatchIDStatus"/>
 *         &lt;element name="batchItemList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BatchItemIDStatusList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBatchStatus_Response", propOrder = {
    "requestTrackingID",
    "batch",
    "batchItemList"
})
public class GetBatchStatusResponse {

    @XmlElement(required = true)
    protected String requestTrackingID;
    @XmlElement(required = true)
    protected BatchIDStatus batch;
    protected BatchItemIDStatusList batchItemList;

    /**
     * Gets the value of the requestTrackingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTrackingID() {
        return requestTrackingID;
    }

    /**
     * Sets the value of the requestTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTrackingID(String value) {
        this.requestTrackingID = value;
    }

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link BatchIDStatus }
     *     
     */
    public BatchIDStatus getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchIDStatus }
     *     
     */
    public void setBatch(BatchIDStatus value) {
        this.batch = value;
    }

    /**
     * Gets the value of the batchItemList property.
     * 
     * @return
     *     possible object is
     *     {@link BatchItemIDStatusList }
     *     
     */
    public BatchItemIDStatusList getBatchItemList() {
        return batchItemList;
    }

    /**
     * Sets the value of the batchItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchItemIDStatusList }
     *     
     */
    public void setBatchItemList(BatchItemIDStatusList value) {
        this.batchItemList = value;
    }

}
