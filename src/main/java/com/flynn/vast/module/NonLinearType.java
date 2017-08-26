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
 * <p>NonLinear_type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NonLinear_type"&gt;
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
 *         &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
 *         &lt;element name="NonLinearClickTracking" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NonLinearClickThrough" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="AdParameters" type="{}AdParameters_type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="expandedWidth" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="expandedHeight" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="minSuggestedDuration" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonLinear_type", propOrder = {
    "staticResource",
    "iFrameResource",
    "htmlResource",
    "creativeExtensions",
    "nonLinearClickTracking",
    "nonLinearClickThrough",
    "adParameters"
})
public class NonLinearType {

    @XmlElement(name = "StaticResource")
    protected NonLinearType.StaticResource staticResource;
    @XmlElement(name = "IFrameResource")
    @XmlSchemaType(name = "anyURI")
    protected String iFrameResource;
    @XmlElement(name = "HTMLResource")
    protected HTMLResourceType htmlResource;
    @XmlElement(name = "CreativeExtensions")
    protected CreativeExtensionsType creativeExtensions;
    @XmlElement(name = "NonLinearClickTracking")
    @XmlSchemaType(name = "anyURI")
    protected List<String> nonLinearClickTracking;
    @XmlElement(name = "NonLinearClickThrough")
    @XmlSchemaType(name = "anyURI")
    protected String nonLinearClickThrough;
    @XmlElement(name = "AdParameters")
    protected AdParametersType adParameters;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "width", required = true)
    protected BigInteger width;
    @XmlAttribute(name = "height", required = true)
    protected BigInteger height;
    @XmlAttribute(name = "expandedWidth")
    protected BigInteger expandedWidth;
    @XmlAttribute(name = "expandedHeight")
    protected BigInteger expandedHeight;
    @XmlAttribute(name = "scalable")
    protected Boolean scalable;
    @XmlAttribute(name = "maintainAspectRatio")
    protected Boolean maintainAspectRatio;
    @XmlAttribute(name = "minSuggestedDuration")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar minSuggestedDuration;
    @XmlAttribute(name = "apiFramework")
    protected String apiFramework;

    /**
     * 获取staticResource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NonLinearType.StaticResource }
     *     
     */
    public NonLinearType.StaticResource getStaticResource() {
        return staticResource;
    }

    /**
     * 设置staticResource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NonLinearType.StaticResource }
     *     
     */
    public void setStaticResource(NonLinearType.StaticResource value) {
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
     * 获取creativeExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CreativeExtensionsType }
     *     
     */
    public CreativeExtensionsType getCreativeExtensions() {
        return creativeExtensions;
    }

    /**
     * 设置creativeExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeExtensionsType }
     *     
     */
    public void setCreativeExtensions(CreativeExtensionsType value) {
        this.creativeExtensions = value;
    }

    /**
     * Gets the value of the nonLinearClickTracking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonLinearClickTracking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonLinearClickTracking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNonLinearClickTracking() {
        if (nonLinearClickTracking == null) {
            nonLinearClickTracking = new ArrayList<String>();
        }
        return this.nonLinearClickTracking;
    }

    /**
     * 获取nonLinearClickThrough属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonLinearClickThrough() {
        return nonLinearClickThrough;
    }

    /**
     * 设置nonLinearClickThrough属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonLinearClickThrough(String value) {
        this.nonLinearClickThrough = value;
    }

    /**
     * 获取adParameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdParametersType }
     *     
     */
    public AdParametersType getAdParameters() {
        return adParameters;
    }

    /**
     * 设置adParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdParametersType }
     *     
     */
    public void setAdParameters(AdParametersType value) {
        this.adParameters = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * 获取expandedWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpandedWidth() {
        return expandedWidth;
    }

    /**
     * 设置expandedWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpandedWidth(BigInteger value) {
        this.expandedWidth = value;
    }

    /**
     * 获取expandedHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpandedHeight() {
        return expandedHeight;
    }

    /**
     * 设置expandedHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpandedHeight(BigInteger value) {
        this.expandedHeight = value;
    }

    /**
     * 获取scalable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScalable() {
        return scalable;
    }

    /**
     * 设置scalable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScalable(Boolean value) {
        this.scalable = value;
    }

    /**
     * 获取maintainAspectRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaintainAspectRatio() {
        return maintainAspectRatio;
    }

    /**
     * 设置maintainAspectRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaintainAspectRatio(Boolean value) {
        this.maintainAspectRatio = value;
    }

    /**
     * 获取minSuggestedDuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinSuggestedDuration() {
        return minSuggestedDuration;
    }

    /**
     * 设置minSuggestedDuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinSuggestedDuration(XMLGregorianCalendar value) {
        this.minSuggestedDuration = value;
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
