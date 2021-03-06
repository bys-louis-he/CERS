//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.21 at 02:38:20 PM GMT+08:00 
//


package com.accela.cers.cap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HWUnitCESWType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HWUnitCESWType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="TreatingResinsMixed" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}YesNoFlagType" minOccurs="0"/>
 *           &lt;element name="TreatingContainerLessCapacity" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}YesNoFlagType" minOccurs="0"/>
 *           &lt;element name="DryingSpecialWastes" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}YesNoFlagType" minOccurs="0"/>
 *           &lt;element name="MagneticSeparationOrScreening" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}YesNoFlagType" minOccurs="0"/>
 *           &lt;element name="SettlingOfSolids" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}YesNoFlagType" minOccurs="0"/>
 *           &lt;element name="SeparationOfOilWaterMixtures" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}YesNoFlagType" minOccurs="0"/>
 *           &lt;element name="NeutralizingAcidicOrAlkaline" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}YesNoFlagType" minOccurs="0"/>
 *           &lt;element name="HazardousWasteTreatmentCarried" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}YesNoFlagType" minOccurs="0"/>
 *           &lt;element name="WastestreamCertifiedTechnologyNumber" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="10"/>
 *                 &lt;minLength value="0"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="FormaldehydeCertifiedTechnologyNumber" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="10"/>
 *                 &lt;minLength value="0"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HWUnitCESWType", propOrder = {
    "treatingResinsMixedOrTreatingContainerLessCapacityOrDryingSpecialWastes"
})
public class HWUnitCESWType {

    @XmlElementRefs({
        @XmlElementRef(name = "HazardousWasteTreatmentCarried", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SettlingOfSolids", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TreatingResinsMixed", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NeutralizingAcidicOrAlkaline", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MagneticSeparationOrScreening", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TreatingContainerLessCapacity", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FormaldehydeCertifiedTechnologyNumber", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SeparationOfOilWaterMixtures", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "WastestreamCertifiedTechnologyNumber", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DryingSpecialWastes", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> treatingResinsMixedOrTreatingContainerLessCapacityOrDryingSpecialWastes;

    /**
     * Gets the value of the treatingResinsMixedOrTreatingContainerLessCapacityOrDryingSpecialWastes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treatingResinsMixedOrTreatingContainerLessCapacityOrDryingSpecialWastes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTreatingResinsMixedOrTreatingContainerLessCapacityOrDryingSpecialWastes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link YesNoFlagType }{@code >}
     * {@link JAXBElement }{@code <}{@link YesNoFlagType }{@code >}
     * {@link JAXBElement }{@code <}{@link YesNoFlagType }{@code >}
     * {@link JAXBElement }{@code <}{@link YesNoFlagType }{@code >}
     * {@link JAXBElement }{@code <}{@link YesNoFlagType }{@code >}
     * {@link JAXBElement }{@code <}{@link YesNoFlagType }{@code >}
     * {@link JAXBElement }{@code <}{@link YesNoFlagType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link YesNoFlagType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getTreatingResinsMixedOrTreatingContainerLessCapacityOrDryingSpecialWastes() {
        if (treatingResinsMixedOrTreatingContainerLessCapacityOrDryingSpecialWastes == null) {
            treatingResinsMixedOrTreatingContainerLessCapacityOrDryingSpecialWastes = new ArrayList<JAXBElement<?>>();
        }
        return this.treatingResinsMixedOrTreatingContainerLessCapacityOrDryingSpecialWastes;
    }

}
