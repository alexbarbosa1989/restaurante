package co.restaurante.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.json.JSONArray;

import co.restaurante.ejb.UsuarioLogic;
import co.restaurante.entities.Usuario;
import co.restaurante.interfaces.IUsuarioLogic;

@Path("/reservas")
public class Reservas{
	
//	@EJB(lookup="java:/IUsuarioLogic")
//	@EJB
	@Inject
	private IUsuarioLogic usuarioLogic;

	@GET		
	@Path("/crearUsuario")
	@Produces(MediaType.APPLICATION_JSON)
	public void crearUsuario(){
		Usuario entity = new Usuario();
		entity.setId(1L);
		entity.setName("Nani");
		entity.setRol(1L);
		System.out.println("Se manda a guardar");
		usuarioLogic.registroUsuario(entity);
		System.out.println("Se guarda");
	}
	
	@GET
	@Path("/consultarUsuario")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarUsuario(){
		List<Usuario> listaUsr = new ArrayList<Usuario>();
//		listaUsr = usuarioLogic.consultarUsr();
//		JSONArray arrUsr = new JSONArray(listaUsr);
//		String arrResp = arrUsr.toString().replace("\\\\", "\\");
//		String arrResponse = arrResp.replace("\"null\"", "null");
//		return arrResponse;
		return "";
	}

	
	 @GET
	 @Path("/sayHello/{name}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public String sayHello(@PathParam("name") String name){
		 String saludo =  "Hola: " + name;
		 return saludo;
	 }
}
