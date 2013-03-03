
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThreeDRedirectElementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThreeDRedirectElementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="URL"/>
 *     &lt;enumeration value="PAReq"/>
 *     &lt;enumeration value="ThreeDMerchantData"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThreeDRedirectElementType")
@XmlEnum
public enum ThreeDRedirectElementType {

    URL("URL"),
    @XmlEnumValue("PAReq")
    PA_REQ("PAReq"),
    @XmlEnumValue("ThreeDMerchantData")
    THREE_D_MERCHANT_DATA("ThreeDMerchantData");
    private final String value;

    ThreeDRedirectElementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThreeDRedirectElementType fromValue(String v) {
        for (ThreeDRedirectElementType c: ThreeDRedirectElementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
