
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurringPaymentAuthorizationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecurringPaymentAuthorizationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="PENDING_VERIFICATION"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="ABORTED"/>
 *     &lt;enumeration value="DECLINED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="AUTHORIZED"/>
 *     &lt;enumeration value="EXHAUSTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecurringPaymentAuthorizationStatus")
@XmlEnum
public enum RecurringPaymentAuthorizationStatus {

    CREATED,
    PENDING_VERIFICATION,
    EXPIRED,
    ABORTED,
    DECLINED,
    CANCELLED,
    AUTHORIZED,
    EXHAUSTED;

    public String value() {
        return name();
    }

    public static RecurringPaymentAuthorizationStatus fromValue(String v) {
        return valueOf(v);
    }

}
