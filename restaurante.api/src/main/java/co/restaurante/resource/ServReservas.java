package co.restaurante.resource;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;

import co.restaurante.entities.Reserva;
import co.restaurante.interfaces.IReservaLogic;
import co.restaurante.utils.RestauranteUtils;

@Path("/reservas")
public class ServReservas {

	@Inject
	private IReservaLogic reservaLogic;
	
	private final String RESERVA_CREADA = "C";
	private final String RESERVA_ELIMINADA = "E";

	@GET
	@Path("/crearReserva/{idRes}/{idUsr}/{idMesa}/{fecha}")
	@Produces(MediaType.APPLICATION_JSON)
	public String crearReserva(@PathParam("idRes") String idRes,
			                   @PathParam("idUsr") String idUsr,
			                   @PathParam("idMesa") String idMesa,
			                   @PathParam("fecha") String fecha) {
		String respuesta = new String();
		Reserva res = new Reserva();
		res.setId(Long.parseLong(idRes));
		res.setUsrId(Long.parseLong(idUsr));
		res.setMesaId(Long.parseLong(idMesa));
		res.setEstReserva(RESERVA_CREADA); 
		try {
			res.setFecha(RestauranteUtils.convertStringToDate(fecha));
		} catch (ParseException e) {
			respuesta = "Error en formato de fecha. Debe ser YYYYMMDD";
		}
		respuesta = reservaLogic.crearReserva(res);
		return respuesta;
	}

	@GET
	@Path("/consultarReservas")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarReserva() {
		List<Reserva> listaRe = new ArrayList<Reserva>();
		listaRe = reservaLogic.consultarReservas();
		JSONArray arrUsr = new JSONArray(listaRe);
		String arrResp = arrUsr.toString().replace("\\\\", "\\");
		String arrResponse = arrResp.replace("\"null\"", "null");
		return arrResponse;
	}
	
	@GET
	@Path("/cancelarReserva/{idRes}/{fecha}")
	@Produces(MediaType.APPLICATION_JSON)
	public String cancelarReserva(@PathParam("idRes") String idRes,
								  @PathParam("idRes") String fecha) {
		String respuesta = new String();
		Reserva res = new Reserva();
		res = reservaLogic.consultarReserva(Long.parseLong(idRes));
		res.setEstReserva(RESERVA_ELIMINADA); 
		try {
			res.setFecha(RestauranteUtils.convertStringToDate(fecha));
		} catch (ParseException e) {
			respuesta = "Error en formato de fecha. Debe ser YYYYMMDD";
		}
		reservaLogic.cancelarReserva(res);
		return respuesta;
	}
	
	@GET
	@Path("/consultarReservaPorId/{idRes}")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarReservaPorId(@PathParam("idRes") String idRes) {
		List<Reserva> listaRe = new ArrayList<Reserva>();
		listaRe.add(reservaLogic.consultarReserva(Long.parseLong(idRes)));
		JSONArray arrUsr = new JSONArray(listaRe);
		String arrResp = arrUsr.toString().replace("\\\\", "\\");
		String arrResponse = arrResp.replace("\"null\"", "null");
		return arrResponse;
	}
}
