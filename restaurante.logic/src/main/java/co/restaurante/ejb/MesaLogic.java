package co.restaurante.ejb;

import javax.ejb.Stateless;

import co.restaurante.dao.MesaDao;
import co.restaurante.entities.Mesa;
import co.restaurante.interfaces.IMesaLogic;

@Stateless
public class MesaLogic implements IMesaLogic{

	public void registroMesa(Mesa m){
		MesaDao dao = new MesaDao();
		dao.create(m);
	};
	
}
