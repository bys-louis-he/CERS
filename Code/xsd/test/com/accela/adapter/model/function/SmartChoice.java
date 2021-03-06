//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.04 at 06:33:27 PM CST 
//


package com.accela.adapter.model.function;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for smartChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="smartChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blockName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="groupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requiredFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smartChoiceOptions" type="{}smartChoiceOptions" minOccurs="0"/>
 *         &lt;element name="validateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "smartChoice", propOrder = {
    "blockName",
    "defaultValue",
    "displayFlag",
    "displayOrder",
    "groupCode",
    "requiredFlag",
    "smartChoiceOptions",
    "validateFlag"
})
public class SmartChoice {

    protected String blockName;
    protected String defaultValue;
    protected String displayFlag;
    protected Integer displayOrder;
    protected String groupCode;
    protected String requiredFlag;
    protected SmartChoiceOptions smartChoiceOptions;
    protected String validateFlag;

    /**
     * Gets the value of the blockName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockName() {
        return blockName;
    }

    /**
     * Sets the value of the blockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockName(String value) {
        this.blockName = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the displayFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFlag() {
        return displayFlag;
    }

    /**
     * Sets the value of the displayFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFlag(String value) {
        this.displayFlag = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the requiredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredFlag() {
        return requiredFlag;
    }

    /**
     * Sets the value of the requiredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredFlag(String value) {
        this.requiredFlag = value;
    }

    /**
     * Gets the value of the smartChoiceOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SmartChoiceOptions }
     *     
     */
    public SmartChoiceOptions getSmartChoiceOptions() {
        return smartChoiceOptions;
    }

    /**
     * Sets the value of the smartChoiceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartChoiceOptions }
     *     
     */
    public void setSmartChoiceOptions(SmartChoiceOptions value) {
        this.smartChoiceOptions = value;
    }

    /**
     * Gets the value of the validateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateFlag() {
        return validateFlag;
    }

    /**
     * Sets the value of the validateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateFlag(String value) {
        this.validateFlag = value;
    }

}
