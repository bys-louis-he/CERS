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
 * <p>Java class for getTimeAccountingGroupsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTimeAccountingGroupsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{}operationResponse">
 *       &lt;sequence>
 *         &lt;element name="timeAccountingGroups" type="{}timeAccountingGroups" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTimeAccountingGroupsResponse", propOrder = {
    "timeAccountingGroups"
})
public class GetTimeAccountingGroupsResponse
    extends OperationResponse
{

    protected TimeAccountingGroups timeAccountingGroups;

    /**
     * Gets the value of the timeAccountingGroups property.
     * 
     * @return
     *     possible object is
     *     {@link TimeAccountingGroups }
     *     
     */
    public TimeAccountingGroups getTimeAccountingGroups() {
        return timeAccountingGroups;
    }

    /**
     * Sets the value of the timeAccountingGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAccountingGroups }
     *     
     */
    public void setTimeAccountingGroups(TimeAccountingGroups value) {
        this.timeAccountingGroups = value;
    }

}
