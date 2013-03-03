
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDetailItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderDetailItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="ITEM"/>
 *     &lt;enumeration value="SUBTOTAL"/>
 *     &lt;enumeration value="VAT"/>
 *     &lt;enumeration value="TOTAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderDetailItemType")
@XmlEnum
public enum OrderDetailItemType {

    TEXT,
    ITEM,
    SUBTOTAL,
    VAT,
    TOTAL;

    public String value() {
        return name();
    }

    public static OrderDetailItemType fromValue(String v) {
        return valueOf(v);
    }

}
