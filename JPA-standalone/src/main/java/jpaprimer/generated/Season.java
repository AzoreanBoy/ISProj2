//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package jpaprimer.generated;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{}episode" maxOccurs="unbounded"/>
 *       </sequence>
 *       <attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"episode"
})
@XmlRootElement(name = "season")
@Entity
public class Season implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlAttribute(name = "id", required = true)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected BigInteger id;

    @XmlElement(required = true)
    @OneToMany(cascade = CascadeType.ALL)
    protected List<Episode> episode;
    

    /**
     * Gets the value of the episode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the episode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEpisode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Episode }
     * 
     * 
     * @return
     *     The value of the episode property.
     */
    public List<Episode> getEpisode() {
        if (episode == null) {
            episode = new ArrayList<>();
        }
        return this.episode;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}
