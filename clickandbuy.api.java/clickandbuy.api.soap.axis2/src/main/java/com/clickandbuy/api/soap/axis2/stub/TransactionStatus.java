
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="PENDING_VERIFICATION"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="ABORTED"/>
 *     &lt;enumeration value="DECLINED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="IN_PROGRESS"/>
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="PAYMENT_PENDING"/>
 *     &lt;enumeration value="BOOKED_OUT"/>
 *     &lt;enumeration value="BOOKED_IN"/>
 *     &lt;enumeration value="PAYMENT_GUARANTEE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionStatus")
@XmlEnum
public enum TransactionStatus {

    CREATED,
    PENDING_VERIFICATION,
    EXPIRED,
    ABORTED,
    DECLINED,
    CANCELLED,
    IN_PROGRESS,
    SUCCESS,
    PAYMENT_PENDING,
    BOOKED_OUT,
    BOOKED_IN,
    PAYMENT_GUARANTEE;

    public String value() {
        return name();
    }

    public static TransactionStatus fromValue(String v) {
        return valueOf(v);
    }

}
