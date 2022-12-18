
package services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TermReportWebService", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/TermReport/TermReportWebService?WSDL")
public class TermReportWebService_Service
    extends Service
{

    private final static URL TERMREPORTWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException TERMREPORTWEBSERVICE_EXCEPTION;
    private final static QName TERMREPORTWEBSERVICE_QNAME = new QName("http://services/", "TermReportWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/TermReport/TermReportWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TERMREPORTWEBSERVICE_WSDL_LOCATION = url;
        TERMREPORTWEBSERVICE_EXCEPTION = e;
    }

    public TermReportWebService_Service() {
        super(__getWsdlLocation(), TERMREPORTWEBSERVICE_QNAME);
    }

    public TermReportWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TERMREPORTWEBSERVICE_QNAME, features);
    }

    public TermReportWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, TERMREPORTWEBSERVICE_QNAME);
    }

    public TermReportWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TERMREPORTWEBSERVICE_QNAME, features);
    }

    public TermReportWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TermReportWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TermReportWebService
     */
    @WebEndpoint(name = "TermReportWebServicePort")
    public TermReportWebService getTermReportWebServicePort() {
        return super.getPort(new QName("http://services/", "TermReportWebServicePort"), TermReportWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TermReportWebService
     */
    @WebEndpoint(name = "TermReportWebServicePort")
    public TermReportWebService getTermReportWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "TermReportWebServicePort"), TermReportWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TERMREPORTWEBSERVICE_EXCEPTION!= null) {
            throw TERMREPORTWEBSERVICE_EXCEPTION;
        }
        return TERMREPORTWEBSERVICE_WSDL_LOCATION;
    }

}
