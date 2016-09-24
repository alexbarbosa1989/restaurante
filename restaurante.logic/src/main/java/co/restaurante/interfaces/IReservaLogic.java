package co.restaurante.interfaces;

import java.util.List;

import javax.ejb.Local;

import co.restaurante.entities.Reserva;

@Local
public interface IReservaLogic {

	public void crearReserva(Reserva r);
	
	public void cancelarReserva(Reserva r);
	
	public List<Reserva> consultarReservas();
	
	public Reserva consultarReserva(Long idReserva);
}
