//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.21 at 02:38:20 PM GMT+08:00 
//


package com.accela.cers.cap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitsRecyclableMaterialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitsRecyclableMaterialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="b"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitsRecyclableMaterialType")
@XmlEnum
public enum UnitsRecyclableMaterialType {

    @XmlEnumValue("a")
    A("a"),
    @XmlEnumValue("b")
    B("b");
    private final String value;

    UnitsRecyclableMaterialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitsRecyclableMaterialType fromValue(String v) {
        for (UnitsRecyclableMaterialType c: UnitsRecyclableMaterialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
