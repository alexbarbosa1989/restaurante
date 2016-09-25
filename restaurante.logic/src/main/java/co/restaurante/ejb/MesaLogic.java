package co.restaurante.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import co.restaurante.dao.IMesaDao;
import co.restaurante.entities.Mesa;
import co.restaurante.interfaces.IMesaLogic;

@Stateless
public class MesaLogic implements IMesaLogic{
	
	@Inject
	private IMesaDao dao;
	
	public String registroMesa(Mesa m){
		String resultado = new String();
		try{
			dao.create(m);
			resultado = "OK. Creacion exitosa";
		}catch (Exception e){
			resultado = "ERROR. en creacion";

		}
		return resultado;
	};
	

	public List<Mesa> consultarMesas(){
		List<Mesa> listaMesa = new ArrayList<Mesa>();
		listaMesa = dao.findAll();
		return listaMesa;
	}
	
}
