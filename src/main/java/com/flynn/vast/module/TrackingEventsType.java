//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.26 时间 02:41:13 PM CST 
//


package com.flynn.vast.module;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>TrackingEvents_type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrackingEvents_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tracking" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *                 &lt;attribute name="event" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                       &lt;enumeration value="creativeView"/&gt;
 *                       &lt;enumeration value="start"/&gt;
 *                       &lt;enumeration value="firstQuartile"/&gt;
 *                       &lt;enumeration value="midpoint"/&gt;
 *                       &lt;enumeration value="thirdQuartile"/&gt;
 *                       &lt;enumeration value="complete"/&gt;
 *                       &lt;enumeration value="mute"/&gt;
 *                       &lt;enumeration value="unmute"/&gt;
 *                       &lt;enumeration value="pause"/&gt;
 *                       &lt;enumeration value="rewind"/&gt;
 *                       &lt;enumeration value="resume"/&gt;
 *                       &lt;enumeration value="fullscreen"/&gt;
 *                       &lt;enumeration value="exitFullscreen"/&gt;
 *                       &lt;enumeration value="expand"/&gt;
 *                       &lt;enumeration value="collapse"/&gt;
 *                       &lt;enumeration value="acceptInvitation"/&gt;
 *                       &lt;enumeration value="close"/&gt;
 *                       &lt;enumeration value="skip"/&gt;
 *                       &lt;enumeration value="progress"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="offset"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingEvents_type", propOrder = {
    "tracking"
})
public class TrackingEventsType {

    @XmlElement(name = "Tracking")
    protected List<TrackingEventsType.Tracking> tracking;

    /**
     * Gets the value of the tracking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tracking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingEventsType.Tracking }
     * 
     * 
     */
    public List<TrackingEventsType.Tracking> getTracking() {
        if (tracking == null) {
            tracking = new ArrayList<TrackingEventsType.Tracking>();
        }
        return this.tracking;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
     *       &lt;attribute name="event" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *             &lt;enumeration value="creativeView"/&gt;
     *             &lt;enumeration value="start"/&gt;
     *             &lt;enumeration value="firstQuartile"/&gt;
     *             &lt;enumeration value="midpoint"/&gt;
     *             &lt;enumeration value="thirdQuartile"/&gt;
     *             &lt;enumeration value="complete"/&gt;
     *             &lt;enumeration value="mute"/&gt;
     *             &lt;enumeration value="unmute"/&gt;
     *             &lt;enumeration value="pause"/&gt;
     *             &lt;enumeration value="rewind"/&gt;
     *             &lt;enumeration value="resume"/&gt;
     *             &lt;enumeration value="fullscreen"/&gt;
     *             &lt;enumeration value="exitFullscreen"/&gt;
     *             &lt;enumeration value="expand"/&gt;
     *             &lt;enumeration value="collapse"/&gt;
     *             &lt;enumeration value="acceptInvitation"/&gt;
     *             &lt;enumeration value="close"/&gt;
     *             &lt;enumeration value="skip"/&gt;
     *             &lt;enumeration value="progress"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="offset"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Tracking {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected String value;
        @XmlAttribute(name = "event", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String event;
        @XmlAttribute(name = "offset")
        protected String offset;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取event属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEvent() {
            return event;
        }

        /**
         * 设置event属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEvent(String value) {
            this.event = value;
        }

        /**
         * 获取offset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffset() {
            return offset;
        }

        /**
         * 设置offset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffset(String value) {
            this.offset = value;
        }

    }

}
