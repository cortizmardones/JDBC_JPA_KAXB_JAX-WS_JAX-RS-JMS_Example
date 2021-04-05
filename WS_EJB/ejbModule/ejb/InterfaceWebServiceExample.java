package ejb;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface InterfaceWebServiceExample {
	
	@WebMethod
	public int sumar(int num1 , int num2);
	
	@WebMethod
	public ArrayList<Persona> listarPersonas();

}
