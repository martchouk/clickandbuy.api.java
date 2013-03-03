
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * structure for GetAccountingDocument details
 * 
 * <p>Java class for GetAccountingDocumentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountingDocumentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="date" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}DateRange" minOccurs="0"/>
 *         &lt;element name="documentType" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}AccountingDocumentType" minOccurs="0"/>
 *         &lt;element name="fileType" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}AccountingFileType" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}AccountingFileName" minOccurs="0"/>
 *         &lt;element name="documentNumber" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}IntRange" minOccurs="0"/>
 *         &lt;element name="paging" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}PagingSetting" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountingDocumentDetails", propOrder = {

})
public class GetAccountingDocumentDetails {

    protected DateRange date;
    protected AccountingDocumentType documentType;
    protected AccountingFileType fileType;
    protected String fileName;
    protected IntRange documentNumber;
    protected PagingSetting paging;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setDate(DateRange value) {
        this.date = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingDocumentType }
     *     
     */
    public AccountingDocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingDocumentType }
     *     
     */
    public void setDocumentType(AccountingDocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingFileType }
     *     
     */
    public AccountingFileType getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingFileType }
     *     
     */
    public void setFileType(AccountingFileType value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setDocumentNumber(IntRange value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link PagingSetting }
     *     
     */
    public PagingSetting getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingSetting }
     *     
     */
    public void setPaging(PagingSetting value) {
        this.paging = value;
    }

}
