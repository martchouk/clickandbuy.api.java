
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountingDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementAccountID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="documentType" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}AccountingDocumentType"/>
 *         &lt;element name="fileType" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}AccountingFileType"/>
 *         &lt;element name="fileName" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}AccountingFileName"/>
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="documentLinks" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}AccountingDocumentLinks"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingDocument", propOrder = {
    "settlementAccountID",
    "date",
    "documentType",
    "fileType",
    "fileName",
    "documentNumber",
    "documentLinks"
})
public class AccountingDocument {

    protected long settlementAccountID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected AccountingDocumentType documentType;
    @XmlElement(required = true)
    protected AccountingFileType fileType;
    @XmlElement(required = true)
    protected String fileName;
    protected int documentNumber;
    @XmlElement(required = true)
    protected AccountingDocumentLinks documentLinks;

    /**
     * Gets the value of the settlementAccountID property.
     * 
     */
    public long getSettlementAccountID() {
        return settlementAccountID;
    }

    /**
     * Sets the value of the settlementAccountID property.
     * 
     */
    public void setSettlementAccountID(long value) {
        this.settlementAccountID = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
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
     */
    public int getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     */
    public void setDocumentNumber(int value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentLinks property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingDocumentLinks }
     *     
     */
    public AccountingDocumentLinks getDocumentLinks() {
        return documentLinks;
    }

    /**
     * Sets the value of the documentLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingDocumentLinks }
     *     
     */
    public void setDocumentLinks(AccountingDocumentLinks value) {
        this.documentLinks = value;
    }

}
