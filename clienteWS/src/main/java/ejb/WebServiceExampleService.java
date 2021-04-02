package ejb;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2021-04-01T03:22:58.867-04:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "WebServiceExampleService", 
                  wsdlLocation = "file:/C:/Users/Carlos/Desktop/JAVA/Proyectos/ws/ws/clienteWS/src/wsdl/example.wsdl",
                  targetNamespace = "http://ejb/") 
public class WebServiceExampleService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ejb/", "WebServiceExampleService");
    public final static QName WebServiceExamplePort = new QName("http://ejb/", "WebServiceExamplePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Carlos/Desktop/JAVA/Proyectos/ws/ws/clienteWS/src/wsdl/example.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WebServiceExampleService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Carlos/Desktop/JAVA/Proyectos/ws/ws/clienteWS/src/wsdl/example.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WebServiceExampleService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WebServiceExampleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceExampleService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WebServiceExampleService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WebServiceExampleService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WebServiceExampleService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns InterfaceWebServiceExample
     */
    @WebEndpoint(name = "WebServiceExamplePort")
    public InterfaceWebServiceExample getWebServiceExamplePort() {
        return super.getPort(WebServiceExamplePort, InterfaceWebServiceExample.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InterfaceWebServiceExample
     */
    @WebEndpoint(name = "WebServiceExamplePort")
    public InterfaceWebServiceExample getWebServiceExamplePort(WebServiceFeature... features) {
        return super.getPort(WebServiceExamplePort, InterfaceWebServiceExample.class, features);
    }

}