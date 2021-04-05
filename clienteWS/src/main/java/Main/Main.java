package Main;

import ejb.InterfaceWebServiceExample;
import ejb.WebServiceExampleService;

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println(".......INICIO......");
			
			InterfaceWebServiceExample interfaceWebServiceExample = new WebServiceExampleService().getWebServiceExamplePort();
			System.out.println("La suma es : " + interfaceWebServiceExample.sumar(50, 30));
			
			System.out.println(".............");
			
			System.out.println(interfaceWebServiceExample.listarPersonas());
			
			System.out.println(".......FIN......");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
