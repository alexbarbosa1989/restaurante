package co.restaurante.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import co.restaurante.dao.ReservaDao;
import co.restaurante.entities.Reserva;
import co.restaurante.interfaces.IReservaLogic;

@Stateless
public class ReservaLogic implements IReservaLogic{

	public void crearReserva(Reserva r){
		ReservaDao dao = new ReservaDao();
		dao.create(r);
	};
	
	public void cancelarReserva(Reserva r){
		ReservaDao dao = new ReservaDao();
		dao.edit(r);
	};
	
	public List<Reserva> consultarReservas(){
		ReservaDao dao = new ReservaDao();
		List<Reserva> l = new ArrayList<Reserva>();
		l = dao.findAll();
		return l;
	};
	
	public Reserva consultarReserva(Long idReserva){
		ReservaDao dao = new ReservaDao();
		Reserva r = new Reserva();
		dao.findById(idReserva);
		return r;
	}
	
}
