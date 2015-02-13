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
 * <p>Java class for assetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalInformationGroupIds" type="{}additionalInformationGroupIds" minOccurs="0"/>
 *         &lt;element name="assetIcon" type="{}document" minOccurs="0"/>
 *         &lt;element name="assetSecurity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAPTypeIds" type="{}capTypeIds" minOccurs="0"/>
 *         &lt;element name="classType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gisAttributeMappings" type="{}gisAttributeMappings" minOccurs="0"/>
 *         &lt;element name="gisIDForAssetID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gisLayerId" type="{}gisLayerId" minOccurs="0"/>
 *         &lt;element name="gisService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifierDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keys" type="{}keys" minOccurs="0"/>
 *         &lt;element name="securities" type="{}entities" minOccurs="0"/>
 *         &lt;element name="sizeRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usageTypes" type="{}types" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetType", propOrder = {
    "additionalInformationGroupIds",
    "assetIcon",
    "assetSecurity",
    "capTypeIds",
    "classType",
    "description",
    "gisAttributeMappings",
    "gisIDForAssetID",
    "gisLayerId",
    "gisService",
    "group",
    "identifierDisplay",
    "keys",
    "securities",
    "sizeRequired",
    "type",
    "usageTypes"
})
public class AssetType {

    protected AdditionalInformationGroupIds additionalInformationGroupIds;
    protected Document assetIcon;
    protected String assetSecurity;
    @XmlElement(name = "CAPTypeIds")
    protected CapTypeIds capTypeIds;
    protected String classType;
    protected String description;
    protected GisAttributeMappings gisAttributeMappings;
    protected String gisIDForAssetID;
    protected GisLayerId gisLayerId;
    protected String gisService;
    protected String group;
    protected String identifierDisplay;
    protected Keys keys;
    protected Entities securities;
    protected String sizeRequired;
    protected String type;
    protected Types usageTypes;

    /**
     * Gets the value of the additionalInformationGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformationGroupIds }
     *     
     */
    public AdditionalInformationGroupIds getAdditionalInformationGroupIds() {
        return additionalInformationGroupIds;
    }

    /**
     * Sets the value of the additionalInformationGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformationGroupIds }
     *     
     */
    public void setAdditionalInformationGroupIds(AdditionalInformationGroupIds value) {
        this.additionalInformationGroupIds = value;
    }

    /**
     * Gets the value of the assetIcon property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getAssetIcon() {
        return assetIcon;
    }

    /**
     * Sets the value of the assetIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setAssetIcon(Document value) {
        this.assetIcon = value;
    }

    /**
     * Gets the value of the assetSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetSecurity() {
        return assetSecurity;
    }

    /**
     * Sets the value of the assetSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetSecurity(String value) {
        this.assetSecurity = value;
    }

    /**
     * Gets the value of the capTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link CapTypeIds }
     *     
     */
    public CapTypeIds getCAPTypeIds() {
        return capTypeIds;
    }

    /**
     * Sets the value of the capTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapTypeIds }
     *     
     */
    public void setCAPTypeIds(CapTypeIds value) {
        this.capTypeIds = value;
    }

    /**
     * Gets the value of the classType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassType() {
        return classType;
    }

    /**
     * Sets the value of the classType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassType(String value) {
        this.classType = value;
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
     * Gets the value of the gisAttributeMappings property.
     * 
     * @return
     *     possible object is
     *     {@link GisAttributeMappings }
     *     
     */
    public GisAttributeMappings getGisAttributeMappings() {
        return gisAttributeMappings;
    }

    /**
     * Sets the value of the gisAttributeMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link GisAttributeMappings }
     *     
     */
    public void setGisAttributeMappings(GisAttributeMappings value) {
        this.gisAttributeMappings = value;
    }

    /**
     * Gets the value of the gisIDForAssetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGisIDForAssetID() {
        return gisIDForAssetID;
    }

    /**
     * Sets the value of the gisIDForAssetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGisIDForAssetID(String value) {
        this.gisIDForAssetID = value;
    }

    /**
     * Gets the value of the gisLayerId property.
     * 
     * @return
     *     possible object is
     *     {@link GisLayerId }
     *     
     */
    public GisLayerId getGisLayerId() {
        return gisLayerId;
    }

    /**
     * Sets the value of the gisLayerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GisLayerId }
     *     
     */
    public void setGisLayerId(GisLayerId value) {
        this.gisLayerId = value;
    }

    /**
     * Gets the value of the gisService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGisService() {
        return gisService;
    }

    /**
     * Sets the value of the gisService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGisService(String value) {
        this.gisService = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the identifierDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierDisplay() {
        return identifierDisplay;
    }

    /**
     * Sets the value of the identifierDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierDisplay(String value) {
        this.identifierDisplay = value;
    }

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link Keys }
     *     
     */
    public Keys getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Keys }
     *     
     */
    public void setKeys(Keys value) {
        this.keys = value;
    }

    /**
     * Gets the value of the securities property.
     * 
     * @return
     *     possible object is
     *     {@link Entities }
     *     
     */
    public Entities getSecurities() {
        return securities;
    }

    /**
     * Sets the value of the securities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entities }
     *     
     */
    public void setSecurities(Entities value) {
        this.securities = value;
    }

    /**
     * Gets the value of the sizeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeRequired() {
        return sizeRequired;
    }

    /**
     * Sets the value of the sizeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeRequired(String value) {
        this.sizeRequired = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the usageTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Types }
     *     
     */
    public Types getUsageTypes() {
        return usageTypes;
    }

    /**
     * Sets the value of the usageTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Types }
     *     
     */
    public void setUsageTypes(Types value) {
        this.usageTypes = value;
    }

}