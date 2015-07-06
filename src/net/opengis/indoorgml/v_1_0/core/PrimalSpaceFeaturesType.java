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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.AggregationType;
import net.opengis.gml.v_3_2_1.FeaturePropertyType;

/**
 * <p>
 * Java class for PrimalSpaceFeaturesType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimalSpaceFeaturesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="cellSpaceMember" type="{http://www.opengis.net/gml/3.2}FeaturePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cellSpaceBoundaryMember" type="{http://www.opengis.net/gml/3.2}FeaturePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimalSpaceFeaturesType", propOrder = { "cellSpaceMember", "cellSpaceBoundaryMember" })
public class PrimalSpaceFeaturesType extends AbstractFeatureType {

    protected List<FeaturePropertyType> cellSpaceMember;
    protected List<FeaturePropertyType> cellSpaceBoundaryMember;
    @XmlAttribute
    protected AggregationType           aggregationType;

    /**
     * Gets the value of the cellSpaceMember property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellSpaceMember property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCellSpaceMember().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FeaturePropertyType }
     */
    public List<FeaturePropertyType> getCellSpaceMember() {
        if (cellSpaceMember == null) {
            cellSpaceMember = new ArrayList<FeaturePropertyType>();
        }
        return this.cellSpaceMember;
    }

    /**
     * Gets the value of the cellSpaceBoundaryMember property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellSpaceBoundaryMember property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCellSpaceBoundaryMember().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FeaturePropertyType }
     */
    public List<FeaturePropertyType> getCellSpaceBoundaryMember() {
        if (cellSpaceBoundaryMember == null) {
            cellSpaceBoundaryMember = new ArrayList<FeaturePropertyType>();
        }
        return this.cellSpaceBoundaryMember;
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
        return new PrimalSpaceFeaturesType();
    }

}
