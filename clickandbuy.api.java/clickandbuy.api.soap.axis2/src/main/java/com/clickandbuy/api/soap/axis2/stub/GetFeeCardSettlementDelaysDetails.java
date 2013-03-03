
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for GetFeeCardSettlementDelays details
 * 
 * <p>Java class for GetFeeCardSettlementDelaysDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeeCardSettlementDelaysDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="businessOriginID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}BusinessOriginID" minOccurs="0"/>
 *         &lt;element name="categoryID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeeCardSettlementDelaysDetails", propOrder = {

})
public class GetFeeCardSettlementDelaysDetails {

    protected String businessOriginID;
    protected long categoryID;

    /**
     * Gets the value of the businessOriginID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessOriginID() {
        return businessOriginID;
    }

    /**
     * Sets the value of the businessOriginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessOriginID(String value) {
        this.businessOriginID = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     */
    public long getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     */
    public void setCategoryID(long value) {
        this.categoryID = value;
    }

}
