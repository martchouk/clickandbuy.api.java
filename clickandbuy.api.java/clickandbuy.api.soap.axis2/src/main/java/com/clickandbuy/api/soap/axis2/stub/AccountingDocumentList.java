
package com.clickandbuy.api.soap.axis2.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * the list of resulting documents
 * 
 * <p>Java class for AccountingDocumentList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingDocumentList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paging" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}PagingInfo"/>
 *         &lt;element name="document" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}AccountingDocument" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingDocumentList", propOrder = {
    "paging",
    "document"
})
public class AccountingDocumentList {

    @XmlElement(required = true)
    protected PagingInfo paging;
    protected List<AccountingDocument> document;

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link PagingInfo }
     *     
     */
    public PagingInfo getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingInfo }
     *     
     */
    public void setPaging(PagingInfo value) {
        this.paging = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingDocument }
     * 
     * 
     */
    public List<AccountingDocument> getDocument() {
        if (document == null) {
            document = new ArrayList<AccountingDocument>();
        }
        return this.document;
    }

}
