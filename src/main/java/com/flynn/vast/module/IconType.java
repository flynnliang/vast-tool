//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.26 时间 02:41:13 PM CST 
//


package com.flynn.vast.module;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Icon_type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Icon_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="StaticResource" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *                   &lt;attribute name="creativeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="IFrameResource" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *           &lt;element name="HTMLResource" type="{}HTMLResource_type" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="IconClicks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IconClickTracking" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="IconClickThrough" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IconViewTracking" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="program" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="xPosition" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="([0-9]*|left|right)"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="yPosition" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="([0-9]*|top|bottom)"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Icon_type", propOrder = {
    "staticResource",
    "iFrameResource",
    "htmlResource",
    "iconClicks",
    "iconViewTracking"
})
public class IconType {

    @XmlElement(name = "StaticResource")
    protected IconType.StaticResource staticResource;
    @XmlElement(name = "IFrameResource")
    @XmlSchemaType(name = "anyURI")
    protected String iFrameResource;
    @XmlElement(name = "HTMLResource")
    protected HTMLResourceType htmlResource;
    @XmlElement(name = "IconClicks")
    protected IconType.IconClicks iconClicks;
    @XmlElement(name = "IconViewTracking")
    @XmlSchemaType(name = "anyURI")
    protected List<String> iconViewTracking;
    @XmlAttribute(name = "program", required = true)
    protected String program;
    @XmlAttribute(name = "width", required = true)
    protected BigInteger width;
    @XmlAttribute(name = "height", required = true)
    protected BigInteger height;
    @XmlAttribute(name = "xPosition", required = true)
    protected String xPosition;
    @XmlAttribute(name = "yPosition", required = true)
    protected String yPosition;
    @XmlAttribute(name = "offset")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar offset;
    @XmlAttribute(name = "duration")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar duration;
    @XmlAttribute(name = "apiFramework")
    protected String apiFramework;

    /**
     * 获取staticResource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IconType.StaticResource }
     *     
     */
    public IconType.StaticResource getStaticResource() {
        return staticResource;
    }

    /**
     * 设置staticResource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IconType.StaticResource }
     *     
     */
    public void setStaticResource(IconType.StaticResource value) {
        this.staticResource = value;
    }

    /**
     * 获取iFrameResource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFrameResource() {
        return iFrameResource;
    }

    /**
     * 设置iFrameResource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFrameResource(String value) {
        this.iFrameResource = value;
    }

    /**
     * 获取htmlResource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HTMLResourceType }
     *     
     */
    public HTMLResourceType getHTMLResource() {
        return htmlResource;
    }

    /**
     * 设置htmlResource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HTMLResourceType }
     *     
     */
    public void setHTMLResource(HTMLResourceType value) {
        this.htmlResource = value;
    }

    /**
     * 获取iconClicks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IconType.IconClicks }
     *     
     */
    public IconType.IconClicks getIconClicks() {
        return iconClicks;
    }

    /**
     * 设置iconClicks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IconType.IconClicks }
     *     
     */
    public void setIconClicks(IconType.IconClicks value) {
        this.iconClicks = value;
    }

    /**
     * Gets the value of the iconViewTracking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iconViewTracking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIconViewTracking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIconViewTracking() {
        if (iconViewTracking == null) {
            iconViewTracking = new ArrayList<String>();
        }
        return this.iconViewTracking;
    }

    /**
     * 获取program属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgram() {
        return program;
    }

    /**
     * 设置program属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgram(String value) {
        this.program = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * 获取height属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * 获取xPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPosition() {
        return xPosition;
    }

    /**
     * 设置xPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPosition(String value) {
        this.xPosition = value;
    }

    /**
     * 获取yPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYPosition() {
        return yPosition;
    }

    /**
     * 设置yPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYPosition(String value) {
        this.yPosition = value;
    }

    /**
     * 获取offset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOffset() {
        return offset;
    }

    /**
     * 设置offset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOffset(XMLGregorianCalendar value) {
        this.offset = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDuration(XMLGregorianCalendar value) {
        this.duration = value;
    }

    /**
     * 获取apiFramework属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiFramework() {
        return apiFramework;
    }

    /**
     * 设置apiFramework属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiFramework(String value) {
        this.apiFramework = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="IconClickTracking" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IconClickThrough" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "iconClickTracking",
        "iconClickThrough"
    })
    public static class IconClicks {

        @XmlElement(name = "IconClickTracking")
        @XmlSchemaType(name = "anyURI")
        protected List<String> iconClickTracking;
        @XmlElement(name = "IconClickThrough")
        @XmlSchemaType(name = "anyURI")
        protected String iconClickThrough;

        /**
         * Gets the value of the iconClickTracking property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the iconClickTracking property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIconClickTracking().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIconClickTracking() {
            if (iconClickTracking == null) {
                iconClickTracking = new ArrayList<String>();
            }
            return this.iconClickTracking;
        }

        /**
         * 获取iconClickThrough属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIconClickThrough() {
            return iconClickThrough;
        }

        /**
         * 设置iconClickThrough属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIconClickThrough(String value) {
            this.iconClickThrough = value;
        }

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
     *       &lt;attribute name="creativeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class StaticResource {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected String value;
        @XmlAttribute(name = "creativeType", required = true)
        protected String creativeType;

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
         * 获取creativeType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreativeType() {
            return creativeType;
        }

        /**
         * 设置creativeType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreativeType(String value) {
            this.creativeType = value;
        }

    }

}
