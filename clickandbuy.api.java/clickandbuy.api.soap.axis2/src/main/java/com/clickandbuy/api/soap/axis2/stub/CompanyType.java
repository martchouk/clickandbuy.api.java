
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOLETRADER"/>
 *     &lt;enumeration value="PUBLIC"/>
 *     &lt;enumeration value="PRIVATE"/>
 *     &lt;enumeration value="FOUNDATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanyType")
@XmlEnum
public enum CompanyType {

    SOLETRADER,
    PUBLIC,
    PRIVATE,
    FOUNDATION;

    public String value() {
        return name();
    }

    public static CompanyType fromValue(String v) {
        return valueOf(v);
    }

}
