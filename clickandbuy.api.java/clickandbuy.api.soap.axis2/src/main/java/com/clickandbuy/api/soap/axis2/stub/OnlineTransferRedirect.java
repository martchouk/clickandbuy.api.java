
package com.clickandbuy.api.soap.axis2.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * online transfer system redirect
 * 
 * <p>Java class for OnlineTransferRedirect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnlineTransferRedirect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otURL" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}URL"/>
 *         &lt;element name="type" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RedirectType" minOccurs="0"/>
 *         &lt;element name="parameter" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RedirectParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlineTransferRedirect", propOrder = {
    "otURL",
    "type",
    "parameter"
})
public class OnlineTransferRedirect {

    @XmlElement(required = true)
    protected String otURL;
    protected RedirectType type;
    protected List<RedirectParameter> parameter;

    /**
     * Gets the value of the otURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtURL() {
        return otURL;
    }

    /**
     * Sets the value of the otURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtURL(String value) {
        this.otURL = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RedirectType }
     *     
     */
    public RedirectType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectType }
     *     
     */
    public void setType(RedirectType value) {
        this.type = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedirectParameter }
     * 
     * 
     */
    public List<RedirectParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<RedirectParameter>();
        }
        return this.parameter;
    }

}
