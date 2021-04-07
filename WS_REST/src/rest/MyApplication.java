package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@Path("/mypath")
public class MyApplication extends Application {

    @GET    
    @Produces(MediaType.APPLICATION_JSON)
    public String getTexto() throws Exception {
        return "Hola texto";
    }
    
    @GET    
    @Produces(MediaType.APPLICATION_JSON)
    public String getModels() throws Exception {
        return "Hola texto";
    }
    
}