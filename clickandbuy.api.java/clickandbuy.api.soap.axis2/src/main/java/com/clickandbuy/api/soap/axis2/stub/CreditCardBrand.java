
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardBrand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditCardBrand">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Amex"/>
 *     &lt;enumeration value="Aurore"/>
 *     &lt;enumeration value="DinersClub"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="Jcb"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="Visa"/>
 *     &lt;enumeration value="UnionPay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditCardBrand")
@XmlEnum
public enum CreditCardBrand {

    @XmlEnumValue("Amex")
    AMEX("Amex"),
    @XmlEnumValue("Aurore")
    AURORE("Aurore"),
    @XmlEnumValue("DinersClub")
    DINERS_CLUB("DinersClub"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("Jcb")
    JCB("Jcb"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("Visa")
    VISA("Visa"),
    @XmlEnumValue("UnionPay")
    UNION_PAY("UnionPay");
    private final String value;

    CreditCardBrand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditCardBrand fromValue(String v) {
        for (CreditCardBrand c: CreditCardBrand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
