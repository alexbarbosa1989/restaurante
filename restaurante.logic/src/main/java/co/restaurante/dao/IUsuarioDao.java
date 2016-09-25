package co.restaurante.dao;

import javax.ejb.Local;

import co.restaurante.entities.Usuario;


@Local
public interface IUsuarioDao extends IGenericDaoLocal<Usuario>{
	
}
