
package ws;

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
@WebServiceClient(name = "ws", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/Service/ws?wsdl")
public class Ws_Service
    extends Service
{

    private final static URL WS_WSDL_LOCATION;
    private final static WebServiceException WS_EXCEPTION;
    private final static QName WS_QNAME = new QName("http://ws/", "ws");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Service/ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WS_WSDL_LOCATION = url;
        WS_EXCEPTION = e;
    }

    public Ws_Service() {
        super(__getWsdlLocation(), WS_QNAME);
    }

    public Ws_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WS_QNAME, features);
    }

    public Ws_Service(URL wsdlLocation) {
        super(wsdlLocation, WS_QNAME);
    }

    public Ws_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WS_QNAME, features);
    }

    public Ws_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Ws_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Ws
     */
    @WebEndpoint(name = "wsPort")
    public Ws getWsPort() {
        return super.getPort(new QName("http://ws/", "wsPort"), Ws.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Ws
     */
    @WebEndpoint(name = "wsPort")
    public Ws getWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "wsPort"), Ws.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WS_EXCEPTION!= null) {
            throw WS_EXCEPTION;
        }
        return WS_WSDL_LOCATION;
    }

}
