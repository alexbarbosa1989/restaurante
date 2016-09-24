package co.restaurante.interfaces;

import javax.ejb.Local;

import co.restaurante.entities.Usuario;

@Local
public interface IUsuarioLogic {

	public Usuario registroUsuario(Usuario u);
	
}
