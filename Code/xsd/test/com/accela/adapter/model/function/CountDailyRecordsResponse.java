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
 * <p>Java class for countDailyRecordsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="countDailyRecordsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{}operationResponse">
 *       &lt;sequence>
 *         &lt;element name="dailyRecords" type="{}dailyRecords" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countDailyRecordsResponse", propOrder = {
    "dailyRecords"
})
public class CountDailyRecordsResponse
    extends OperationResponse
{

    protected DailyRecords dailyRecords;

    /**
     * Gets the value of the dailyRecords property.
     * 
     * @return
     *     possible object is
     *     {@link DailyRecords }
     *     
     */
    public DailyRecords getDailyRecords() {
        return dailyRecords;
    }

    /**
     * Sets the value of the dailyRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyRecords }
     *     
     */
    public void setDailyRecords(DailyRecords value) {
        this.dailyRecords = value;
    }

}
