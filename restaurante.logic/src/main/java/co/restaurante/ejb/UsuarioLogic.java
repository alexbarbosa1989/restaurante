package co.restaurante.ejb;

import javax.ejb.Stateless;

import co.restaurante.dao.UsuarioDao;
import co.restaurante.entities.Usuario;

@Stateless
public class UsuarioLogic {

	public void registroUsuario(Usuario u){
		UsuarioDao dao = new UsuarioDao();
		dao.create(u);
	};
	
}
