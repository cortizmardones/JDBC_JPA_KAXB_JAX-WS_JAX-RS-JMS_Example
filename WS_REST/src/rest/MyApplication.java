package rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@Path("/mypath")
public class MyApplication extends Application {
	
	ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    @GET
    @Path("/listarClientes")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Persona> getListaClientes() throws Exception {
    	
		InitialContext context = new InitialContext();
		//Este nombre lo defino en el estandalone
		DataSource dataSource = (DataSource)context.lookup("java:jboss/datasources/ExampleMysqlDS");
		Connection connection = dataSource.getConnection();
    	PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM CLIENTES");
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
        return listaPersonas;
    }
    
    @GET
    @Path("/link")
    @Produces(MediaType.APPLICATION_JSON)
    public String getModels() throws Exception {
        return "link";
    }
    
}