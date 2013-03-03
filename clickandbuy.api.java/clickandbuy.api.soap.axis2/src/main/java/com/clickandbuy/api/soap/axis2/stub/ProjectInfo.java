
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about a Merchant Integration Project
 * 
 * <p>Java class for ProjectInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="projectName" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ProjectName" minOccurs="0"/>
 *         &lt;element name="projectSharedSecret" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ProjectSharedSecret"/>
 *         &lt;element name="mmsURL" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}URL" minOccurs="0"/>
 *         &lt;element name="mmsSharedSecret" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}MmsSharedSecret" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectInfo", propOrder = {
    "projectID",
    "projectName",
    "projectSharedSecret",
    "mmsURL",
    "mmsSharedSecret"
})
public class ProjectInfo {

    protected long projectID;
    protected String projectName;
    @XmlElement(required = true)
    protected String projectSharedSecret;
    protected String mmsURL;
    protected String mmsSharedSecret;

    /**
     * Gets the value of the projectID property.
     * 
     */
    public long getProjectID() {
        return projectID;
    }

    /**
     * Sets the value of the projectID property.
     * 
     */
    public void setProjectID(long value) {
        this.projectID = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the projectSharedSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectSharedSecret() {
        return projectSharedSecret;
    }

    /**
     * Sets the value of the projectSharedSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectSharedSecret(String value) {
        this.projectSharedSecret = value;
    }

    /**
     * Gets the value of the mmsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsURL() {
        return mmsURL;
    }

    /**
     * Sets the value of the mmsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsURL(String value) {
        this.mmsURL = value;
    }

    /**
     * Gets the value of the mmsSharedSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsSharedSecret() {
        return mmsSharedSecret;
    }

    /**
     * Sets the value of the mmsSharedSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsSharedSecret(String value) {
        this.mmsSharedSecret = value;
    }

}
