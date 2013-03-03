
package com.clickandbuy.api.soap.axis2.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchantRegistrationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MerchantRegistrationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="IN_PROGRESS"/>
 *     &lt;enumeration value="FINISHED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MerchantRegistrationStatus")
@XmlEnum
public enum MerchantRegistrationStatus {

    CREATED,
    IN_PROGRESS,
    FINISHED;

    public String value() {
        return name();
    }

    public static MerchantRegistrationStatus fromValue(String v) {
        return valueOf(v);
    }

}
