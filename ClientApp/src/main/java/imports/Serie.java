
package imports;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="serie">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="coverUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numberOfSeasons" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="numberOfVotes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="pgRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="score" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="summaryOfSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serie", propOrder = {
    "coverUrl",
    "id",
    "numberOfSeasons",
    "numberOfVotes",
    "pgRating",
    "score",
    "summaryOfSerie",
    "title",
    "year"
})
public class Serie {

    protected String coverUrl;
    protected int id;
    protected BigInteger numberOfSeasons;
    protected BigInteger numberOfVotes;
    protected String pgRating;
    protected BigDecimal score;
    protected String summaryOfSerie;
    protected String title;
    protected int year;

    /**
     * Gets the value of the coverUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    /**
     * Sets the value of the coverUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverUrl(String value) {
        this.coverUrl = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the numberOfSeasons property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSeasons() {
        return numberOfSeasons;
    }

    /**
     * Sets the value of the numberOfSeasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSeasons(BigInteger value) {
        this.numberOfSeasons = value;
    }

    /**
     * Gets the value of the numberOfVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVotes() {
        return numberOfVotes;
    }

    /**
     * Sets the value of the numberOfVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVotes(BigInteger value) {
        this.numberOfVotes = value;
    }

    /**
     * Gets the value of the pgRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgRating() {
        return pgRating;
    }

    /**
     * Sets the value of the pgRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgRating(String value) {
        this.pgRating = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScore(BigDecimal value) {
        this.score = value;
    }

    /**
     * Gets the value of the summaryOfSerie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryOfSerie() {
        return summaryOfSerie;
    }

    /**
     * Sets the value of the summaryOfSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryOfSerie(String value) {
        this.summaryOfSerie = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
