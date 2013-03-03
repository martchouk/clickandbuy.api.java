
package com.clickandbuy.api.soap.axis2.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * List of FeeCardAverageTicketSizes
 * 
 * <p>Java class for FeeCardAverageTicketSizeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeCardAverageTicketSizeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averageTicketSize" type="{http://api.clickandbuy.com/webservices/pay_1_1_0/}Money" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeCardAverageTicketSizeList", propOrder = {
    "averageTicketSize"
})
public class FeeCardAverageTicketSizeList {

    protected List<Money> averageTicketSize;

    /**
     * Gets the value of the averageTicketSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the averageTicketSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAverageTicketSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Money }
     * 
     * 
     */
    public List<Money> getAverageTicketSize() {
        if (averageTicketSize == null) {
            averageTicketSize = new ArrayList<Money>();
        }
        return this.averageTicketSize;
    }

}
