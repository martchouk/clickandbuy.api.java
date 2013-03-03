
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for GetBatchStatus details
 * 
 * <p>Java class for GetBatchStatusDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBatchStatusDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="batchID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalBatchID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExternalID" minOccurs="0"/>
 *         &lt;element name="batchItemIDList" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BatchItemIDList" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBatchStatusDetails", propOrder = {

})
public class GetBatchStatusDetails {

    protected Long batchID;
    protected String externalBatchID;
    protected BatchItemIDList batchItemIDList;

    /**
     * Gets the value of the batchID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBatchID(Long value) {
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
     * Gets the value of the batchItemIDList property.
     * 
     * @return
     *     possible object is
     *     {@link BatchItemIDList }
     *     
     */
    public BatchItemIDList getBatchItemIDList() {
        return batchItemIDList;
    }

    /**
     * Sets the value of the batchItemIDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchItemIDList }
     *     
     */
    public void setBatchItemIDList(BatchItemIDList value) {
        this.batchItemIDList = value;
    }

}
