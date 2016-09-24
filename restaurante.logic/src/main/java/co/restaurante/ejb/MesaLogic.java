package co.restaurante.ejb;

import javax.ejb.Stateless;

import co.restaurante.dao.MesaDao;
import co.restaurante.entities.Mesa;

@Stateless
public class MesaLogic {

	public void registroMesa(Mesa m){
		MesaDao dao = new MesaDao();
		dao.create(m);
	};
	
}
