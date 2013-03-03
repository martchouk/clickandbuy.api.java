
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PREPAID"/>
 *     &lt;enumeration value="NOWPAID"/>
 *     &lt;enumeration value="POSTPAID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentModel")
@XmlEnum
public enum PaymentModel {

    PREPAID,
    NOWPAID,
    POSTPAID;

    public String value() {
        return name();
    }

    public static PaymentModel fromValue(String v) {
        return valueOf(v);
    }

}
