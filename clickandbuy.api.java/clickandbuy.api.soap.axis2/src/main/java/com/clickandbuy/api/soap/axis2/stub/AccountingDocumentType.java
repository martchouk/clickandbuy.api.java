
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountingDocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="Settlement"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="ManualCreditNote"/>
 *     &lt;enumeration value="ManualDebitNote"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountingDocumentType")
@XmlEnum
public enum AccountingDocumentType {

    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Settlement")
    SETTLEMENT("Settlement"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("ManualCreditNote")
    MANUAL_CREDIT_NOTE("ManualCreditNote"),
    @XmlEnumValue("ManualDebitNote")
    MANUAL_DEBIT_NOTE("ManualDebitNote"),
    OTHER("OTHER");
    private final String value;

    AccountingDocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountingDocumentType fromValue(String v) {
        for (AccountingDocumentType c: AccountingDocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
