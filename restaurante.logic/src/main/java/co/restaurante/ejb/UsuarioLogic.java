package co.restaurante.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import co.restaurante.dao.UsuarioDao;
import co.restaurante.entities.Usuario;
import co.restaurante.interfaces.IUsuarioLogic;

@Stateless
public class UsuarioLogic implements IUsuarioLogic{

	public void registroUsuario(Usuario u){
		UsuarioDao dao = new UsuarioDao();
		dao.create(u);
	};
	
	public List<Usuario> consultarUsr(){
		List<Usuario> listaUsr = new ArrayList<Usuario>();
		UsuarioDao dao = new UsuarioDao();
		listaUsr = dao.findAll();
		return listaUsr;
	}
	
}
