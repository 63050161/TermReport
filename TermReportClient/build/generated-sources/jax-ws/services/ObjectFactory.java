
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _FindData_QNAME = new QName("http://services/", "findData");
    private final static QName _FindDataResponse_QNAME = new QName("http://services/", "findDataResponse");
    private final static QName _Todaycasesall_QNAME = new QName("http://services/", "todaycasesall");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindDataResponse }
     * 
     */
    public FindDataResponse createFindDataResponse() {
        return new FindDataResponse();
    }

    /**
     * Create an instance of {@link Todaycasesall }
     * 
     */
    public Todaycasesall createTodaycasesall() {
        return new Todaycasesall();
    }

    /**
     * Create an instance of {@link FindData }
     * 
     */
    public FindData createFindData() {
        return new FindData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findData")
    public JAXBElement<FindData> createFindData(FindData value) {
        return new JAXBElement<FindData>(_FindData_QNAME, FindData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findDataResponse")
    public JAXBElement<FindDataResponse> createFindDataResponse(FindDataResponse value) {
        return new JAXBElement<FindDataResponse>(_FindDataResponse_QNAME, FindDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Todaycasesall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "todaycasesall")
    public JAXBElement<Todaycasesall> createTodaycasesall(Todaycasesall value) {
        return new JAXBElement<Todaycasesall>(_Todaycasesall_QNAME, Todaycasesall.class, null, value);
    }

}
