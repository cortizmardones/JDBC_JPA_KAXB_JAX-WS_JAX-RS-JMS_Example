package Main;

import ejb.InterfaceWebServiceExample;
import ejb.WebServiceExampleService;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			InterfaceWebServiceExample interfaceWebServiceExample = new WebServiceExampleService().getWebServiceExamplePort();
			System.out.println("La suma es : " + interfaceWebServiceExample.sumar(50, 30));
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
