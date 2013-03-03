
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about a Merchant Integration
 * 
 * <p>Java class for MerchantIntegrationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantIntegrationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementInfo" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}SettlementAccountInfo"/>
 *         &lt;element name="feeCardInfo" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}FeeCardInfo" minOccurs="0"/>
 *         &lt;element name="projectInfo" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ProjectInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantIntegrationInfo", propOrder = {
    "settlementInfo",
    "feeCardInfo",
    "projectInfo"
})
public class MerchantIntegrationInfo {

    @XmlElement(required = true)
    protected SettlementAccountInfo settlementInfo;
    protected FeeCardInfo feeCardInfo;
    protected ProjectInfo projectInfo;

    /**
     * Gets the value of the settlementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementAccountInfo }
     *     
     */
    public SettlementAccountInfo getSettlementInfo() {
        return settlementInfo;
    }

    /**
     * Sets the value of the settlementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementAccountInfo }
     *     
     */
    public void setSettlementInfo(SettlementAccountInfo value) {
        this.settlementInfo = value;
    }

    /**
     * Gets the value of the feeCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCardInfo }
     *     
     */
    public FeeCardInfo getFeeCardInfo() {
        return feeCardInfo;
    }

    /**
     * Sets the value of the feeCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCardInfo }
     *     
     */
    public void setFeeCardInfo(FeeCardInfo value) {
        this.feeCardInfo = value;
    }

    /**
     * Gets the value of the projectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectInfo }
     *     
     */
    public ProjectInfo getProjectInfo() {
        return projectInfo;
    }

    /**
     * Sets the value of the projectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectInfo }
     *     
     */
    public void setProjectInfo(ProjectInfo value) {
        this.projectInfo = value;
    }

}
