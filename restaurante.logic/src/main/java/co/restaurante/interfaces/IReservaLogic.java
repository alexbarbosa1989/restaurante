package co.restaurante.interfaces;

import java.util.List;

import javax.ejb.Local;

import co.restaurante.entities.Reserva;

@Local
public interface IReservaLogic {

	public String crearReserva(Reserva r);
	
	public String cancelarReserva(Reserva r);
	
	public List<Reserva> consultarReservas();
	
	public Reserva consultarReserva(Long idReserva);
}
