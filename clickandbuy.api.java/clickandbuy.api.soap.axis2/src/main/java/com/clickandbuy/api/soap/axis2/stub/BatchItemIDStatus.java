
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * structure containing the status for a given batch item ID, or a structure containing error information regarding the given batch item id
 * 
 * <p>Java class for BatchItemIDStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchItemIDStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="batchItemID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="externalID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExternalID" minOccurs="0"/>
 *         &lt;element name="batchItemStatus" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BatchItemStatus" minOccurs="0"/>
 *         &lt;element name="resultTransactionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="errorDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ErrorDetails" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchItemIDStatus", propOrder = {

})
public class BatchItemIDStatus {

    protected long batchItemID;
    protected String externalID;
    protected BatchItemStatus batchItemStatus;
    protected Long resultTransactionID;
    protected ErrorDetails errorDetails;

    /**
     * Gets the value of the batchItemID property.
     * 
     */
    public long getBatchItemID() {
        return batchItemID;
    }

    /**
     * Sets the value of the batchItemID property.
     * 
     */
    public void setBatchItemID(long value) {
        this.batchItemID = value;
    }

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
     * Gets the value of the batchItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BatchItemStatus }
     *     
     */
    public BatchItemStatus getBatchItemStatus() {
        return batchItemStatus;
    }

    /**
     * Sets the value of the batchItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchItemStatus }
     *     
     */
    public void setBatchItemStatus(BatchItemStatus value) {
        this.batchItemStatus = value;
    }

    /**
     * Gets the value of the resultTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResultTransactionID() {
        return resultTransactionID;
    }

    /**
     * Sets the value of the resultTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResultTransactionID(Long value) {
        this.resultTransactionID = value;
    }

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorDetails }
     *     
     */
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDetails }
     *     
     */
    public void setErrorDetails(ErrorDetails value) {
        this.errorDetails = value;
    }

}
