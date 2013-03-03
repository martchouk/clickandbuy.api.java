
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREDIT_CARD"/>
 *     &lt;enumeration value="DEBIT_CARD"/>
 *     &lt;enumeration value="DIRECT_DEBIT"/>
 *     &lt;enumeration value="SOFORT"/>
 *     &lt;enumeration value="GIROPAY"/>
 *     &lt;enumeration value="EPS"/>
 *     &lt;enumeration value="IDEAL"/>
 *     &lt;enumeration value="ADVANCED_PAYMENT"/>
 *     &lt;enumeration value="ECARD"/>
 *     &lt;enumeration value="BOLETO"/>
 *     &lt;enumeration value="ACH"/>
 *     &lt;enumeration value="WALLET"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="INVOICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodName")
@XmlEnum
public enum PaymentMethodName {

    CREDIT_CARD,
    DEBIT_CARD,
    DIRECT_DEBIT,
    SOFORT,
    GIROPAY,
    EPS,
    IDEAL,
    ADVANCED_PAYMENT,
    ECARD,
    BOLETO,
    ACH,
    WALLET,
    MOBILE,
    INVOICE;

    public String value() {
        return name();
    }

    public static PaymentMethodName fromValue(String v) {
        return valueOf(v);
    }

}
