//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.04 at 06:33:27 PM CST 
//


package com.accela.adapter.model.function;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for smartChoiceGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="smartChoiceGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smartChoiceGroups" type="{}smartChoiceGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "smartChoiceGroups", propOrder = {
    "smartChoiceGroups"
})
public class SmartChoiceGroups {

    @XmlElement(nillable = true)
    protected List<SmartChoiceGroup> smartChoiceGroups;

    /**
     * Gets the value of the smartChoiceGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smartChoiceGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmartChoiceGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmartChoiceGroup }
     * 
     * 
     */
    public List<SmartChoiceGroup> getSmartChoiceGroups() {
        if (smartChoiceGroups == null) {
            smartChoiceGroups = new ArrayList<SmartChoiceGroup>();
        }
        return this.smartChoiceGroups;
    }

}
