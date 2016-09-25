package co.restaurante.interfaces;

import java.util.List;

import javax.ejb.Local;

import co.restaurante.entities.Mesa;

@Local
public interface IMesaLogic{

	public String registroMesa(Mesa m);
	
	public List<Mesa> consultarMesas();
	
}
