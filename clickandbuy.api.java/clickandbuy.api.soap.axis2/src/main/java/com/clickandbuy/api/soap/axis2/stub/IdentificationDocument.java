
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationDocument.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentificationDocument">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PASSPORT"/>
 *     &lt;enumeration value="ID_CARD"/>
 *     &lt;enumeration value="DRIVERS_LICENSE"/>
 *     &lt;enumeration value="TAX_STATEMENT"/>
 *     &lt;enumeration value="POST_IDENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdentificationDocument")
@XmlEnum
public enum IdentificationDocument {

    PASSPORT,
    ID_CARD,
    DRIVERS_LICENSE,
    TAX_STATEMENT,
    POST_IDENT;

    public String value() {
        return name();
    }

    public static IdentificationDocument fromValue(String v) {
        return valueOf(v);
    }

}
