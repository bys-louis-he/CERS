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
 * <p>Java class for PipeContinuousType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PipeContinuousType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="PipingSecondaryContainment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PanelManufacturer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PanelModelNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PipeLeakSensorManufacturer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PipeLeakSensorModel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LeakAlarmTriggPumpShutdown" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}YesNoFlagType" minOccurs="0"/>
 *         &lt;element name="FailureTriggPumpShutdown" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}YesNoFlagType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PipeContinuousType", propOrder = {
    "pipingSecondaryContainmentOrPanelManufacturerOrPanelModelNum"
})
public class PipeContinuousType {

    @XmlElementRefs({
        @XmlElementRef(name = "PipeLeakSensorModel", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PipeLeakSensorManufacturer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PanelModelNum", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PipingSecondaryContainment", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FailureTriggPumpShutdown", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PanelManufacturer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LeakAlarmTriggPumpShutdown", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> pipingSecondaryContainmentOrPanelManufacturerOrPanelModelNum;

    /**
     * Gets the value of the pipingSecondaryContainmentOrPanelManufacturerOrPanelModelNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pipingSecondaryContainmentOrPanelManufacturerOrPanelModelNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPipingSecondaryContainmentOrPanelManufacturerOrPanelModelNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link YesNoFlagType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link YesNoFlagType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPipingSecondaryContainmentOrPanelManufacturerOrPanelModelNum() {
        if (pipingSecondaryContainmentOrPanelManufacturerOrPanelModelNum == null) {
            pipingSecondaryContainmentOrPanelManufacturerOrPanelModelNum = new ArrayList<JAXBElement<?>>();
        }
        return this.pipingSecondaryContainmentOrPanelManufacturerOrPanelModelNum;
    }

}
