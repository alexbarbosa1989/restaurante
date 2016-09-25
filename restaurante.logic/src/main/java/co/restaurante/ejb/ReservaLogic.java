package co.restaurante.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import co.restaurante.dao.IReservaDao;
import co.restaurante.entities.Reserva;
import co.restaurante.interfaces.IReservaLogic;

@Stateless
public class ReservaLogic implements IReservaLogic{
	
	@Inject
	private IReservaDao dao;
	
	public String crearReserva(Reserva r){
		String resultado = new String();
		try{
			dao.create(r);
			resultado = "OK. Creacion exitosa";
		}catch (Exception e){
			resultado = "ERROR. en creacion";

		}
		return resultado;
	};

	
	public String cancelarReserva(Reserva r){
		String resultado = new String();
		try{
			dao.edit(r);
			resultado = "OK. Creacion exitosa";
		}catch (Exception e){
			resultado = "ERROR. en creacion";

		}
		return resultado;
	};
	
	public List<Reserva> consultarReservas(){
		List<Reserva> l = new ArrayList<Reserva>();
		l = dao.findAll();
		return l;
	};
	
	public Reserva consultarReserva(Long idReserva){
		Reserva r = new Reserva();
		dao.findById(idReserva);
		return r;
	}
	
}
