package soap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.sql.DataSource;

@Stateless
@WebService(endpointInterface = "soap.InterfaceWebServiceExample")
public class WebServiceExample implements InterfaceWebServiceExample {
	
	private ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

	public int sumar(int num1, int num2) {
		return num1 + num2;
	}

	public ArrayList<Persona> listarPersonas() {
		
		try {
			
			listaPersonas.clear();
			
			InitialContext context = new InitialContext();
			//Este nombre lo defino en el estandalone
			DataSource dataSource = (DataSource)context.lookup("java:jboss/datasources/ExampleMysqlDS");
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM clientes");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Persona persona = new Persona();
				persona.setId(Integer.parseInt(resultSet.getString("id")));
				persona.setNombre(resultSet.getString("nombre"));
				persona.setApellido(resultSet.getString("apellido"));
				persona.setEmail(resultSet.getString("email"));
				persona.setFecha(resultSet.getString("create_at"));
				persona.setIdComuna(Integer.parseInt(resultSet.getString("id_comuna")));
				listaPersonas.add(persona);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return listaPersonas;
	}

	
}
