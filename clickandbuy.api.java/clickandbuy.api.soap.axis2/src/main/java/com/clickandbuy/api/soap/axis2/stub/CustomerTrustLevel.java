
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerTrustLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerTrustLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNVERIFIED"/>
 *     &lt;enumeration value="VERIFIED"/>
 *     &lt;enumeration value="PREFERRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerTrustLevel")
@XmlEnum
public enum CustomerTrustLevel {

    UNVERIFIED,
    VERIFIED,
    PREFERRED;

    public String value() {
        return name();
    }

    public static CustomerTrustLevel fromValue(String v) {
        return valueOf(v);
    }

}
