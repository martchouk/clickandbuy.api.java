
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchantRiskClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MerchantRiskClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VERYLOW"/>
 *     &lt;enumeration value="LOW"/>
 *     &lt;enumeration value="MEDIUM"/>
 *     &lt;enumeration value="HIGH"/>
 *     &lt;enumeration value="VERYHIGH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MerchantRiskClass")
@XmlEnum
public enum MerchantRiskClass {

    VERYLOW,
    LOW,
    MEDIUM,
    HIGH,
    VERYHIGH;

    public String value() {
        return name();
    }

    public static MerchantRiskClass fromValue(String v) {
        return valueOf(v);
    }

}
