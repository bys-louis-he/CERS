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
 * <p>Java class for inspectionUnitNumbers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inspectionUnitNumbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inspectionUnitNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inspectionUnitNumberEnumerations" type="{}enumerations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inspectionUnitNumbers", propOrder = {
    "inspectionUnitNumber",
    "inspectionUnitNumberEnumerations"
})
public class InspectionUnitNumbers {

    @XmlElement(nillable = true)
    protected List<Object> inspectionUnitNumber;
    protected Enumerations inspectionUnitNumberEnumerations;

    /**
     * Gets the value of the inspectionUnitNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inspectionUnitNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInspectionUnitNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getInspectionUnitNumber() {
        if (inspectionUnitNumber == null) {
            inspectionUnitNumber = new ArrayList<Object>();
        }
        return this.inspectionUnitNumber;
    }

    /**
     * Gets the value of the inspectionUnitNumberEnumerations property.
     * 
     * @return
     *     possible object is
     *     {@link Enumerations }
     *     
     */
    public Enumerations getInspectionUnitNumberEnumerations() {
        return inspectionUnitNumberEnumerations;
    }

    /**
     * Sets the value of the inspectionUnitNumberEnumerations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enumerations }
     *     
     */
    public void setInspectionUnitNumberEnumerations(Enumerations value) {
        this.inspectionUnitNumberEnumerations = value;
    }

}