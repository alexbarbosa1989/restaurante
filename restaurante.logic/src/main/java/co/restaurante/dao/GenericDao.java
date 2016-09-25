package co.restaurante.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GenericDao<T> {

	@PersistenceContext(unitName = "restauranteLogic")
	protected EntityManager em;
	private Class<T> persistenceClass;

	@SuppressWarnings("unchecked")
	public GenericDao() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		persistenceClass = (Class) pt.getActualTypeArguments()[0];
	}
	

	public void create(T p) {
		em.persist(p);
	}


	public T edit(T p) {
		return em.merge(p);
	}


	public void delete(T p) {
		em.remove(em.merge(p));
	}
	

	public T findById(Object p) {
        Class<T> claseEntidad = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		return em.find(claseEntidad, p);
	}


	public List<T> findAll() {
		Query query = em.createQuery("SELECT e FROM " + persistenceClass.getSimpleName() + " e ORDER BY e.id DESC");
	    return (List<T>) query.getResultList();
	}
}
