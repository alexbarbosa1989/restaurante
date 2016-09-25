package co.restaurante.dao;

import java.util.List;

import javax.ejb.Local;

@Local
public interface IGenericDaoLocal<T> {

	public void create(T p);
	public T edit(T p);
	public void delete(T p);
	public T findById(Object p);
	public List<T> findAll() ;
}
