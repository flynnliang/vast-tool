//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.26 时间 02:41:13 PM CST 
//


package com.flynn.vast.module;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Ad" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="InLine" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AdSystem" type="{}AdSystem_type"/&gt;
 *                             &lt;element name="AdTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Advertiser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Pricing" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *                                     &lt;attribute name="model" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                           &lt;enumeration value="cpc"/&gt;
 *                                           &lt;enumeration value="cpm"/&gt;
 *                                           &lt;enumeration value="cpe"/&gt;
 *                                           &lt;enumeration value="cpv"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="currency" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;pattern value="[a-zA-Z]{3}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Survey" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *                             &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *                             &lt;element name="Impression" type="{}Impression_type" maxOccurs="unbounded"/&gt;
 *                             &lt;element name="Creatives"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Creative" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;choice&gt;
 *                                                 &lt;element name="Linear" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Icons" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
 *                                                           &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *                                                           &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
 *                                                           &lt;element name="AdParameters" type="{}AdParameters_type" minOccurs="0"/&gt;
 *                                                           &lt;element name="VideoClicks" type="{}VideoClicks_type" minOccurs="0"/&gt;
 *                                                           &lt;element name="MediaFiles" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="MediaFile" maxOccurs="unbounded"&gt;
 *                                                                       &lt;complexType&gt;
 *                                                                         &lt;simpleContent&gt;
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *                                                                             &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                             &lt;attribute name="delivery" use="required"&gt;
 *                                                                               &lt;simpleType&gt;
 *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                                                   &lt;enumeration value="streaming"/&gt;
 *                                                                                   &lt;enumeration value="progressive"/&gt;
 *                                                                                 &lt;/restriction&gt;
 *                                                                               &lt;/simpleType&gt;
 *                                                                             &lt;/attribute&gt;
 *                                                                             &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                             &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                                                             &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                                                             &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                                                             &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                                                             &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                                                             &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                                             &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                                             &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                             &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                           &lt;/extension&gt;
 *                                                                         &lt;/simpleContent&gt;
 *                                                                       &lt;/complexType&gt;
 *                                                                     &lt;/element&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                         &lt;attribute name="skipoffset"&gt;
 *                                                           &lt;simpleType&gt;
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                               &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/&gt;
 *                                                             &lt;/restriction&gt;
 *                                                           &lt;/simpleType&gt;
 *                                                         &lt;/attribute&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="CompanionAds" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Companion" type="{}Companion_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                         &lt;attribute name="required"&gt;
 *                                                           &lt;simpleType&gt;
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                               &lt;enumeration value="all"/&gt;
 *                                                               &lt;enumeration value="any"/&gt;
 *                                                               &lt;enumeration value="none"/&gt;
 *                                                             &lt;/restriction&gt;
 *                                                           &lt;/simpleType&gt;
 *                                                         &lt;/attribute&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="NonLinearAds" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
 *                                                           &lt;element name="NonLinear" type="{}NonLinear_type" maxOccurs="unbounded"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/choice&gt;
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                               &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Extensions" type="{}Extensions_type" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Wrapper" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AdSystem" type="{}AdSystem_type"/&gt;
 *                             &lt;element name="VASTAdTagURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                             &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *                             &lt;element name="Impression" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&gt;
 *                             &lt;element name="Creatives"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Creative" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;choice&gt;
 *                                                 &lt;element name="Linear" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
 *                                                           &lt;element name="Icons" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
 *                                                           &lt;element name="VideoClicks" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                                       &lt;complexType&gt;
 *                                                                         &lt;simpleContent&gt;
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *                                                                             &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                           &lt;/extension&gt;
 *                                                                         &lt;/simpleContent&gt;
 *                                                                       &lt;/complexType&gt;
 *                                                                     &lt;/element&gt;
 *                                                                     &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                                       &lt;complexType&gt;
 *                                                                         &lt;simpleContent&gt;
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *                                                                             &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                           &lt;/extension&gt;
 *                                                                         &lt;/simpleContent&gt;
 *                                                                       &lt;/complexType&gt;
 *                                                                     &lt;/element&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="CompanionAds" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Companion" type="{}CompanionWrapper_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="NonLinearAds" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
 *                                                           &lt;element name="NonLinear" type="{}NonLinearWrapper_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/choice&gt;
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                               &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Extensions" type="{}Extensions_type" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ad"
})
@XmlRootElement(name = "VAST")
public class VAST {

    @XmlElement(name = "Ad")
    protected List<VAST.Ad> ad;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the ad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VAST.Ad }
     * 
     * 
     */
    public List<VAST.Ad> getAd() {
        if (ad == null) {
            ad = new ArrayList<VAST.Ad>();
        }
        return this.ad;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="InLine" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AdSystem" type="{}AdSystem_type"/&gt;
     *                   &lt;element name="AdTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Advertiser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Pricing" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
     *                           &lt;attribute name="model" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                 &lt;enumeration value="cpc"/&gt;
     *                                 &lt;enumeration value="cpm"/&gt;
     *                                 &lt;enumeration value="cpe"/&gt;
     *                                 &lt;enumeration value="cpv"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="currency" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;pattern value="[a-zA-Z]{3}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Survey" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
     *                   &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
     *                   &lt;element name="Impression" type="{}Impression_type" maxOccurs="unbounded"/&gt;
     *                   &lt;element name="Creatives"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Creative" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;choice&gt;
     *                                       &lt;element name="Linear" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="Icons" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
     *                                                 &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
     *                                                 &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
     *                                                 &lt;element name="AdParameters" type="{}AdParameters_type" minOccurs="0"/&gt;
     *                                                 &lt;element name="VideoClicks" type="{}VideoClicks_type" minOccurs="0"/&gt;
     *                                                 &lt;element name="MediaFiles" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="MediaFile" maxOccurs="unbounded"&gt;
     *                                                             &lt;complexType&gt;
     *                                                               &lt;simpleContent&gt;
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
     *                                                                   &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                                   &lt;attribute name="delivery" use="required"&gt;
     *                                                                     &lt;simpleType&gt;
     *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                                                         &lt;enumeration value="streaming"/&gt;
     *                                                                         &lt;enumeration value="progressive"/&gt;
     *                                                                       &lt;/restriction&gt;
     *                                                                     &lt;/simpleType&gt;
     *                                                                   &lt;/attribute&gt;
     *                                                                   &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                                   &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                                                   &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                                                   &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                                                   &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                                                   &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                                                   &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                                                   &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                                                   &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                                   &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                                 &lt;/extension&gt;
     *                                                               &lt;/simpleContent&gt;
     *                                                             &lt;/complexType&gt;
     *                                                           &lt;/element&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                               &lt;attribute name="skipoffset"&gt;
     *                                                 &lt;simpleType&gt;
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                     &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/&gt;
     *                                                   &lt;/restriction&gt;
     *                                                 &lt;/simpleType&gt;
     *                                               &lt;/attribute&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="CompanionAds" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="Companion" type="{}Companion_type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                               &lt;attribute name="required"&gt;
     *                                                 &lt;simpleType&gt;
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                                     &lt;enumeration value="all"/&gt;
     *                                                     &lt;enumeration value="any"/&gt;
     *                                                     &lt;enumeration value="none"/&gt;
     *                                                   &lt;/restriction&gt;
     *                                                 &lt;/simpleType&gt;
     *                                               &lt;/attribute&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="NonLinearAds" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
     *                                                 &lt;element name="NonLinear" type="{}NonLinear_type" maxOccurs="unbounded"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/choice&gt;
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                     &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Extensions" type="{}Extensions_type" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Wrapper" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AdSystem" type="{}AdSystem_type"/&gt;
     *                   &lt;element name="VASTAdTagURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *                   &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
     *                   &lt;element name="Impression" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&gt;
     *                   &lt;element name="Creatives"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Creative" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;choice&gt;
     *                                       &lt;element name="Linear" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
     *                                                 &lt;element name="Icons" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
     *                                                 &lt;element name="VideoClicks" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                             &lt;complexType&gt;
     *                                                               &lt;simpleContent&gt;
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
     *                                                                   &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                                 &lt;/extension&gt;
     *                                                               &lt;/simpleContent&gt;
     *                                                             &lt;/complexType&gt;
     *                                                           &lt;/element&gt;
     *                                                           &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                             &lt;complexType&gt;
     *                                                               &lt;simpleContent&gt;
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
     *                                                                   &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                                 &lt;/extension&gt;
     *                                                               &lt;/simpleContent&gt;
     *                                                             &lt;/complexType&gt;
     *                                                           &lt;/element&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="CompanionAds" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="Companion" type="{}CompanionWrapper_type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="NonLinearAds" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
     *                                                 &lt;element name="NonLinear" type="{}NonLinearWrapper_type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/choice&gt;
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                     &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Extensions" type="{}Extensions_type" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inLine",
        "wrapper"
    })
    public static class Ad {

        @XmlElement(name = "InLine")
        protected VAST.Ad.InLine inLine;
        @XmlElement(name = "Wrapper")
        protected VAST.Ad.Wrapper wrapper;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "sequence")
        protected BigInteger sequence;

        /**
         * 获取inLine属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VAST.Ad.InLine }
         *     
         */
        public VAST.Ad.InLine getInLine() {
            return inLine;
        }

        /**
         * 设置inLine属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VAST.Ad.InLine }
         *     
         */
        public void setInLine(VAST.Ad.InLine value) {
            this.inLine = value;
        }

        /**
         * 获取wrapper属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VAST.Ad.Wrapper }
         *     
         */
        public VAST.Ad.Wrapper getWrapper() {
            return wrapper;
        }

        /**
         * 设置wrapper属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VAST.Ad.Wrapper }
         *     
         */
        public void setWrapper(VAST.Ad.Wrapper value) {
            this.wrapper = value;
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
         * 获取sequence属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequence() {
            return sequence;
        }

        /**
         * 设置sequence属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequence(BigInteger value) {
            this.sequence = value;
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
         *         &lt;element name="AdSystem" type="{}AdSystem_type"/&gt;
         *         &lt;element name="AdTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Advertiser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Pricing" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
         *                 &lt;attribute name="model" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                       &lt;enumeration value="cpc"/&gt;
         *                       &lt;enumeration value="cpm"/&gt;
         *                       &lt;enumeration value="cpe"/&gt;
         *                       &lt;enumeration value="cpv"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="currency" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;pattern value="[a-zA-Z]{3}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Survey" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
         *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
         *         &lt;element name="Impression" type="{}Impression_type" maxOccurs="unbounded"/&gt;
         *         &lt;element name="Creatives"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Creative" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;choice&gt;
         *                             &lt;element name="Linear" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="Icons" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
         *                                               &lt;/sequence&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
         *                                       &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
         *                                       &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
         *                                       &lt;element name="AdParameters" type="{}AdParameters_type" minOccurs="0"/&gt;
         *                                       &lt;element name="VideoClicks" type="{}VideoClicks_type" minOccurs="0"/&gt;
         *                                       &lt;element name="MediaFiles" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="MediaFile" maxOccurs="unbounded"&gt;
         *                                                   &lt;complexType&gt;
         *                                                     &lt;simpleContent&gt;
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
         *                                                         &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                                         &lt;attribute name="delivery" use="required"&gt;
         *                                                           &lt;simpleType&gt;
         *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                                               &lt;enumeration value="streaming"/&gt;
         *                                                               &lt;enumeration value="progressive"/&gt;
         *                                                             &lt;/restriction&gt;
         *                                                           &lt;/simpleType&gt;
         *                                                         &lt;/attribute&gt;
         *                                                         &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                                         &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                                                         &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                                                         &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                                                         &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                                                         &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                                                         &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                                         &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                                         &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                                         &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                                       &lt;/extension&gt;
         *                                                     &lt;/simpleContent&gt;
         *                                                   &lt;/complexType&gt;
         *                                                 &lt;/element&gt;
         *                                               &lt;/sequence&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                     &lt;attribute name="skipoffset"&gt;
         *                                       &lt;simpleType&gt;
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                           &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/&gt;
         *                                         &lt;/restriction&gt;
         *                                       &lt;/simpleType&gt;
         *                                     &lt;/attribute&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="CompanionAds" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="Companion" type="{}Companion_type" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                     &lt;attribute name="required"&gt;
         *                                       &lt;simpleType&gt;
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                           &lt;enumeration value="all"/&gt;
         *                                           &lt;enumeration value="any"/&gt;
         *                                           &lt;enumeration value="none"/&gt;
         *                                         &lt;/restriction&gt;
         *                                       &lt;/simpleType&gt;
         *                                     &lt;/attribute&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="NonLinearAds" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
         *                                       &lt;element name="NonLinear" type="{}NonLinear_type" maxOccurs="unbounded"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/choice&gt;
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                           &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Extensions" type="{}Extensions_type" minOccurs="0"/&gt;
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
            "adSystem",
            "adTitle",
            "description",
            "advertiser",
            "pricing",
            "survey",
            "error",
            "impression",
            "creatives",
            "extensions"
        })
        public static class InLine {

            @XmlElement(name = "AdSystem", required = true)
            protected AdSystemType adSystem;
            @XmlElement(name = "AdTitle", required = true)
            protected String adTitle;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "Advertiser")
            protected String advertiser;
            @XmlElement(name = "Pricing")
            protected VAST.Ad.InLine.Pricing pricing;
            @XmlElement(name = "Survey")
            @XmlSchemaType(name = "anyURI")
            protected String survey;
            @XmlElement(name = "Error")
            @XmlSchemaType(name = "anyURI")
            protected String error;
            @XmlElement(name = "Impression", required = true)
            protected List<ImpressionType> impression;
            @XmlElement(name = "Creatives", required = true)
            protected VAST.Ad.InLine.Creatives creatives;
            @XmlElement(name = "Extensions")
            protected ExtensionsType extensions;

            /**
             * 获取adSystem属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AdSystemType }
             *     
             */
            public AdSystemType getAdSystem() {
                return adSystem;
            }

            /**
             * 设置adSystem属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AdSystemType }
             *     
             */
            public void setAdSystem(AdSystemType value) {
                this.adSystem = value;
            }

            /**
             * 获取adTitle属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdTitle() {
                return adTitle;
            }

            /**
             * 设置adTitle属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdTitle(String value) {
                this.adTitle = value;
            }

            /**
             * 获取description属性的值。
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
             * 设置description属性的值。
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
             * 获取advertiser属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdvertiser() {
                return advertiser;
            }

            /**
             * 设置advertiser属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdvertiser(String value) {
                this.advertiser = value;
            }

            /**
             * 获取pricing属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VAST.Ad.InLine.Pricing }
             *     
             */
            public VAST.Ad.InLine.Pricing getPricing() {
                return pricing;
            }

            /**
             * 设置pricing属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VAST.Ad.InLine.Pricing }
             *     
             */
            public void setPricing(VAST.Ad.InLine.Pricing value) {
                this.pricing = value;
            }

            /**
             * 获取survey属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSurvey() {
                return survey;
            }

            /**
             * 设置survey属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSurvey(String value) {
                this.survey = value;
            }

            /**
             * 获取error属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getError() {
                return error;
            }

            /**
             * 设置error属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setError(String value) {
                this.error = value;
            }

            /**
             * Gets the value of the impression property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the impression property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImpression().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImpressionType }
             * 
             * 
             */
            public List<ImpressionType> getImpression() {
                if (impression == null) {
                    impression = new ArrayList<ImpressionType>();
                }
                return this.impression;
            }

            /**
             * 获取creatives属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VAST.Ad.InLine.Creatives }
             *     
             */
            public VAST.Ad.InLine.Creatives getCreatives() {
                return creatives;
            }

            /**
             * 设置creatives属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VAST.Ad.InLine.Creatives }
             *     
             */
            public void setCreatives(VAST.Ad.InLine.Creatives value) {
                this.creatives = value;
            }

            /**
             * 获取extensions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ExtensionsType }
             *     
             */
            public ExtensionsType getExtensions() {
                return extensions;
            }

            /**
             * 设置extensions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ExtensionsType }
             *     
             */
            public void setExtensions(ExtensionsType value) {
                this.extensions = value;
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
             *         &lt;element name="Creative" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;choice&gt;
             *                   &lt;element name="Linear" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="Icons" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
             *                                     &lt;/sequence&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
             *                             &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
             *                             &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
             *                             &lt;element name="AdParameters" type="{}AdParameters_type" minOccurs="0"/&gt;
             *                             &lt;element name="VideoClicks" type="{}VideoClicks_type" minOccurs="0"/&gt;
             *                             &lt;element name="MediaFiles" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="MediaFile" maxOccurs="unbounded"&gt;
             *                                         &lt;complexType&gt;
             *                                           &lt;simpleContent&gt;
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
             *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                               &lt;attribute name="delivery" use="required"&gt;
             *                                                 &lt;simpleType&gt;
             *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *                                                     &lt;enumeration value="streaming"/&gt;
             *                                                     &lt;enumeration value="progressive"/&gt;
             *                                                   &lt;/restriction&gt;
             *                                                 &lt;/simpleType&gt;
             *                                               &lt;/attribute&gt;
             *                                               &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                               &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *                                               &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *                                               &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *                                               &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *                                               &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *                                               &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                                               &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                                               &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                               &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                             &lt;/extension&gt;
             *                                           &lt;/simpleContent&gt;
             *                                         &lt;/complexType&gt;
             *                                       &lt;/element&gt;
             *                                     &lt;/sequence&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                           &lt;attribute name="skipoffset"&gt;
             *                             &lt;simpleType&gt;
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                 &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/&gt;
             *                               &lt;/restriction&gt;
             *                             &lt;/simpleType&gt;
             *                           &lt;/attribute&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="CompanionAds" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="Companion" type="{}Companion_type" maxOccurs="unbounded" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                           &lt;attribute name="required"&gt;
             *                             &lt;simpleType&gt;
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *                                 &lt;enumeration value="all"/&gt;
             *                                 &lt;enumeration value="any"/&gt;
             *                                 &lt;enumeration value="none"/&gt;
             *                               &lt;/restriction&gt;
             *                             &lt;/simpleType&gt;
             *                           &lt;/attribute&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="NonLinearAds" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
             *                             &lt;element name="NonLinear" type="{}NonLinear_type" maxOccurs="unbounded"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/choice&gt;
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *                 &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
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
            @XmlType(name = "", propOrder = {
                "creative"
            })
            public static class Creatives {

                @XmlElement(name = "Creative", required = true)
                protected List<VAST.Ad.InLine.Creatives.Creative> creative;

                /**
                 * Gets the value of the creative property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the creative property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCreative().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VAST.Ad.InLine.Creatives.Creative }
                 * 
                 * 
                 */
                public List<VAST.Ad.InLine.Creatives.Creative> getCreative() {
                    if (creative == null) {
                        creative = new ArrayList<VAST.Ad.InLine.Creatives.Creative>();
                    }
                    return this.creative;
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
                 *       &lt;choice&gt;
                 *         &lt;element name="Linear" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="Icons" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
                 *                           &lt;/sequence&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
                 *                   &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
                 *                   &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
                 *                   &lt;element name="AdParameters" type="{}AdParameters_type" minOccurs="0"/&gt;
                 *                   &lt;element name="VideoClicks" type="{}VideoClicks_type" minOccurs="0"/&gt;
                 *                   &lt;element name="MediaFiles" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="MediaFile" maxOccurs="unbounded"&gt;
                 *                               &lt;complexType&gt;
                 *                                 &lt;simpleContent&gt;
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
                 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                                     &lt;attribute name="delivery" use="required"&gt;
                 *                                       &lt;simpleType&gt;
                 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
                 *                                           &lt;enumeration value="streaming"/&gt;
                 *                                           &lt;enumeration value="progressive"/&gt;
                 *                                         &lt;/restriction&gt;
                 *                                       &lt;/simpleType&gt;
                 *                                     &lt;/attribute&gt;
                 *                                     &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                                     &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *                                     &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *                                     &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *                                     &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *                                     &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *                                     &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *                                     &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *                                     &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                                     &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                                   &lt;/extension&gt;
                 *                                 &lt;/simpleContent&gt;
                 *                               &lt;/complexType&gt;
                 *                             &lt;/element&gt;
                 *                           &lt;/sequence&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *                 &lt;attribute name="skipoffset"&gt;
                 *                   &lt;simpleType&gt;
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                       &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/&gt;
                 *                     &lt;/restriction&gt;
                 *                   &lt;/simpleType&gt;
                 *                 &lt;/attribute&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="CompanionAds" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="Companion" type="{}Companion_type" maxOccurs="unbounded" minOccurs="0"/&gt;
                 *                 &lt;/sequence&gt;
                 *                 &lt;attribute name="required"&gt;
                 *                   &lt;simpleType&gt;
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
                 *                       &lt;enumeration value="all"/&gt;
                 *                       &lt;enumeration value="any"/&gt;
                 *                       &lt;enumeration value="none"/&gt;
                 *                     &lt;/restriction&gt;
                 *                   &lt;/simpleType&gt;
                 *                 &lt;/attribute&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="NonLinearAds" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
                 *                   &lt;element name="NonLinear" type="{}NonLinear_type" maxOccurs="unbounded"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/choice&gt;
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *       &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "linear",
                    "companionAds",
                    "nonLinearAds"
                })
                public static class Creative {

                    @XmlElement(name = "Linear")
                    protected VAST.Ad.InLine.Creatives.Creative.Linear linear;
                    @XmlElement(name = "CompanionAds")
                    protected VAST.Ad.InLine.Creatives.Creative.CompanionAds companionAds;
                    @XmlElement(name = "NonLinearAds")
                    protected VAST.Ad.InLine.Creatives.Creative.NonLinearAds nonLinearAds;
                    @XmlAttribute(name = "id")
                    protected String id;
                    @XmlAttribute(name = "sequence")
                    protected BigInteger sequence;
                    @XmlAttribute(name = "AdID")
                    protected String adID;

                    /**
                     * 获取linear属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link VAST.Ad.InLine.Creatives.Creative.Linear }
                     *     
                     */
                    public VAST.Ad.InLine.Creatives.Creative.Linear getLinear() {
                        return linear;
                    }

                    /**
                     * 设置linear属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VAST.Ad.InLine.Creatives.Creative.Linear }
                     *     
                     */
                    public void setLinear(VAST.Ad.InLine.Creatives.Creative.Linear value) {
                        this.linear = value;
                    }

                    /**
                     * 获取companionAds属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link VAST.Ad.InLine.Creatives.Creative.CompanionAds }
                     *     
                     */
                    public VAST.Ad.InLine.Creatives.Creative.CompanionAds getCompanionAds() {
                        return companionAds;
                    }

                    /**
                     * 设置companionAds属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VAST.Ad.InLine.Creatives.Creative.CompanionAds }
                     *     
                     */
                    public void setCompanionAds(VAST.Ad.InLine.Creatives.Creative.CompanionAds value) {
                        this.companionAds = value;
                    }

                    /**
                     * 获取nonLinearAds属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link VAST.Ad.InLine.Creatives.Creative.NonLinearAds }
                     *     
                     */
                    public VAST.Ad.InLine.Creatives.Creative.NonLinearAds getNonLinearAds() {
                        return nonLinearAds;
                    }

                    /**
                     * 设置nonLinearAds属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VAST.Ad.InLine.Creatives.Creative.NonLinearAds }
                     *     
                     */
                    public void setNonLinearAds(VAST.Ad.InLine.Creatives.Creative.NonLinearAds value) {
                        this.nonLinearAds = value;
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
                     * 获取sequence属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getSequence() {
                        return sequence;
                    }

                    /**
                     * 设置sequence属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setSequence(BigInteger value) {
                        this.sequence = value;
                    }

                    /**
                     * 获取adID属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdID() {
                        return adID;
                    }

                    /**
                     * 设置adID属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdID(String value) {
                        this.adID = value;
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
                     *         &lt;element name="Companion" type="{}Companion_type" maxOccurs="unbounded" minOccurs="0"/&gt;
                     *       &lt;/sequence&gt;
                     *       &lt;attribute name="required"&gt;
                     *         &lt;simpleType&gt;
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
                     *             &lt;enumeration value="all"/&gt;
                     *             &lt;enumeration value="any"/&gt;
                     *             &lt;enumeration value="none"/&gt;
                     *           &lt;/restriction&gt;
                     *         &lt;/simpleType&gt;
                     *       &lt;/attribute&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "companion"
                    })
                    public static class CompanionAds {

                        @XmlElement(name = "Companion")
                        protected List<CompanionType> companion;
                        @XmlAttribute(name = "required")
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        protected String required;

                        /**
                         * Gets the value of the companion property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the companion property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getCompanion().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link CompanionType }
                         * 
                         * 
                         */
                        public List<CompanionType> getCompanion() {
                            if (companion == null) {
                                companion = new ArrayList<CompanionType>();
                            }
                            return this.companion;
                        }

                        /**
                         * 获取required属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRequired() {
                            return required;
                        }

                        /**
                         * 设置required属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRequired(String value) {
                            this.required = value;
                        }

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
                     *         &lt;element name="Icons" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
                     *                 &lt;/sequence&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
                     *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
                     *         &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
                     *         &lt;element name="AdParameters" type="{}AdParameters_type" minOccurs="0"/&gt;
                     *         &lt;element name="VideoClicks" type="{}VideoClicks_type" minOccurs="0"/&gt;
                     *         &lt;element name="MediaFiles" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="MediaFile" maxOccurs="unbounded"&gt;
                     *                     &lt;complexType&gt;
                     *                       &lt;simpleContent&gt;
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
                     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *                           &lt;attribute name="delivery" use="required"&gt;
                     *                             &lt;simpleType&gt;
                     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
                     *                                 &lt;enumeration value="streaming"/&gt;
                     *                                 &lt;enumeration value="progressive"/&gt;
                     *                               &lt;/restriction&gt;
                     *                             &lt;/simpleType&gt;
                     *                           &lt;/attribute&gt;
                     *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *                           &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                     *                           &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                     *                           &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                     *                           &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                     *                           &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                     *                           &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *                           &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *                           &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *                           &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *                         &lt;/extension&gt;
                     *                       &lt;/simpleContent&gt;
                     *                     &lt;/complexType&gt;
                     *                   &lt;/element&gt;
                     *                 &lt;/sequence&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *       &lt;/sequence&gt;
                     *       &lt;attribute name="skipoffset"&gt;
                     *         &lt;simpleType&gt;
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *             &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/&gt;
                     *           &lt;/restriction&gt;
                     *         &lt;/simpleType&gt;
                     *       &lt;/attribute&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "icons",
                        "creativeExtensions",
                        "duration",
                        "trackingEvents",
                        "adParameters",
                        "videoClicks",
                        "mediaFiles"
                    })
                    public static class Linear {

                        @XmlElement(name = "Icons")
                        protected VAST.Ad.InLine.Creatives.Creative.Linear.Icons icons;
                        @XmlElement(name = "CreativeExtensions")
                        protected CreativeExtensionsType creativeExtensions;
                        @XmlElement(name = "Duration", required = true)
                        @XmlSchemaType(name = "time")
                        protected XMLGregorianCalendar duration;
                        @XmlElement(name = "TrackingEvents")
                        protected TrackingEventsType trackingEvents;
                        @XmlElement(name = "AdParameters")
                        protected AdParametersType adParameters;
                        @XmlElement(name = "VideoClicks")
                        protected VideoClicksType videoClicks;
                        @XmlElement(name = "MediaFiles")
                        protected VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles mediaFiles;
                        @XmlAttribute(name = "skipoffset")
                        protected String skipoffset;

                        /**
                         * 获取icons属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link VAST.Ad.InLine.Creatives.Creative.Linear.Icons }
                         *     
                         */
                        public VAST.Ad.InLine.Creatives.Creative.Linear.Icons getIcons() {
                            return icons;
                        }

                        /**
                         * 设置icons属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VAST.Ad.InLine.Creatives.Creative.Linear.Icons }
                         *     
                         */
                        public void setIcons(VAST.Ad.InLine.Creatives.Creative.Linear.Icons value) {
                            this.icons = value;
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
                         * 获取trackingEvents属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link TrackingEventsType }
                         *     
                         */
                        public TrackingEventsType getTrackingEvents() {
                            return trackingEvents;
                        }

                        /**
                         * 设置trackingEvents属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TrackingEventsType }
                         *     
                         */
                        public void setTrackingEvents(TrackingEventsType value) {
                            this.trackingEvents = value;
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
                         * 获取videoClicks属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link VideoClicksType }
                         *     
                         */
                        public VideoClicksType getVideoClicks() {
                            return videoClicks;
                        }

                        /**
                         * 设置videoClicks属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VideoClicksType }
                         *     
                         */
                        public void setVideoClicks(VideoClicksType value) {
                            this.videoClicks = value;
                        }

                        /**
                         * 获取mediaFiles属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles }
                         *     
                         */
                        public VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles getMediaFiles() {
                            return mediaFiles;
                        }

                        /**
                         * 设置mediaFiles属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles }
                         *     
                         */
                        public void setMediaFiles(VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles value) {
                            this.mediaFiles = value;
                        }

                        /**
                         * 获取skipoffset属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSkipoffset() {
                            return skipoffset;
                        }

                        /**
                         * 设置skipoffset属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSkipoffset(String value) {
                            this.skipoffset = value;
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
                         *         &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
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
                            "icon"
                        })
                        public static class Icons {

                            @XmlElement(name = "Icon", required = true)
                            protected List<IconType> icon;

                            /**
                             * Gets the value of the icon property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the icon property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getIcon().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link IconType }
                             * 
                             * 
                             */
                            public List<IconType> getIcon() {
                                if (icon == null) {
                                    icon = new ArrayList<IconType>();
                                }
                                return this.icon;
                            }

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
                         *         &lt;element name="MediaFile" maxOccurs="unbounded"&gt;
                         *           &lt;complexType&gt;
                         *             &lt;simpleContent&gt;
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
                         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                         *                 &lt;attribute name="delivery" use="required"&gt;
                         *                   &lt;simpleType&gt;
                         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
                         *                       &lt;enumeration value="streaming"/&gt;
                         *                       &lt;enumeration value="progressive"/&gt;
                         *                     &lt;/restriction&gt;
                         *                   &lt;/simpleType&gt;
                         *                 &lt;/attribute&gt;
                         *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                         *                 &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                         *                 &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                         *                 &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                         *                 &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                         *                 &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                         *                 &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                         *                 &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                         *                 &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                         *                 &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                        @XmlType(name = "", propOrder = {
                            "mediaFile"
                        })
                        public static class MediaFiles {

                            @XmlElement(name = "MediaFile", required = true)
                            protected List<VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles.MediaFile> mediaFile;

                            /**
                             * Gets the value of the mediaFile property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the mediaFile property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getMediaFile().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles.MediaFile }
                             * 
                             * 
                             */
                            public List<VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles.MediaFile> getMediaFile() {
                                if (mediaFile == null) {
                                    mediaFile = new ArrayList<VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles.MediaFile>();
                                }
                                return this.mediaFile;
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
                             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                             *       &lt;attribute name="delivery" use="required"&gt;
                             *         &lt;simpleType&gt;
                             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
                             *             &lt;enumeration value="streaming"/&gt;
                             *             &lt;enumeration value="progressive"/&gt;
                             *           &lt;/restriction&gt;
                             *         &lt;/simpleType&gt;
                             *       &lt;/attribute&gt;
                             *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                             *       &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                             *       &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                             *       &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                             *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                             *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                             *       &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                             *       &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                             *       &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                             *       &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                            public static class MediaFile {

                                @XmlValue
                                @XmlSchemaType(name = "anyURI")
                                protected String value;
                                @XmlAttribute(name = "id")
                                protected String id;
                                @XmlAttribute(name = "delivery", required = true)
                                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                                protected String delivery;
                                @XmlAttribute(name = "type", required = true)
                                protected String type;
                                @XmlAttribute(name = "bitrate")
                                protected BigInteger bitrate;
                                @XmlAttribute(name = "minBitrate")
                                protected BigInteger minBitrate;
                                @XmlAttribute(name = "maxBitrate")
                                protected BigInteger maxBitrate;
                                @XmlAttribute(name = "width", required = true)
                                protected BigInteger width;
                                @XmlAttribute(name = "height", required = true)
                                protected BigInteger height;
                                @XmlAttribute(name = "scalable")
                                protected Boolean scalable;
                                @XmlAttribute(name = "maintainAspectRatio")
                                protected Boolean maintainAspectRatio;
                                @XmlAttribute(name = "apiFramework")
                                protected String apiFramework;
                                @XmlAttribute(name = "codec")
                                protected String codec;

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
                                 * 获取delivery属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getDelivery() {
                                    return delivery;
                                }

                                /**
                                 * 设置delivery属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setDelivery(String value) {
                                    this.delivery = value;
                                }

                                /**
                                 * 获取type属性的值。
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
                                 * 设置type属性的值。
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
                                 * 获取bitrate属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public BigInteger getBitrate() {
                                    return bitrate;
                                }

                                /**
                                 * 设置bitrate属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public void setBitrate(BigInteger value) {
                                    this.bitrate = value;
                                }

                                /**
                                 * 获取minBitrate属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public BigInteger getMinBitrate() {
                                    return minBitrate;
                                }

                                /**
                                 * 设置minBitrate属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public void setMinBitrate(BigInteger value) {
                                    this.minBitrate = value;
                                }

                                /**
                                 * 获取maxBitrate属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public BigInteger getMaxBitrate() {
                                    return maxBitrate;
                                }

                                /**
                                 * 设置maxBitrate属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public void setMaxBitrate(BigInteger value) {
                                    this.maxBitrate = value;
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
                                 * 获取codec属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCodec() {
                                    return codec;
                                }

                                /**
                                 * 设置codec属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCodec(String value) {
                                    this.codec = value;
                                }

                            }

                        }

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
                     *         &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
                     *         &lt;element name="NonLinear" type="{}NonLinear_type" maxOccurs="unbounded"/&gt;
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
                        "trackingEvents",
                        "nonLinear"
                    })
                    public static class NonLinearAds {

                        @XmlElement(name = "TrackingEvents")
                        protected TrackingEventsType trackingEvents;
                        @XmlElement(name = "NonLinear", required = true)
                        protected List<NonLinearType> nonLinear;

                        /**
                         * 获取trackingEvents属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link TrackingEventsType }
                         *     
                         */
                        public TrackingEventsType getTrackingEvents() {
                            return trackingEvents;
                        }

                        /**
                         * 设置trackingEvents属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TrackingEventsType }
                         *     
                         */
                        public void setTrackingEvents(TrackingEventsType value) {
                            this.trackingEvents = value;
                        }

                        /**
                         * Gets the value of the nonLinear property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the nonLinear property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getNonLinear().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link NonLinearType }
                         * 
                         * 
                         */
                        public List<NonLinearType> getNonLinear() {
                            if (nonLinear == null) {
                                nonLinear = new ArrayList<NonLinearType>();
                            }
                            return this.nonLinear;
                        }

                    }

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
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
             *       &lt;attribute name="model" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;enumeration value="cpc"/&gt;
             *             &lt;enumeration value="cpm"/&gt;
             *             &lt;enumeration value="cpe"/&gt;
             *             &lt;enumeration value="cpv"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="currency" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;pattern value="[a-zA-Z]{3}"/&gt;
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
            public static class Pricing {

                @XmlValue
                protected BigDecimal value;
                @XmlAttribute(name = "model", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String model;
                @XmlAttribute(name = "currency", required = true)
                protected String currency;

                /**
                 * 获取value属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValue() {
                    return value;
                }

                /**
                 * 设置value属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValue(BigDecimal value) {
                    this.value = value;
                }

                /**
                 * 获取model属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getModel() {
                    return model;
                }

                /**
                 * 设置model属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setModel(String value) {
                    this.model = value;
                }

                /**
                 * 获取currency属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrency() {
                    return currency;
                }

                /**
                 * 设置currency属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrency(String value) {
                    this.currency = value;
                }

            }

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
         *         &lt;element name="AdSystem" type="{}AdSystem_type"/&gt;
         *         &lt;element name="VASTAdTagURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
         *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
         *         &lt;element name="Impression" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&gt;
         *         &lt;element name="Creatives"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Creative" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;choice&gt;
         *                             &lt;element name="Linear" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
         *                                       &lt;element name="Icons" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
         *                                               &lt;/sequence&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
         *                                       &lt;element name="VideoClicks" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0"&gt;
         *                                                   &lt;complexType&gt;
         *                                                     &lt;simpleContent&gt;
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
         *                                                         &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                                       &lt;/extension&gt;
         *                                                     &lt;/simpleContent&gt;
         *                                                   &lt;/complexType&gt;
         *                                                 &lt;/element&gt;
         *                                                 &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0"&gt;
         *                                                   &lt;complexType&gt;
         *                                                     &lt;simpleContent&gt;
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
         *                                                         &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                                       &lt;/extension&gt;
         *                                                     &lt;/simpleContent&gt;
         *                                                   &lt;/complexType&gt;
         *                                                 &lt;/element&gt;
         *                                               &lt;/sequence&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="CompanionAds" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="Companion" type="{}CompanionWrapper_type" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="NonLinearAds" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
         *                                       &lt;element name="NonLinear" type="{}NonLinearWrapper_type" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/choice&gt;
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                           &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Extensions" type="{}Extensions_type" minOccurs="0"/&gt;
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
            "adSystem",
            "vastAdTagURI",
            "error",
            "impression",
            "creatives",
            "extensions"
        })
        public static class Wrapper {

            @XmlElement(name = "AdSystem", required = true)
            protected AdSystemType adSystem;
            @XmlElement(name = "VASTAdTagURI", required = true)
            @XmlSchemaType(name = "anyURI")
            protected String vastAdTagURI;
            @XmlElement(name = "Error")
            @XmlSchemaType(name = "anyURI")
            protected String error;
            @XmlElement(name = "Impression", required = true)
            @XmlSchemaType(name = "anyURI")
            protected List<String> impression;
            @XmlElement(name = "Creatives", required = true)
            protected VAST.Ad.Wrapper.Creatives creatives;
            @XmlElement(name = "Extensions")
            protected ExtensionsType extensions;

            /**
             * 获取adSystem属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AdSystemType }
             *     
             */
            public AdSystemType getAdSystem() {
                return adSystem;
            }

            /**
             * 设置adSystem属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AdSystemType }
             *     
             */
            public void setAdSystem(AdSystemType value) {
                this.adSystem = value;
            }

            /**
             * 获取vastAdTagURI属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVASTAdTagURI() {
                return vastAdTagURI;
            }

            /**
             * 设置vastAdTagURI属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVASTAdTagURI(String value) {
                this.vastAdTagURI = value;
            }

            /**
             * 获取error属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getError() {
                return error;
            }

            /**
             * 设置error属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setError(String value) {
                this.error = value;
            }

            /**
             * Gets the value of the impression property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the impression property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImpression().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getImpression() {
                if (impression == null) {
                    impression = new ArrayList<String>();
                }
                return this.impression;
            }

            /**
             * 获取creatives属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VAST.Ad.Wrapper.Creatives }
             *     
             */
            public VAST.Ad.Wrapper.Creatives getCreatives() {
                return creatives;
            }

            /**
             * 设置creatives属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VAST.Ad.Wrapper.Creatives }
             *     
             */
            public void setCreatives(VAST.Ad.Wrapper.Creatives value) {
                this.creatives = value;
            }

            /**
             * 获取extensions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ExtensionsType }
             *     
             */
            public ExtensionsType getExtensions() {
                return extensions;
            }

            /**
             * 设置extensions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ExtensionsType }
             *     
             */
            public void setExtensions(ExtensionsType value) {
                this.extensions = value;
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
             *         &lt;element name="Creative" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;choice&gt;
             *                   &lt;element name="Linear" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
             *                             &lt;element name="Icons" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
             *                                     &lt;/sequence&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
             *                             &lt;element name="VideoClicks" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0"&gt;
             *                                         &lt;complexType&gt;
             *                                           &lt;simpleContent&gt;
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
             *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                             &lt;/extension&gt;
             *                                           &lt;/simpleContent&gt;
             *                                         &lt;/complexType&gt;
             *                                       &lt;/element&gt;
             *                                       &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0"&gt;
             *                                         &lt;complexType&gt;
             *                                           &lt;simpleContent&gt;
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
             *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                             &lt;/extension&gt;
             *                                           &lt;/simpleContent&gt;
             *                                         &lt;/complexType&gt;
             *                                       &lt;/element&gt;
             *                                     &lt;/sequence&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="CompanionAds" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="Companion" type="{}CompanionWrapper_type" maxOccurs="unbounded" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="NonLinearAds" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
             *                             &lt;element name="NonLinear" type="{}NonLinearWrapper_type" maxOccurs="unbounded" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/choice&gt;
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *                 &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
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
            @XmlType(name = "", propOrder = {
                "creative"
            })
            public static class Creatives {

                @XmlElement(name = "Creative")
                protected List<VAST.Ad.Wrapper.Creatives.Creative> creative;

                /**
                 * Gets the value of the creative property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the creative property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCreative().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VAST.Ad.Wrapper.Creatives.Creative }
                 * 
                 * 
                 */
                public List<VAST.Ad.Wrapper.Creatives.Creative> getCreative() {
                    if (creative == null) {
                        creative = new ArrayList<VAST.Ad.Wrapper.Creatives.Creative>();
                    }
                    return this.creative;
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
                 *       &lt;choice&gt;
                 *         &lt;element name="Linear" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
                 *                   &lt;element name="Icons" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
                 *                           &lt;/sequence&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
                 *                   &lt;element name="VideoClicks" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0"&gt;
                 *                               &lt;complexType&gt;
                 *                                 &lt;simpleContent&gt;
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
                 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                                   &lt;/extension&gt;
                 *                                 &lt;/simpleContent&gt;
                 *                               &lt;/complexType&gt;
                 *                             &lt;/element&gt;
                 *                             &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0"&gt;
                 *                               &lt;complexType&gt;
                 *                                 &lt;simpleContent&gt;
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
                 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                                   &lt;/extension&gt;
                 *                                 &lt;/simpleContent&gt;
                 *                               &lt;/complexType&gt;
                 *                             &lt;/element&gt;
                 *                           &lt;/sequence&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="CompanionAds" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="Companion" type="{}CompanionWrapper_type" maxOccurs="unbounded" minOccurs="0"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="NonLinearAds" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
                 *                   &lt;element name="NonLinear" type="{}NonLinearWrapper_type" maxOccurs="unbounded" minOccurs="0"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/choice&gt;
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *       &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "linear",
                    "companionAds",
                    "nonLinearAds"
                })
                public static class Creative {

                    @XmlElement(name = "Linear")
                    protected VAST.Ad.Wrapper.Creatives.Creative.Linear linear;
                    @XmlElement(name = "CompanionAds")
                    protected VAST.Ad.Wrapper.Creatives.Creative.CompanionAds companionAds;
                    @XmlElement(name = "NonLinearAds")
                    protected VAST.Ad.Wrapper.Creatives.Creative.NonLinearAds nonLinearAds;
                    @XmlAttribute(name = "id")
                    protected String id;
                    @XmlAttribute(name = "sequence")
                    protected BigInteger sequence;
                    @XmlAttribute(name = "AdID")
                    protected String adID;

                    /**
                     * 获取linear属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link VAST.Ad.Wrapper.Creatives.Creative.Linear }
                     *     
                     */
                    public VAST.Ad.Wrapper.Creatives.Creative.Linear getLinear() {
                        return linear;
                    }

                    /**
                     * 设置linear属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VAST.Ad.Wrapper.Creatives.Creative.Linear }
                     *     
                     */
                    public void setLinear(VAST.Ad.Wrapper.Creatives.Creative.Linear value) {
                        this.linear = value;
                    }

                    /**
                     * 获取companionAds属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link VAST.Ad.Wrapper.Creatives.Creative.CompanionAds }
                     *     
                     */
                    public VAST.Ad.Wrapper.Creatives.Creative.CompanionAds getCompanionAds() {
                        return companionAds;
                    }

                    /**
                     * 设置companionAds属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VAST.Ad.Wrapper.Creatives.Creative.CompanionAds }
                     *     
                     */
                    public void setCompanionAds(VAST.Ad.Wrapper.Creatives.Creative.CompanionAds value) {
                        this.companionAds = value;
                    }

                    /**
                     * 获取nonLinearAds属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link VAST.Ad.Wrapper.Creatives.Creative.NonLinearAds }
                     *     
                     */
                    public VAST.Ad.Wrapper.Creatives.Creative.NonLinearAds getNonLinearAds() {
                        return nonLinearAds;
                    }

                    /**
                     * 设置nonLinearAds属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VAST.Ad.Wrapper.Creatives.Creative.NonLinearAds }
                     *     
                     */
                    public void setNonLinearAds(VAST.Ad.Wrapper.Creatives.Creative.NonLinearAds value) {
                        this.nonLinearAds = value;
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
                     * 获取sequence属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getSequence() {
                        return sequence;
                    }

                    /**
                     * 设置sequence属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setSequence(BigInteger value) {
                        this.sequence = value;
                    }

                    /**
                     * 获取adID属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdID() {
                        return adID;
                    }

                    /**
                     * 设置adID属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdID(String value) {
                        this.adID = value;
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
                     *         &lt;element name="Companion" type="{}CompanionWrapper_type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                        "companion"
                    })
                    public static class CompanionAds {

                        @XmlElement(name = "Companion")
                        protected List<CompanionWrapperType> companion;

                        /**
                         * Gets the value of the companion property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the companion property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getCompanion().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link CompanionWrapperType }
                         * 
                         * 
                         */
                        public List<CompanionWrapperType> getCompanion() {
                            if (companion == null) {
                                companion = new ArrayList<CompanionWrapperType>();
                            }
                            return this.companion;
                        }

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
                     *         &lt;element name="CreativeExtensions" type="{}CreativeExtensions_type" minOccurs="0"/&gt;
                     *         &lt;element name="Icons" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
                     *                 &lt;/sequence&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
                     *         &lt;element name="VideoClicks" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0"&gt;
                     *                     &lt;complexType&gt;
                     *                       &lt;simpleContent&gt;
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
                     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *                         &lt;/extension&gt;
                     *                       &lt;/simpleContent&gt;
                     *                     &lt;/complexType&gt;
                     *                   &lt;/element&gt;
                     *                   &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0"&gt;
                     *                     &lt;complexType&gt;
                     *                       &lt;simpleContent&gt;
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
                     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *                         &lt;/extension&gt;
                     *                       &lt;/simpleContent&gt;
                     *                     &lt;/complexType&gt;
                     *                   &lt;/element&gt;
                     *                 &lt;/sequence&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
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
                    @XmlType(name = "", propOrder = {
                        "creativeExtensions",
                        "icons",
                        "trackingEvents",
                        "videoClicks"
                    })
                    public static class Linear {

                        @XmlElement(name = "CreativeExtensions")
                        protected CreativeExtensionsType creativeExtensions;
                        @XmlElement(name = "Icons")
                        protected VAST.Ad.Wrapper.Creatives.Creative.Linear.Icons icons;
                        @XmlElement(name = "TrackingEvents")
                        protected TrackingEventsType trackingEvents;
                        @XmlElement(name = "VideoClicks")
                        protected VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks videoClicks;

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
                         * 获取icons属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link VAST.Ad.Wrapper.Creatives.Creative.Linear.Icons }
                         *     
                         */
                        public VAST.Ad.Wrapper.Creatives.Creative.Linear.Icons getIcons() {
                            return icons;
                        }

                        /**
                         * 设置icons属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VAST.Ad.Wrapper.Creatives.Creative.Linear.Icons }
                         *     
                         */
                        public void setIcons(VAST.Ad.Wrapper.Creatives.Creative.Linear.Icons value) {
                            this.icons = value;
                        }

                        /**
                         * 获取trackingEvents属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link TrackingEventsType }
                         *     
                         */
                        public TrackingEventsType getTrackingEvents() {
                            return trackingEvents;
                        }

                        /**
                         * 设置trackingEvents属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TrackingEventsType }
                         *     
                         */
                        public void setTrackingEvents(TrackingEventsType value) {
                            this.trackingEvents = value;
                        }

                        /**
                         * 获取videoClicks属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks }
                         *     
                         */
                        public VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks getVideoClicks() {
                            return videoClicks;
                        }

                        /**
                         * 设置videoClicks属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks }
                         *     
                         */
                        public void setVideoClicks(VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks value) {
                            this.videoClicks = value;
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
                         *         &lt;element name="Icon" type="{}Icon_type" maxOccurs="unbounded"/&gt;
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
                            "icon"
                        })
                        public static class Icons {

                            @XmlElement(name = "Icon", required = true)
                            protected List<IconType> icon;

                            /**
                             * Gets the value of the icon property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the icon property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getIcon().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link IconType }
                             * 
                             * 
                             */
                            public List<IconType> getIcon() {
                                if (icon == null) {
                                    icon = new ArrayList<IconType>();
                                }
                                return this.icon;
                            }

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
                         *         &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0"&gt;
                         *           &lt;complexType&gt;
                         *             &lt;simpleContent&gt;
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
                         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                         *               &lt;/extension&gt;
                         *             &lt;/simpleContent&gt;
                         *           &lt;/complexType&gt;
                         *         &lt;/element&gt;
                         *         &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0"&gt;
                         *           &lt;complexType&gt;
                         *             &lt;simpleContent&gt;
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
                         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                        @XmlType(name = "", propOrder = {
                            "clickTracking",
                            "customClick"
                        })
                        public static class VideoClicks {

                            @XmlElement(name = "ClickTracking")
                            protected List<VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.ClickTracking> clickTracking;
                            @XmlElement(name = "CustomClick")
                            protected List<VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.CustomClick> customClick;

                            /**
                             * Gets the value of the clickTracking property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the clickTracking property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getClickTracking().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.ClickTracking }
                             * 
                             * 
                             */
                            public List<VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.ClickTracking> getClickTracking() {
                                if (clickTracking == null) {
                                    clickTracking = new ArrayList<VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.ClickTracking>();
                                }
                                return this.clickTracking;
                            }

                            /**
                             * Gets the value of the customClick property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the customClick property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getCustomClick().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.CustomClick }
                             * 
                             * 
                             */
                            public List<VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.CustomClick> getCustomClick() {
                                if (customClick == null) {
                                    customClick = new ArrayList<VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.CustomClick>();
                                }
                                return this.customClick;
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
                             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                            public static class ClickTracking {

                                @XmlValue
                                @XmlSchemaType(name = "anyURI")
                                protected String value;
                                @XmlAttribute(name = "id")
                                protected String id;

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
                             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                            public static class CustomClick {

                                @XmlValue
                                @XmlSchemaType(name = "anyURI")
                                protected String value;
                                @XmlAttribute(name = "id")
                                protected String id;

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

                            }

                        }

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
                     *         &lt;element name="TrackingEvents" type="{}TrackingEvents_type" minOccurs="0"/&gt;
                     *         &lt;element name="NonLinear" type="{}NonLinearWrapper_type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                        "trackingEvents",
                        "nonLinear"
                    })
                    public static class NonLinearAds {

                        @XmlElement(name = "TrackingEvents")
                        protected TrackingEventsType trackingEvents;
                        @XmlElement(name = "NonLinear")
                        protected List<NonLinearWrapperType> nonLinear;

                        /**
                         * 获取trackingEvents属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link TrackingEventsType }
                         *     
                         */
                        public TrackingEventsType getTrackingEvents() {
                            return trackingEvents;
                        }

                        /**
                         * 设置trackingEvents属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TrackingEventsType }
                         *     
                         */
                        public void setTrackingEvents(TrackingEventsType value) {
                            this.trackingEvents = value;
                        }

                        /**
                         * Gets the value of the nonLinear property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the nonLinear property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getNonLinear().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link NonLinearWrapperType }
                         * 
                         * 
                         */
                        public List<NonLinearWrapperType> getNonLinear() {
                            if (nonLinear == null) {
                                nonLinear = new ArrayList<NonLinearWrapperType>();
                            }
                            return this.nonLinear;
                        }

                    }

                }

            }

        }

    }

}
