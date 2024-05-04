
package imports;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the imports package. 
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

    private final static QName _GetRating_QNAME = new QName("http://book/", "getRating");
    private final static QName _GetRatingResponse_QNAME = new QName("http://book/", "getRatingResponse");
    private final static QName _GetSerieData_QNAME = new QName("http://book/", "getSerieData");
    private final static QName _GetSerieDataResponse_QNAME = new QName("http://book/", "getSerieDataResponse");
    private final static QName _GetSeries_QNAME = new QName("http://book/", "getSeries");
    private final static QName _GetSeriesResponse_QNAME = new QName("http://book/", "getSeriesResponse");
    private final static QName _GetTitles_QNAME = new QName("http://book/", "getTitles");
    private final static QName _GetTitlesResponse_QNAME = new QName("http://book/", "getTitlesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: imports
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRating }
     * 
     * @return
     *     the new instance of {@link GetRating }
     */
    public GetRating createGetRating() {
        return new GetRating();
    }

    /**
     * Create an instance of {@link GetRatingResponse }
     * 
     * @return
     *     the new instance of {@link GetRatingResponse }
     */
    public GetRatingResponse createGetRatingResponse() {
        return new GetRatingResponse();
    }

    /**
     * Create an instance of {@link GetSerieData }
     * 
     * @return
     *     the new instance of {@link GetSerieData }
     */
    public GetSerieData createGetSerieData() {
        return new GetSerieData();
    }

    /**
     * Create an instance of {@link GetSerieDataResponse }
     * 
     * @return
     *     the new instance of {@link GetSerieDataResponse }
     */
    public GetSerieDataResponse createGetSerieDataResponse() {
        return new GetSerieDataResponse();
    }

    /**
     * Create an instance of {@link GetSeries }
     * 
     * @return
     *     the new instance of {@link GetSeries }
     */
    public GetSeries createGetSeries() {
        return new GetSeries();
    }

    /**
     * Create an instance of {@link GetSeriesResponse }
     * 
     * @return
     *     the new instance of {@link GetSeriesResponse }
     */
    public GetSeriesResponse createGetSeriesResponse() {
        return new GetSeriesResponse();
    }

    /**
     * Create an instance of {@link GetTitles }
     * 
     * @return
     *     the new instance of {@link GetTitles }
     */
    public GetTitles createGetTitles() {
        return new GetTitles();
    }

    /**
     * Create an instance of {@link GetTitlesResponse }
     * 
     * @return
     *     the new instance of {@link GetTitlesResponse }
     */
    public GetTitlesResponse createGetTitlesResponse() {
        return new GetTitlesResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRating }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRating }{@code >}
     */
    @XmlElementDecl(namespace = "http://book/", name = "getRating")
    public JAXBElement<GetRating> createGetRating(GetRating value) {
        return new JAXBElement<>(_GetRating_QNAME, GetRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRatingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://book/", name = "getRatingResponse")
    public JAXBElement<GetRatingResponse> createGetRatingResponse(GetRatingResponse value) {
        return new JAXBElement<>(_GetRatingResponse_QNAME, GetRatingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSerieData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSerieData }{@code >}
     */
    @XmlElementDecl(namespace = "http://book/", name = "getSerieData")
    public JAXBElement<GetSerieData> createGetSerieData(GetSerieData value) {
        return new JAXBElement<>(_GetSerieData_QNAME, GetSerieData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSerieDataResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSerieDataResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://book/", name = "getSerieDataResponse")
    public JAXBElement<GetSerieDataResponse> createGetSerieDataResponse(GetSerieDataResponse value) {
        return new JAXBElement<>(_GetSerieDataResponse_QNAME, GetSerieDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeries }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSeries }{@code >}
     */
    @XmlElementDecl(namespace = "http://book/", name = "getSeries")
    public JAXBElement<GetSeries> createGetSeries(GetSeries value) {
        return new JAXBElement<>(_GetSeries_QNAME, GetSeries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSeriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://book/", name = "getSeriesResponse")
    public JAXBElement<GetSeriesResponse> createGetSeriesResponse(GetSeriesResponse value) {
        return new JAXBElement<>(_GetSeriesResponse_QNAME, GetSeriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTitles }{@code >}
     */
    @XmlElementDecl(namespace = "http://book/", name = "getTitles")
    public JAXBElement<GetTitles> createGetTitles(GetTitles value) {
        return new JAXBElement<>(_GetTitles_QNAME, GetTitles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitlesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTitlesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://book/", name = "getTitlesResponse")
    public JAXBElement<GetTitlesResponse> createGetTitlesResponse(GetTitlesResponse value) {
        return new JAXBElement<>(_GetTitlesResponse_QNAME, GetTitlesResponse.class, null, value);
    }

}
