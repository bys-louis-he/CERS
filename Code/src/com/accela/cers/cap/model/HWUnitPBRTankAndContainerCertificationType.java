//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.21 at 02:38:20 PM GMT+08:00 
//


package com.accela.cers.cap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HWUnitPBRTankAndContainerCertificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HWUnitPBRTankAndContainerCertificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HWPBRTankAndContainerCertificationDocument" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}DocumentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HWUnitPBRTankAndContainerCertificationType", propOrder = {
    "hwpbrTankAndContainerCertificationDocument"
})
public class HWUnitPBRTankAndContainerCertificationType {

    @XmlElement(name = "HWPBRTankAndContainerCertificationDocument", required = true)
    protected DocumentType hwpbrTankAndContainerCertificationDocument;

    /**
     * Gets the value of the hwpbrTankAndContainerCertificationDocument property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getHWPBRTankAndContainerCertificationDocument() {
        return hwpbrTankAndContainerCertificationDocument;
    }

    /**
     * Sets the value of the hwpbrTankAndContainerCertificationDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setHWPBRTankAndContainerCertificationDocument(DocumentType value) {
        this.hwpbrTankAndContainerCertificationDocument = value;
    }

}
