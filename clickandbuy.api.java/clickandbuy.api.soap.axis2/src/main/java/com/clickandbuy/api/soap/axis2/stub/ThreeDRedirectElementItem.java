
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThreeDRedirectElementItem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThreeDRedirectElementItem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TermURL"/>
 *     &lt;enumeration value="PaReq"/>
 *     &lt;enumeration value="MD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThreeDRedirectElementItem")
@XmlEnum
public enum ThreeDRedirectElementItem {

    @XmlEnumValue("TermURL")
    TERM_URL("TermURL"),
    @XmlEnumValue("PaReq")
    PA_REQ("PaReq"),
    MD("MD");
    private final String value;

    ThreeDRedirectElementItem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThreeDRedirectElementItem fromValue(String v) {
        for (ThreeDRedirectElementItem c: ThreeDRedirectElementItem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
