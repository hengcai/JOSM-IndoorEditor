//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.03 at 11:26:04 AM CET 
//

package net.opengis.indoorgml.v_1_0.navigation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.PointPropertyType;
import net.opengis.indoorgml.v_1_0.core.StatePropertyType;

/**
 * <p>
 * Java class for RouteNodeType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteNodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="referencedState" type="{http://www.opengis.net/indoorgml/1.0/core}StatePropertyType"/>
 *         &lt;element name="geometry" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteNodeType", propOrder = { "referencedState", "geometry" })
public class RouteNodeType extends AbstractFeatureType {

    @XmlElement(required = true)
    protected StatePropertyType referencedState;
    @XmlElement(required = true)
    protected PointPropertyType geometry;

    /**
     * Gets the value of the referencedState property.
     * 
     * @return possible object is {@link StatePropertyType }
     */
    public StatePropertyType getReferencedState() {
        return referencedState;
    }

    /**
     * Sets the value of the referencedState property.
     * 
     * @param value
     *            allowed object is {@link StatePropertyType }
     */
    public void setReferencedState(StatePropertyType value) {
        this.referencedState = value;
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return possible object is {@link PointPropertyType }
     */
    public PointPropertyType getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *            allowed object is {@link PointPropertyType }
     */
    public void setGeometry(PointPropertyType value) {
        this.geometry = value;
    }

    /*
     * (non-Javadoc)
     * @see org.jvnet.jaxb2_commons.lang.CopyTo#createNewInstance()
     */
    @Override
    public Object createNewInstance() {
        return new RouteNodeType();
    }

}
