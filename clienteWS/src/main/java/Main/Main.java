package Main;

import java.util.ArrayList;
import java.util.List;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import soap.InterfaceWebServiceExample;
import soap.Persona;
import soap.WebServiceExampleService;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(".......INICIO......");
			
			//LLamada Cliente SOAP
			System.out.println("LLamada SOAP");
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
			
			//LLamada Cliente REST
			System.out.println("LLamada Rest");
			ResteasyClient client = new ResteasyClientBuilder().build();
			ResteasyWebTarget target = client.target("http://localhost:8080/WS_REST/rest/mypath/listarClientes");
			javax.ws.rs.core.Response response = target.request().get();
			String valoresRest = response.readEntity(String.class);
			response.close();  
			
			valoresRest = valoresRest.replace("},{","|");
			valoresRest = valoresRest.replace("[","");
			valoresRest = valoresRest.replace("]","");
			valoresRest = valoresRest.replace("{","");
			valoresRest = valoresRest.replace("}","");
			
			String[] arregloPersonas = valoresRest.split("\\|");
			String[] arregloClaveValor = new String[2];
			String[] listaValores = new String[6];
			ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
			
			for(int i = 0 ; i < arregloPersonas.length ; i++) {
				
				String[] arregloPersona = arregloPersonas[i].split(",");
			
				for(int j = 0 ; j < arregloPersona.length; j++) {
					arregloClaveValor  = arregloPersona[j].split(":");
					listaValores[j] = arregloClaveValor[1];
				}
				
				Persona persona = new Persona();
				persona.setApellido(listaValores[0]);
				persona.setEmail(listaValores[1]);
				persona.setFecha(listaValores[2]);
				persona.setId(Integer.parseInt(listaValores[3]));
				persona.setIdComuna(Integer.parseInt(listaValores[4]));
				persona.setNombre(listaValores[5]);
				listaPersonas.add(persona);
			}
			
			for(Persona alias: listaPersonas) {
				System.out.println("Id: " + alias.getId());
				System.out.println("Nombre: " + alias.getNombre());
				System.out.println("Apellido: " + alias.getApellido());
				System.out.println("Email: " + alias.getEmail());
				System.out.println("Fecha: " + alias.getFecha());
				System.out.println("Comuna: " + alias.getIdComuna());
				System.out.println("");
			}
			
			System.out.println(".......FIN......");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
