
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Cancel Batch_ Response root element
 * 
 * <p>Java class for CancelBatch_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelBatch_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestTrackingID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RequestTrackingID"/>
 *         &lt;element name="batch" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BatchIDStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelBatch_Response", propOrder = {
    "requestTrackingID",
    "batch"
})
public class CancelBatchResponse {

    @XmlElement(required = true)
    protected String requestTrackingID;
    @XmlElement(required = true)
    protected BatchIDStatus batch;

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

}
