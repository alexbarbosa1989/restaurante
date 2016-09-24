package co.restaurante.resource;

import javax.ws.rs.Path;

@Path("/servicios")
public class Reservas {
	
	@GET
	@Path("getCalendar")
	@Produces(MediaType.APPLICATION_JSON)
	public String crearReserva(){
		
	}
}
