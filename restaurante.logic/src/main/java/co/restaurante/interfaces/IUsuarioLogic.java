package co.restaurante.interfaces;

import java.util.List;

import javax.ejb.Local;
import javax.enterprise.context.RequestScoped;

import co.restaurante.entities.Usuario;


@Local
public interface IUsuarioLogic {

	public void registroUsuario(Usuario u);
	
	public List<Usuario> consultarUsr();
	
}
