package co.restaurante.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import co.restaurante.dao.IUsuarioDao;
import co.restaurante.dao.UsuarioDao;
import co.restaurante.entities.Usuario;
import co.restaurante.interfaces.IUsuarioLogic;

@Stateless
public class UsuarioLogic implements IUsuarioLogic{
	@Inject
	private IUsuarioDao dao;
	
	public void registroUsuario(Usuario u){
		dao.create(u);
	};
	
	public List<Usuario> consultarUsr(){
		List<Usuario> listaUsr = new ArrayList<Usuario>();
		listaUsr = dao.findAll();
		return listaUsr;
	}
	
}