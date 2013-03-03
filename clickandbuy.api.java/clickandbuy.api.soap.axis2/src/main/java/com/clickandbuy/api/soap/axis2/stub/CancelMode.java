
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TX"/>
 *     &lt;enumeration value="RPA"/>
 *     &lt;enumeration value="BOTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CancelMode")
@XmlEnum
public enum CancelMode {

    TX,
    RPA,
    BOTH;

    public String value() {
        return name();
    }

    public static CancelMode fromValue(String v) {
        return valueOf(v);
    }

}
