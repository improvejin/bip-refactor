//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.28 at 10:31:24 AM CST 
//


package com.pplove.bip.scheduler.oozie.workflow2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SWITCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWITCH">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="case" type="{uri:oozie:workflow:0.1}CASE" maxOccurs="unbounded"/>
 *           &lt;element name="default" type="{uri:oozie:workflow:0.1}DEFAULT"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWITCH", propOrder = {
    "_case",
    "_default"
})
public class SwitchNode {

    @XmlElement(name = "case", required = true)
    protected List<CaseElement> _case;
    @XmlElement(name = "default", required = true)
    protected DefaultElement _default;

    /**
     * Gets the value of the case property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the case property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseElement }
     * 
     * 
     */
    public List<CaseElement> getCase() {
        if (_case == null) {
            _case = new ArrayList<CaseElement>();
        }
        return this._case;
    }
    
    /**
     * shortcut for add case
     * @param to
     * @param value
     */
    public void addCase(String to, String value) {
    	CaseElement caseElement = new CaseElement();
    	caseElement.setTo(to);
    	caseElement.setValue(value);
    	this.getCase().add(caseElement);
    }
    
    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultElement }
     *     
     */
    public DefaultElement getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultElement }
     *     
     */
    public void setDefault(DefaultElement value) {
        this._default = value;
    }
    
    /**
     * shortcut for set default
     * @param to
     */
    public void setDefault(String to) {
    	DefaultElement defaultTo = new DefaultElement();
    	defaultTo.setTo(to);
    	this.setDefault(defaultTo);
    }
}
