//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.03 at 11:26:04 AM CET 
//

package net.opengis.indoorgml.v_1_0.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.CurvePropertyType;

/**
 * <p>
 * Java class for TransitionType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="connects" type="{http://www.opengis.net/indoorgml/1.0/core}StatePropertyType" maxOccurs="2" minOccurs="2"/>
 *         &lt;element name="duality" type="{http://www.opengis.net/indoorgml/1.0/core}CellSpaceBoundaryPropertyType" minOccurs="0"/>
 *         &lt;element name="geometry" type="{http://www.opengis.net/gml/3.2}CurvePropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitionType", propOrder = { "weight", "connects", "duality", "geometry" })
public class TransitionType extends AbstractFeatureType {

    protected Double                        weight;
    @XmlElement(required = true)
    protected List<StatePropertyType>       connects;
    protected CellSpaceBoundaryPropertyType duality;
    protected CurvePropertyType             geometry;
    @XmlAttribute
    protected List<String>                  nilReason;
    @XmlAttribute(namespace = "http://www.opengis.net/gml/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String                        remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    public final static String TYPE = "simple";
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String                        href;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String                        role;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String                        arcrole;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    protected String                        title;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    protected String                        show;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    protected String                        actuate;

    /**
     * Gets the value of the weight property.
     * 
     * @return possible object is {@link Double }
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *            allowed object is {@link Double }
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the connects property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connects property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getConnects().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link StatePropertyType }
     */
    public List<StatePropertyType> getConnects() {
        if (connects == null) {
            connects = new ArrayList<StatePropertyType>();
        }
        return this.connects;
    }

    /**
     * Gets the value of the duality property.
     * 
     * @return possible object is {@link CellSpaceBoundaryPropertyType }
     */
    public CellSpaceBoundaryPropertyType getDuality() {
        return duality;
    }

    /**
     * Sets the value of the duality property.
     * 
     * @param value
     *            allowed object is {@link CellSpaceBoundaryPropertyType }
     */
    public void setDuality(CellSpaceBoundaryPropertyType value) {
        this.duality = value;
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return possible object is {@link CurvePropertyType }
     */
    public CurvePropertyType getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *            allowed object is {@link CurvePropertyType }
     */
    public void setGeometry(CurvePropertyType value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the nilReason property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getNilReason().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return possible object is {@link String }
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return possible object is {@link String }
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return possible object is {@link String }
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return possible object is {@link String }
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return possible object is {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return possible object is {@link String }
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return possible object is {@link String }
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

    /*
     * (non-Javadoc)
     * @see org.jvnet.jaxb2_commons.lang.CopyTo#createNewInstance()
     */
    @Override
    public Object createNewInstance() {
        return new TransitionType();
    }

}
