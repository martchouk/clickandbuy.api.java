
package com.clickandbuy.api.soap.axis2.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about a Merchant Integration
 * 
 * <p>Java class for MerchantIntegrationInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantIntegrationInfoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="integrationInfo" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}MerchantIntegrationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantIntegrationInfoList", propOrder = {
    "integrationInfo"
})
public class MerchantIntegrationInfoList {

    protected List<MerchantIntegrationInfo> integrationInfo;

    /**
     * Gets the value of the integrationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegrationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerchantIntegrationInfo }
     * 
     * 
     */
    public List<MerchantIntegrationInfo> getIntegrationInfo() {
        if (integrationInfo == null) {
            integrationInfo = new ArrayList<MerchantIntegrationInfo>();
        }
        return this.integrationInfo;
    }

}
