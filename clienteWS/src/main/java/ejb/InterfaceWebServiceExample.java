package ejb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2021-04-06T00:08:00.246-04:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://ejb/", name = "InterfaceWebServiceExample")
@XmlSeeAlso({ObjectFactory.class})
public interface InterfaceWebServiceExample {

    @WebMethod
    @RequestWrapper(localName = "sumar", targetNamespace = "http://ejb/", className = "ejb.Sumar")
    @ResponseWrapper(localName = "sumarResponse", targetNamespace = "http://ejb/", className = "ejb.SumarResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int sumar(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebMethod
    @RequestWrapper(localName = "listarPersonas", targetNamespace = "http://ejb/", className = "ejb.ListarPersonas")
    @ResponseWrapper(localName = "listarPersonasResponse", targetNamespace = "http://ejb/", className = "ejb.ListarPersonasResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ejb.Persona> listarPersonas();
}
