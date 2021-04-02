package ejb;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "ejb.InterfaceWebServiceExample")
public class WebServiceExample implements InterfaceWebServiceExample {

	public int sumar(int num1, int num2) {
		return num1 + num2;
	}
	
}
