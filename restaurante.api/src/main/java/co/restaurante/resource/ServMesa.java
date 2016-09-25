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

import co.restaurante.entities.Mesa;
import co.restaurante.interfaces.IMesaLogic;

@Path("/mesa")
public class ServMesa {

	@Inject
	private IMesaLogic mesaLogic;

	@GET		
	@Path("/crearMesa/{idMesa}/{idSede}")
	@Produces(MediaType.APPLICATION_JSON)
	public String crearMesa(@PathParam("idMesa") String idMesa,
							   @PathParam("idSede") String idSede){
		Mesa mesa = new Mesa();
		String respuesta = new String();
		mesa.setId(Long.parseLong(idMesa));
		mesa.setSedeId(Long.parseLong(idSede));
		respuesta = mesaLogic.registroMesa(mesa);
		return respuesta;
	}
	
	@GET
	@Path("/consultarMesas")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarMesa(){
		List<Mesa> listaMesa = new ArrayList<Mesa>();
		listaMesa = mesaLogic.consultarMesas();
		JSONArray arrUsr = new JSONArray(listaMesa);
		String arrResp = arrUsr.toString().replace("\\\\", "\\");
		String arrResponse = arrResp.replace("\"null\"", "null");
		return arrResponse;
	}
	
}
