//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom;
import org.jvnet.jaxb2_commons.lang.MergeStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java-Klasse für DynamicFeatureCollectionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DynamicFeatureCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DynamicFeatureType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}dynamicMembers"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicFeatureCollectionType", propOrder = {
    "dynamicMembers"
})
public class DynamicFeatureCollectionType
    extends DynamicFeatureType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected DynamicFeatureMemberType dynamicMembers;

    /**
     * Ruft den Wert der dynamicMembers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DynamicFeatureMemberType }
     *     
     */
    public DynamicFeatureMemberType getDynamicMembers() {
        return dynamicMembers;
    }

    /**
     * Legt den Wert der dynamicMembers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicFeatureMemberType }
     *     
     */
    public void setDynamicMembers(DynamicFeatureMemberType value) {
        this.dynamicMembers = value;
    }

    public boolean isSetDynamicMembers() {
        return (this.dynamicMembers!= null);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            DynamicFeatureMemberType theDynamicMembers;
            theDynamicMembers = this.getDynamicMembers();
            strategy.appendField(locator, this, "dynamicMembers", buffer, theDynamicMembers);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DynamicFeatureCollectionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DynamicFeatureCollectionType that = ((DynamicFeatureCollectionType) object);
        {
            DynamicFeatureMemberType lhsDynamicMembers;
            lhsDynamicMembers = this.getDynamicMembers();
            DynamicFeatureMemberType rhsDynamicMembers;
            rhsDynamicMembers = that.getDynamicMembers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dynamicMembers", lhsDynamicMembers), LocatorUtils.property(thatLocator, "dynamicMembers", rhsDynamicMembers), lhsDynamicMembers, rhsDynamicMembers)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            DynamicFeatureMemberType theDynamicMembers;
            theDynamicMembers = this.getDynamicMembers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dynamicMembers", theDynamicMembers), currentHashCode, theDynamicMembers);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof DynamicFeatureCollectionType) {
            final DynamicFeatureCollectionType copy = ((DynamicFeatureCollectionType) draftCopy);
            if (this.isSetDynamicMembers()) {
                DynamicFeatureMemberType sourceDynamicMembers;
                sourceDynamicMembers = this.getDynamicMembers();
                DynamicFeatureMemberType copyDynamicMembers = ((DynamicFeatureMemberType) strategy.copy(LocatorUtils.property(locator, "dynamicMembers", sourceDynamicMembers), sourceDynamicMembers));
                copy.setDynamicMembers(copyDynamicMembers);
            } else {
                copy.dynamicMembers = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DynamicFeatureCollectionType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof DynamicFeatureCollectionType) {
            final DynamicFeatureCollectionType target = this;
            final DynamicFeatureCollectionType leftObject = ((DynamicFeatureCollectionType) left);
            final DynamicFeatureCollectionType rightObject = ((DynamicFeatureCollectionType) right);
            {
                DynamicFeatureMemberType lhsDynamicMembers;
                lhsDynamicMembers = leftObject.getDynamicMembers();
                DynamicFeatureMemberType rhsDynamicMembers;
                rhsDynamicMembers = rightObject.getDynamicMembers();
                target.setDynamicMembers(((DynamicFeatureMemberType) strategy.merge(LocatorUtils.property(leftLocator, "dynamicMembers", lhsDynamicMembers), LocatorUtils.property(rightLocator, "dynamicMembers", rhsDynamicMembers), lhsDynamicMembers, rhsDynamicMembers)));
            }
        }
    }

}
