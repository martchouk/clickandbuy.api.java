
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * structure containing the status for a given transaction ID or external ID,  or a structure containing error-information about the given transaction ID.
 * 
 * <p>Java class for TransactionIDStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionIDStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalID" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ExternalID" minOccurs="0"/>
 *         &lt;element name="crn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="transactionStatus" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}TransactionStatus" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}TransactionType" minOccurs="0"/>
 *         &lt;element name="errorDetails" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}ErrorDetails" minOccurs="0"/>
 *         &lt;element name="redirectURL" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}URL" minOccurs="0"/>
 *         &lt;element name="createdRecurringPaymentAuthorization" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}RecurringPaymentAuthorizationIDStatus" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIDStatus", propOrder = {

})
public class TransactionIDStatus {

    protected Long transactionID;
    protected String externalID;
    protected Long crn;
    protected TransactionStatus transactionStatus;
    protected TransactionType transactionType;
    protected ErrorDetails errorDetails;
    protected String redirectURL;
    protected RecurringPaymentAuthorizationIDStatus createdRecurringPaymentAuthorization;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionID(Long value) {
        this.transactionID = value;
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
     * Gets the value of the crn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCrn() {
        return crn;
    }

    /**
     * Sets the value of the crn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCrn(Long value) {
        this.crn = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus }
     *     
     */
    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus }
     *     
     */
    public void setTransactionStatus(TransactionStatus value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
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

    /**
     * Gets the value of the redirectURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectURL() {
        return redirectURL;
    }

    /**
     * Sets the value of the redirectURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectURL(String value) {
        this.redirectURL = value;
    }

    /**
     * Gets the value of the createdRecurringPaymentAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringPaymentAuthorizationIDStatus }
     *     
     */
    public RecurringPaymentAuthorizationIDStatus getCreatedRecurringPaymentAuthorization() {
        return createdRecurringPaymentAuthorization;
    }

    /**
     * Sets the value of the createdRecurringPaymentAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringPaymentAuthorizationIDStatus }
     *     
     */
    public void setCreatedRecurringPaymentAuthorization(RecurringPaymentAuthorizationIDStatus value) {
        this.createdRecurringPaymentAuthorization = value;
    }

}
