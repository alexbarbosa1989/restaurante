package co.restaurante.interfaces;

import java.util.List;

import javax.ejb.Local;

import co.restaurante.entities.Usuario;

@Local
public interface IUsuarioLogic {

	public Usuario registroUsuario(Usuario u);
	
	public List<Usuario> consultarUsr();
	
}
