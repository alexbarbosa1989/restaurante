package co.restaurante.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;

import co.restaurante.ejb.UsuarioLogic;
import co.restaurante.entities.Usuario;

@Path("/reservas")
public class Reservas{

	@GET
	@Path("/crearUsuario")
	@Produces(MediaType.APPLICATION_JSON)
	public void crearUsuario(){
		Usuario entity = new Usuario();
		entity.setId(1L);
		entity.setName("Nani");
		entity.setRol(1L);
		UsuarioLogic u = new UsuarioLogic();
		u.registroUsuario(entity);
	}
	
	@GET
	@Path("/consultarUsuario")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarUsuario(){
		List<Usuario> listaUsr = new ArrayList<Usuario>();
		UsuarioLogic u = new UsuarioLogic();
		listaUsr = u.consultarUsr();
		JSONArray arrUsr = new JSONArray(listaUsr);
		String arrResp = arrUsr.toString().replace("\\\\", "\\");
		String arrResponse = arrResp.replace("\"null\"", "null");
		return arrResponse;
	}

	
	 @GET
	 @Path("/sayHello/{name}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public String sayHello(@PathParam("name") String name){
		 String saludo =  "Hola: " + name;
		 return saludo;
	 }
}
