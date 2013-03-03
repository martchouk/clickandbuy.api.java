
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fulfillment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Fulfillment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INSTANT"/>
 *     &lt;enumeration value="DELAYED"/>
 *     &lt;enumeration value="RECURRING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Fulfillment")
@XmlEnum
public enum Fulfillment {

    INSTANT,
    DELAYED,
    RECURRING;

    public String value() {
        return name();
    }

    public static Fulfillment fromValue(String v) {
        return valueOf(v);
    }

}
