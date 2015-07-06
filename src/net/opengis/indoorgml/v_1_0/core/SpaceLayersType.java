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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.AggregationType;

/**
 * <p>
 * Java class for SpaceLayersType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpaceLayersType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="spaceLayerMember" type="{http://www.opengis.net/indoorgml/1.0/core}SpaceLayerMemberType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpaceLayersType", propOrder = { "spaceLayerMember" })
public class SpaceLayersType extends AbstractFeatureType {

    @XmlElement(required = true)
    protected List<SpaceLayerMemberType> spaceLayerMember;
    @XmlAttribute
    protected AggregationType            aggregationType;

    /**
     * Gets the value of the spaceLayerMember property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spaceLayerMember property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSpaceLayerMember().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link SpaceLayerMemberType }
     */
    public List<SpaceLayerMemberType> getSpaceLayerMember() {
        if (spaceLayerMember == null) {
            spaceLayerMember = new ArrayList<SpaceLayerMemberType>();
        }
        return this.spaceLayerMember;
    }

    /**
     * Gets the value of the aggregationType property.
     * 
     * @return possible object is {@link AggregationType }
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Sets the value of the aggregationType property.
     * 
     * @param value
     *            allowed object is {@link AggregationType }
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

    /*
     * (non-Javadoc)
     * @see org.jvnet.jaxb2_commons.lang.CopyTo#createNewInstance()
     */
    @Override
    public Object createNewInstance() {
        return new SpaceLayersType();
    }

}
