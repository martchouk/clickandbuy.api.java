
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebitCardBrand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DebitCardBrand">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FourB"/>
 *     &lt;enumeration value="Aurore"/>
 *     &lt;enumeration value="Bankcard"/>
 *     &lt;enumeration value="Bancaire"/>
 *     &lt;enumeration value="CarteBleue"/>
 *     &lt;enumeration value="Dankort"/>
 *     &lt;enumeration value="Euro6000"/>
 *     &lt;enumeration value="Laser"/>
 *     &lt;enumeration value="Maestro"/>
 *     &lt;enumeration value="PostePay"/>
 *     &lt;enumeration value="Servired"/>
 *     &lt;enumeration value="Solo"/>
 *     &lt;enumeration value="Switch"/>
 *     &lt;enumeration value="VisaElectron"/>
 *     &lt;enumeration value="VisaPlus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DebitCardBrand")
@XmlEnum
public enum DebitCardBrand {

    @XmlEnumValue("FourB")
    FOUR_B("FourB"),
    @XmlEnumValue("Aurore")
    AURORE("Aurore"),
    @XmlEnumValue("Bankcard")
    BANKCARD("Bankcard"),
    @XmlEnumValue("Bancaire")
    BANCAIRE("Bancaire"),
    @XmlEnumValue("CarteBleue")
    CARTE_BLEUE("CarteBleue"),
    @XmlEnumValue("Dankort")
    DANKORT("Dankort"),
    @XmlEnumValue("Euro6000")
    EURO_6000("Euro6000"),
    @XmlEnumValue("Laser")
    LASER("Laser"),
    @XmlEnumValue("Maestro")
    MAESTRO("Maestro"),
    @XmlEnumValue("PostePay")
    POSTE_PAY("PostePay"),
    @XmlEnumValue("Servired")
    SERVIRED("Servired"),
    @XmlEnumValue("Solo")
    SOLO("Solo"),
    @XmlEnumValue("Switch")
    SWITCH("Switch"),
    @XmlEnumValue("VisaElectron")
    VISA_ELECTRON("VisaElectron"),
    @XmlEnumValue("VisaPlus")
    VISA_PLUS("VisaPlus");
    private final String value;

    DebitCardBrand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DebitCardBrand fromValue(String v) {
        for (DebitCardBrand c: DebitCardBrand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
