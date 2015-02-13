//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.04 at 06:33:27 PM CST 
//


package com.accela.adapter.model.function;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fInitiateCAPIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fInitiateCAPIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicant" type="{}applicant" minOccurs="0"/>
 *         &lt;element name="CAPId" type="{}capId" minOccurs="0"/>
 *         &lt;element name="CAPTypeId" type="{}capTypeId" minOccurs="0"/>
 *         &lt;element name="contacts" type="{}contacts" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detailAddress" type="{}detailAddress" minOccurs="0"/>
 *         &lt;element name="finalizeNow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GISObjects" type="{}gisObjects" minOccurs="0"/>
 *         &lt;element name="licenses" type="{}licenses" minOccurs="0"/>
 *         &lt;element name="parcelId" type="{}parcelId" minOccurs="0"/>
 *         &lt;element name="parentCAPIds" type="{}parentCAPIds" minOccurs="0"/>
 *         &lt;element name="system" type="{}system" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fInitiateCAPIn", propOrder = {
    "applicant",
    "capId",
    "capTypeId",
    "contacts",
    "description",
    "detailAddress",
    "finalizeNow",
    "gisObjects",
    "licenses",
    "parcelId",
    "parentCAPIds",
    "system"
})
public class FInitiateCAPIn {

    protected Applicant applicant;
    @XmlElement(name = "CAPId")
    protected CapId capId;
    @XmlElement(name = "CAPTypeId")
    protected CapTypeId capTypeId;
    protected Contacts contacts;
    protected String description;
    protected DetailAddress detailAddress;
    protected String finalizeNow;
    @XmlElement(name = "GISObjects")
    protected GisObjects gisObjects;
    protected Licenses licenses;
    protected ParcelId parcelId;
    protected ParentCAPIds parentCAPIds;
    protected System system;

    /**
     * Gets the value of the applicant property.
     * 
     * @return
     *     possible object is
     *     {@link Applicant }
     *     
     */
    public Applicant getApplicant() {
        return applicant;
    }

    /**
     * Sets the value of the applicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Applicant }
     *     
     */
    public void setApplicant(Applicant value) {
        this.applicant = value;
    }

    /**
     * Gets the value of the capId property.
     * 
     * @return
     *     possible object is
     *     {@link CapId }
     *     
     */
    public CapId getCAPId() {
        return capId;
    }

    /**
     * Sets the value of the capId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapId }
     *     
     */
    public void setCAPId(CapId value) {
        this.capId = value;
    }

    /**
     * Gets the value of the capTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link CapTypeId }
     *     
     */
    public CapTypeId getCAPTypeId() {
        return capTypeId;
    }

    /**
     * Sets the value of the capTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapTypeId }
     *     
     */
    public void setCAPTypeId(CapTypeId value) {
        this.capTypeId = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link Contacts }
     *     
     */
    public Contacts getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contacts }
     *     
     */
    public void setContacts(Contacts value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the detailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DetailAddress }
     *     
     */
    public DetailAddress getDetailAddress() {
        return detailAddress;
    }

    /**
     * Sets the value of the detailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailAddress }
     *     
     */
    public void setDetailAddress(DetailAddress value) {
        this.detailAddress = value;
    }

    /**
     * Gets the value of the finalizeNow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalizeNow() {
        return finalizeNow;
    }

    /**
     * Sets the value of the finalizeNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalizeNow(String value) {
        this.finalizeNow = value;
    }

    /**
     * Gets the value of the gisObjects property.
     * 
     * @return
     *     possible object is
     *     {@link GisObjects }
     *     
     */
    public GisObjects getGISObjects() {
        return gisObjects;
    }

    /**
     * Sets the value of the gisObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link GisObjects }
     *     
     */
    public void setGISObjects(GisObjects value) {
        this.gisObjects = value;
    }

    /**
     * Gets the value of the licenses property.
     * 
     * @return
     *     possible object is
     *     {@link Licenses }
     *     
     */
    public Licenses getLicenses() {
        return licenses;
    }

    /**
     * Sets the value of the licenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Licenses }
     *     
     */
    public void setLicenses(Licenses value) {
        this.licenses = value;
    }

    /**
     * Gets the value of the parcelId property.
     * 
     * @return
     *     possible object is
     *     {@link ParcelId }
     *     
     */
    public ParcelId getParcelId() {
        return parcelId;
    }

    /**
     * Sets the value of the parcelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParcelId }
     *     
     */
    public void setParcelId(ParcelId value) {
        this.parcelId = value;
    }

    /**
     * Gets the value of the parentCAPIds property.
     * 
     * @return
     *     possible object is
     *     {@link ParentCAPIds }
     *     
     */
    public ParentCAPIds getParentCAPIds() {
        return parentCAPIds;
    }

    /**
     * Sets the value of the parentCAPIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentCAPIds }
     *     
     */
    public void setParentCAPIds(ParentCAPIds value) {
        this.parentCAPIds = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link System }
     *     
     */
    public System getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link System }
     *     
     */
    public void setSystem(System value) {
        this.system = value;
    }

}