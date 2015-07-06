//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java-Klasse für ParameterValueGroupType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParameterValueGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralParameterValueType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}parameterValue" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}group"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterValueGroupType", propOrder = {
    "parameterValue",
    "group"
})
public class ParameterValueGroupType
    extends AbstractGeneralParameterValueType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "parameterValue", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<AbstractGeneralParameterValuePropertyType>> parameterValue;
    @XmlElementRef(name = "group", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<OperationParameterGroupPropertyType> group;

    /**
     * Gets the value of the parameterValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<AbstractGeneralParameterValuePropertyType>> getParameterValue() {
        if (parameterValue == null) {
            parameterValue = new ArrayList<JAXBElement<AbstractGeneralParameterValuePropertyType>>();
        }
        return this.parameterValue;
    }

    public boolean isSetParameterValue() {
        return ((this.parameterValue!= null)&&(!this.parameterValue.isEmpty()));
    }

    public void unsetParameterValue() {
        this.parameterValue = null;
    }

    /**
     * Ruft den Wert der group-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}
     *     
     */
    public JAXBElement<OperationParameterGroupPropertyType> getGroup() {
        return group;
    }

    /**
     * Legt den Wert der group-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}
     *     
     */
    public void setGroup(JAXBElement<OperationParameterGroupPropertyType> value) {
        this.group = value;
    }

    public boolean isSetGroup() {
        return (this.group!= null);
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
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> theParameterValue;
            theParameterValue = this.getParameterValue();
            strategy.appendField(locator, this, "parameterValue", buffer, theParameterValue);
        }
        {
            JAXBElement<OperationParameterGroupPropertyType> theGroup;
            theGroup = this.getGroup();
            strategy.appendField(locator, this, "group", buffer, theGroup);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ParameterValueGroupType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ParameterValueGroupType that = ((ParameterValueGroupType) object);
        {
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> lhsParameterValue;
            lhsParameterValue = this.getParameterValue();
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> rhsParameterValue;
            rhsParameterValue = that.getParameterValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parameterValue", lhsParameterValue), LocatorUtils.property(thatLocator, "parameterValue", rhsParameterValue), lhsParameterValue, rhsParameterValue)) {
                return false;
            }
        }
        {
            JAXBElement<OperationParameterGroupPropertyType> lhsGroup;
            lhsGroup = this.getGroup();
            JAXBElement<OperationParameterGroupPropertyType> rhsGroup;
            rhsGroup = that.getGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "group", lhsGroup), LocatorUtils.property(thatLocator, "group", rhsGroup), lhsGroup, rhsGroup)) {
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
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> theParameterValue;
            theParameterValue = this.getParameterValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameterValue", theParameterValue), currentHashCode, theParameterValue);
        }
        {
            JAXBElement<OperationParameterGroupPropertyType> theGroup;
            theGroup = this.getGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "group", theGroup), currentHashCode, theGroup);
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
        if (draftCopy instanceof ParameterValueGroupType) {
            final ParameterValueGroupType copy = ((ParameterValueGroupType) draftCopy);
            if (this.isSetParameterValue()) {
                List<JAXBElement<AbstractGeneralParameterValuePropertyType>> sourceParameterValue;
                sourceParameterValue = this.getParameterValue();
                @SuppressWarnings("unchecked")
                List<JAXBElement<AbstractGeneralParameterValuePropertyType>> copyParameterValue = ((List<JAXBElement<AbstractGeneralParameterValuePropertyType>> ) strategy.copy(LocatorUtils.property(locator, "parameterValue", sourceParameterValue), sourceParameterValue));
                copy.unsetParameterValue();
                List<JAXBElement<AbstractGeneralParameterValuePropertyType>> uniqueParameterValuel = copy.getParameterValue();
                uniqueParameterValuel.addAll(copyParameterValue);
            } else {
                copy.unsetParameterValue();
            }
            if (this.isSetGroup()) {
                JAXBElement<OperationParameterGroupPropertyType> sourceGroup;
                sourceGroup = this.getGroup();
                @SuppressWarnings("unchecked")
                JAXBElement<OperationParameterGroupPropertyType> copyGroup = ((JAXBElement<OperationParameterGroupPropertyType> ) strategy.copy(LocatorUtils.property(locator, "group", sourceGroup), sourceGroup));
                copy.setGroup(copyGroup);
            } else {
                copy.group = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ParameterValueGroupType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ParameterValueGroupType) {
            final ParameterValueGroupType target = this;
            final ParameterValueGroupType leftObject = ((ParameterValueGroupType) left);
            final ParameterValueGroupType rightObject = ((ParameterValueGroupType) right);
            {
                List<JAXBElement<AbstractGeneralParameterValuePropertyType>> lhsParameterValue;
                lhsParameterValue = leftObject.getParameterValue();
                List<JAXBElement<AbstractGeneralParameterValuePropertyType>> rhsParameterValue;
                rhsParameterValue = rightObject.getParameterValue();
                target.unsetParameterValue();
                List<JAXBElement<AbstractGeneralParameterValuePropertyType>> uniqueParameterValuel = target.getParameterValue();
                uniqueParameterValuel.addAll(((List<JAXBElement<AbstractGeneralParameterValuePropertyType>> ) strategy.merge(LocatorUtils.property(leftLocator, "parameterValue", lhsParameterValue), LocatorUtils.property(rightLocator, "parameterValue", rhsParameterValue), lhsParameterValue, rhsParameterValue)));
            }
            {
                JAXBElement<OperationParameterGroupPropertyType> lhsGroup;
                lhsGroup = leftObject.getGroup();
                JAXBElement<OperationParameterGroupPropertyType> rhsGroup;
                rhsGroup = rightObject.getGroup();
                target.setGroup(((JAXBElement<OperationParameterGroupPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "group", lhsGroup), LocatorUtils.property(rightLocator, "group", rhsGroup), lhsGroup, rhsGroup)));
            }
        }
    }

    public void setParameterValue(List<JAXBElement<AbstractGeneralParameterValuePropertyType>> value) {
        List<JAXBElement<AbstractGeneralParameterValuePropertyType>> draftl = this.getParameterValue();
        draftl.addAll(value);
    }

}