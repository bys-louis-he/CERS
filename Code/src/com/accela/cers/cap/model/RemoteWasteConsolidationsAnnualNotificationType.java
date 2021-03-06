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
 * <p>Java class for RemoteWasteConsolidationsAnnualNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoteWasteConsolidationsAnnualNotificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}SubmittalElementBaseType">
 *       &lt;sequence>
 *         &lt;element name="SubmittalElementHeader" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}SubmittalElementHeaderType"/>
 *         &lt;element name="RWConsolidationSites" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}RWConsolidationSitesType" minOccurs="0"/>
 *         &lt;element name="RWLocallyCollectedDocuments" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}DocumentType" minOccurs="0"/>
 *         &lt;element name="RWMiscellaneousStateRequiredDocuments" type="{http://cersservices.calepa.ca.gov/Schemas/RegulatorFacilitySubmittalQuery/1/05/}DocumentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteWasteConsolidationsAnnualNotificationType", propOrder = {
    "submittalElementHeader",
    "rwConsolidationSites",
    "rwLocallyCollectedDocuments",
    "rwMiscellaneousStateRequiredDocuments"
})
public class RemoteWasteConsolidationsAnnualNotificationType
    extends SubmittalElementBaseType
{

    @XmlElement(name = "SubmittalElementHeader", required = true)
    protected SubmittalElementHeaderType submittalElementHeader;
    @XmlElement(name = "RWConsolidationSites")
    protected RWConsolidationSitesType rwConsolidationSites;
    @XmlElement(name = "RWLocallyCollectedDocuments")
    protected DocumentType rwLocallyCollectedDocuments;
    @XmlElement(name = "RWMiscellaneousStateRequiredDocuments")
    protected DocumentType rwMiscellaneousStateRequiredDocuments;

    /**
     * Gets the value of the submittalElementHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SubmittalElementHeaderType }
     *     
     */
    public SubmittalElementHeaderType getSubmittalElementHeader() {
        return submittalElementHeader;
    }

    /**
     * Sets the value of the submittalElementHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmittalElementHeaderType }
     *     
     */
    public void setSubmittalElementHeader(SubmittalElementHeaderType value) {
        this.submittalElementHeader = value;
    }

    /**
     * Gets the value of the rwConsolidationSites property.
     * 
     * @return
     *     possible object is
     *     {@link RWConsolidationSitesType }
     *     
     */
    public RWConsolidationSitesType getRWConsolidationSites() {
        return rwConsolidationSites;
    }

    /**
     * Sets the value of the rwConsolidationSites property.
     * 
     * @param value
     *     allowed object is
     *     {@link RWConsolidationSitesType }
     *     
     */
    public void setRWConsolidationSites(RWConsolidationSitesType value) {
        this.rwConsolidationSites = value;
    }

    /**
     * Gets the value of the rwLocallyCollectedDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getRWLocallyCollectedDocuments() {
        return rwLocallyCollectedDocuments;
    }

    /**
     * Sets the value of the rwLocallyCollectedDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setRWLocallyCollectedDocuments(DocumentType value) {
        this.rwLocallyCollectedDocuments = value;
    }

    /**
     * Gets the value of the rwMiscellaneousStateRequiredDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getRWMiscellaneousStateRequiredDocuments() {
        return rwMiscellaneousStateRequiredDocuments;
    }

    /**
     * Sets the value of the rwMiscellaneousStateRequiredDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setRWMiscellaneousStateRequiredDocuments(DocumentType value) {
        this.rwMiscellaneousStateRequiredDocuments = value;
    }

}
