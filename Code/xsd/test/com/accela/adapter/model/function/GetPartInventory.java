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
 * <p>Java class for getPartInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPartInventory">
 *   &lt;complexContent>
 *     &lt;extension base="{}operationRequest">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partIds" type="{}partIds" minOccurs="0"/>
 *         &lt;element name="partNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partType" type="{}partType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPartInventory", propOrder = {
    "description",
    "partBrand",
    "partIds",
    "partNbr",
    "partType"
})
public class GetPartInventory
    extends OperationRequest
{

    protected String description;
    protected String partBrand;
    protected PartIds partIds;
    protected String partNbr;
    protected PartType partType;

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
     * Gets the value of the partBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartBrand() {
        return partBrand;
    }

    /**
     * Sets the value of the partBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartBrand(String value) {
        this.partBrand = value;
    }

    /**
     * Gets the value of the partIds property.
     * 
     * @return
     *     possible object is
     *     {@link PartIds }
     *     
     */
    public PartIds getPartIds() {
        return partIds;
    }

    /**
     * Sets the value of the partIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartIds }
     *     
     */
    public void setPartIds(PartIds value) {
        this.partIds = value;
    }

    /**
     * Gets the value of the partNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNbr() {
        return partNbr;
    }

    /**
     * Sets the value of the partNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNbr(String value) {
        this.partNbr = value;
    }

    /**
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link PartType }
     *     
     */
    public PartType getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartType }
     *     
     */
    public void setPartType(PartType value) {
        this.partType = value;
    }

}
