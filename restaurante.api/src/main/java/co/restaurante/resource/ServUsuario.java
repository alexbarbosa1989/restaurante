package co.restaurante.resource;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;

import co.restaurante.entities.Usuario;
import co.restaurante.interfaces.IUsuarioLogic;

@Path("/usuario")
public class ServUsuario {

	@Inject
	private IUsuarioLogic usuarioLogic;

	@GET		
	@Path("/crearUsuario/{idUsr}/{nombreUsr}/{idRol}")
	@Produces(MediaType.APPLICATION_JSON)
	public String crearUsuario(@PathParam("idUsr") String idUsr,
							   @PathParam("nombreUsr") String nombreUsr,
							   @PathParam("idRol") String idRol){
		Usuario usr = new Usuario();
		String respuesta = new String();
		usr.setId(Long.parseLong(idUsr));
		usr.setName(nombreUsr);
		usr.setRol(Long.parseLong(idRol));
		respuesta = usuarioLogic.registroUsuario(usr);
		return respuesta;
	}
	
	@GET
	@Path("/consultarUsuarios")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarUsuario(){
		List<Usuario> listaUsr = new ArrayList<Usuario>();
		listaUsr = usuarioLogic.consultarUsr();
		JSONArray arrUsr = new JSONArray(listaUsr);
		String arrResp = arrUsr.toString().replace("\\\\", "\\");
		String arrResponse = arrResp.replace("\"null\"", "null");
		return arrResponse;
	}
}
