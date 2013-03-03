
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchItemStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchItemStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="PENDING_EXECUTION"/>
 *     &lt;enumeration value="EXECUTING"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchItemStatus")
@XmlEnum
public enum BatchItemStatus {

    CREATED,
    CANCELLED,
    SUCCESS,
    PENDING_EXECUTION,
    EXECUTING,
    ERROR;

    public String value() {
        return name();
    }

    public static BatchItemStatus fromValue(String v) {
        return valueOf(v);
    }

}
