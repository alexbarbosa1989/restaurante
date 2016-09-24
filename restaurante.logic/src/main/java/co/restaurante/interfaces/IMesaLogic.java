package co.restaurante.interfaces;

import javax.ejb.Local;

import co.restaurante.entities.Mesa;

@Local
public interface IMesaLogic {

	public void registroMesa(Mesa m);
	
}
