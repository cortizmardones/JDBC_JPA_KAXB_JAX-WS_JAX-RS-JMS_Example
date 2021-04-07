package Main;

import java.util.List;

import ejb.InterfaceWebServiceExample;
import ejb.Persona;
import ejb.WebServiceExampleService;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(".......INICIO......");
			
			InterfaceWebServiceExample interfaceWebServiceExample = new WebServiceExampleService().getWebServiceExamplePort();
			System.out.println("La suma es : " + interfaceWebServiceExample.sumar(50, 43));
			
			List<Persona> lista = interfaceWebServiceExample.listarPersonas();
			
			for(Persona alias:lista) {
				System.out.println(alias.getId());
				System.out.println(alias.getNombre());
				System.out.println(alias.getApellido());
				System.out.println(alias.getEmail());
				System.out.println(alias.getFecha());
				System.out.println(alias.getIdComuna());
				System.out.println("");
			}
			
			System.out.println(".......FIN......");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
