//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package jpaprimer.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Title_QNAME = new QName("", "title");
    private final static QName _CoverUrl_QNAME = new QName("", "cover-url");
    private final static QName _Year_QNAME = new QName("", "year");
    private final static QName _Score_QNAME = new QName("", "score");
    private final static QName _NumberOfVotes_QNAME = new QName("", "numberOfVotes");
    private final static QName _PgRating_QNAME = new QName("", "pgRating");
    private final static QName _Genre_QNAME = new QName("", "genre");
    private final static QName _SummaryOfSerie_QNAME = new QName("", "summaryOfSerie");
    private final static QName _Star_QNAME = new QName("", "star");
    private final static QName _Actor_QNAME = new QName("", "actor");
    private final static QName _Creator_QNAME = new QName("", "creator");
    private final static QName _Director_QNAME = new QName("", "director");
    private final static QName _Writer_QNAME = new QName("", "writer");
    private final static QName _NumberOfSeasons_QNAME = new QName("", "numberOfSeasons");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _Duration_QNAME = new QName("", "duration");
    private final static QName _Review_QNAME = new QName("", "review");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Catalog }
     * 
     * @return
     *     the new instance of {@link Catalog }
     */
    public Catalog createCatalog() {
        return new Catalog();
    }

    /**
     * Create an instance of {@link Serie }
     * 
     * @return
     *     the new instance of {@link Serie }
     */
    public Serie createSerie() {
        return new Serie();
    }

    /**
     * Create an instance of {@link Season }
     * 
     * @return
     *     the new instance of {@link Season }
     */
    public Season createSeason() {
        return new Season();
    }

    /**
     * Create an instance of {@link Episode }
     * 
     * @return
     *     the new instance of {@link Episode }
     */
    public Episode createEpisode() {
        return new Episode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "cover-url")
    public JAXBElement<String> createCoverUrl(String value) {
        return new JAXBElement<>(_CoverUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "year")
    public JAXBElement<Integer> createYear(Integer value) {
        return new JAXBElement<>(_Year_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "score")
    public JAXBElement<BigDecimal> createScore(BigDecimal value) {
        return new JAXBElement<>(_Score_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "numberOfVotes")
    public JAXBElement<BigInteger> createNumberOfVotes(BigInteger value) {
        return new JAXBElement<>(_NumberOfVotes_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "pgRating")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPgRating(String value) {
        return new JAXBElement<>(_PgRating_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "genre")
    public JAXBElement<String> createGenre(String value) {
        return new JAXBElement<>(_Genre_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "summaryOfSerie")
    public JAXBElement<String> createSummaryOfSerie(String value) {
        return new JAXBElement<>(_SummaryOfSerie_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "star")
    public JAXBElement<String> createStar(String value) {
        return new JAXBElement<>(_Star_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "actor")
    public JAXBElement<String> createActor(String value) {
        return new JAXBElement<>(_Actor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "creator")
    public JAXBElement<String> createCreator(String value) {
        return new JAXBElement<>(_Creator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "director")
    public JAXBElement<String> createDirector(String value) {
        return new JAXBElement<>(_Director_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "writer")
    public JAXBElement<String> createWriter(String value) {
        return new JAXBElement<>(_Writer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "numberOfSeasons")
    public JAXBElement<BigInteger> createNumberOfSeasons(BigInteger value) {
        return new JAXBElement<>(_NumberOfSeasons_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "duration")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDuration(String value) {
        return new JAXBElement<>(_Duration_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "review")
    public JAXBElement<String> createReview(String value) {
        return new JAXBElement<>(_Review_QNAME, String.class, null, value);
    }

}
