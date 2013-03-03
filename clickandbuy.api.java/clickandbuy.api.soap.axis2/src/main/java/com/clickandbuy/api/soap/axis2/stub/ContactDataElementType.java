
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactDataElementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactDataElementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ContactType"/>
 *     &lt;enumeration value="Department"/>
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="IPAddress"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="URL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactDataElementType")
@XmlEnum
public enum ContactDataElementType {

    @XmlEnumValue("ContactType")
    CONTACT_TYPE("ContactType"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("IPAddress")
    IP_ADDRESS("IPAddress"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    URL("URL");
    private final String value;

    ContactDataElementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactDataElementType fromValue(String v) {
        for (ContactDataElementType c: ContactDataElementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
