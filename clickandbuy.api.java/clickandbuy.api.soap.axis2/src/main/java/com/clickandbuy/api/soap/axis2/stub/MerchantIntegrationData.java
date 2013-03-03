
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines technical and financial integration data for the Merchant
 * 
 * <p>Java class for MerchantIntegrationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantIntegrationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementData" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}SettlementAccountData" minOccurs="0"/>
 *         &lt;element name="feeCardData" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}FeeCardData" minOccurs="0"/>
 *         &lt;element name="projectData" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ProjectData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantIntegrationData", propOrder = {
    "settlementData",
    "feeCardData",
    "projectData"
})
public class MerchantIntegrationData {

    protected SettlementAccountData settlementData;
    protected FeeCardData feeCardData;
    protected ProjectData projectData;

    /**
     * Gets the value of the settlementData property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementAccountData }
     *     
     */
    public SettlementAccountData getSettlementData() {
        return settlementData;
    }

    /**
     * Sets the value of the settlementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementAccountData }
     *     
     */
    public void setSettlementData(SettlementAccountData value) {
        this.settlementData = value;
    }

    /**
     * Gets the value of the feeCardData property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCardData }
     *     
     */
    public FeeCardData getFeeCardData() {
        return feeCardData;
    }

    /**
     * Sets the value of the feeCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCardData }
     *     
     */
    public void setFeeCardData(FeeCardData value) {
        this.feeCardData = value;
    }

    /**
     * Gets the value of the projectData property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectData }
     *     
     */
    public ProjectData getProjectData() {
        return projectData;
    }

    /**
     * Sets the value of the projectData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectData }
     *     
     */
    public void setProjectData(ProjectData value) {
        this.projectData = value;
    }

}
