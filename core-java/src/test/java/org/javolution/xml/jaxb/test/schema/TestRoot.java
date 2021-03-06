//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.17 at 09:13:55 PM EDT 
//


package org.javolution.xml.jaxb.test.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.javolution.xml.jaxb.common.test.schema.TestCommonElement;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testElement" type="{http://javolution.org/xml/schema/javolution}testElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testValidationElement" type="{http://javolution.org/xml/schema/javolution}testValidationElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testAttributeElement" type="{http://javolution.org/xml/schema/javolution}testAttributeElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testUnboundedWrapperElement" type="{http://javolution.org/xml/schema/javolution}testUnboundedWrapperElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testBoundedWrapperElement" type="{http://javolution.org/xml/schema/javolution}testBoundedWrapperElement" minOccurs="0"/>
 *         &lt;element name="testCommonElement" type="{http://javolution.org/xml/schema/javolution-common}testCommonElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "testElement",
    "testValidationElement",
    "testAttributeElement",
    "testUnboundedWrapperElement",
    "testBoundedWrapperElement",
    "testCommonElement"
})
@XmlRootElement(name = "testRoot")
public class TestRoot {

    protected List<TestElement> testElement;
    protected List<TestValidationElement> testValidationElement;
    protected List<TestAttributeElement> testAttributeElement;
    protected List<TestUnboundedWrapperElement> testUnboundedWrapperElement;
    protected TestBoundedWrapperElement testBoundedWrapperElement;
    protected List<TestCommonElement> testCommonElement;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "type2")
    protected String type2;

    /**
     * Gets the value of the testElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestElement }
     * 
     * 
     */
    public List<TestElement> getTestElement() {
        if (testElement == null) {
            testElement = new ArrayList<TestElement>();
        }
        return this.testElement;
    }

    /**
     * Gets the value of the testValidationElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testValidationElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestValidationElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestValidationElement }
     * 
     * 
     */
    public List<TestValidationElement> getTestValidationElement() {
        if (testValidationElement == null) {
            testValidationElement = new ArrayList<TestValidationElement>();
        }
        return this.testValidationElement;
    }

    /**
     * Gets the value of the testAttributeElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testAttributeElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestAttributeElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestAttributeElement }
     * 
     * 
     */
    public List<TestAttributeElement> getTestAttributeElement() {
        if (testAttributeElement == null) {
            testAttributeElement = new ArrayList<TestAttributeElement>();
        }
        return this.testAttributeElement;
    }

    /**
     * Gets the value of the testUnboundedWrapperElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testUnboundedWrapperElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestUnboundedWrapperElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestUnboundedWrapperElement }
     * 
     * 
     */
    public List<TestUnboundedWrapperElement> getTestUnboundedWrapperElement() {
        if (testUnboundedWrapperElement == null) {
            testUnboundedWrapperElement = new ArrayList<TestUnboundedWrapperElement>();
        }
        return this.testUnboundedWrapperElement;
    }

    /**
     * Gets the value of the testBoundedWrapperElement property.
     * 
     * @return
     *     possible object is
     *     {@link TestBoundedWrapperElement }
     *     
     */
    public TestBoundedWrapperElement getTestBoundedWrapperElement() {
        return testBoundedWrapperElement;
    }

    /**
     * Sets the value of the testBoundedWrapperElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestBoundedWrapperElement }
     *     
     */
    public void setTestBoundedWrapperElement(TestBoundedWrapperElement value) {
        this.testBoundedWrapperElement = value;
    }

    /**
     * Gets the value of the testCommonElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testCommonElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestCommonElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestCommonElement }
     * 
     * 
     */
    public List<TestCommonElement> getTestCommonElement() {
        if (testCommonElement == null) {
            testCommonElement = new ArrayList<TestCommonElement>();
        }
        return this.testCommonElement;
    }

    /**
     * Gets the value of the type property.
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
     * Sets the value of the type property.
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
     * Gets the value of the type2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType2() {
        return type2;
    }

    /**
     * Sets the value of the type2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType2(String value) {
        this.type2 = value;
    }

}
