
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactDataElementItem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactDataElementItem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="department"/>
 *     &lt;enumeration value="phone"/>
 *     &lt;enumeration value="mobile"/>
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="ip"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="www"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactDataElementItem")
@XmlEnum
public enum ContactDataElementItem {

    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("department")
    DEPARTMENT("department"),
    @XmlEnumValue("phone")
    PHONE("phone"),
    @XmlEnumValue("mobile")
    MOBILE("mobile"),
    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("ip")
    IP("ip"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("www")
    WWW("www");
    private final String value;

    ContactDataElementItem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactDataElementItem fromValue(String v) {
        for (ContactDataElementItem c: ContactDataElementItem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
