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
 * <p>Java class for getGuideSheetHistoriesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGuideSheetHistoriesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guideItemsHistory" type="{}guideItemsHistory" minOccurs="0"/>
 *         &lt;element name="guideSheetHistories" type="{}guideSheetHistories" minOccurs="0"/>
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
@XmlType(name = "getGuideSheetHistoriesResponse", propOrder = {
    "guideItemsHistory",
    "guideSheetHistories",
    "system"
})
public class GetGuideSheetHistoriesResponse {

    protected GuideItemsHistory guideItemsHistory;
    protected GuideSheetHistories guideSheetHistories;
    protected System system;

    /**
     * Gets the value of the guideItemsHistory property.
     * 
     * @return
     *     possible object is
     *     {@link GuideItemsHistory }
     *     
     */
    public GuideItemsHistory getGuideItemsHistory() {
        return guideItemsHistory;
    }

    /**
     * Sets the value of the guideItemsHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuideItemsHistory }
     *     
     */
    public void setGuideItemsHistory(GuideItemsHistory value) {
        this.guideItemsHistory = value;
    }

    /**
     * Gets the value of the guideSheetHistories property.
     * 
     * @return
     *     possible object is
     *     {@link GuideSheetHistories }
     *     
     */
    public GuideSheetHistories getGuideSheetHistories() {
        return guideSheetHistories;
    }

    /**
     * Sets the value of the guideSheetHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuideSheetHistories }
     *     
     */
    public void setGuideSheetHistories(GuideSheetHistories value) {
        this.guideSheetHistories = value;
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
