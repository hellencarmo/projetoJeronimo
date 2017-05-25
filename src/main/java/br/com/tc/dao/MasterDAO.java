package br.com.tc.dao;

import org.hibernate.Session;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author Jeronimo
 * @since 25/05/2017
 */
public abstract class MasterDAO<T extends Object> {
	
	protected Class<T> c;
	protected Session s;
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 */
	public MasterDAO() {
		c = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		s = Hibernate.sessionFactory().openSession();
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param t object
	 */
	public void persistir(T t) {
		s.beginTransaction();
		s.saveOrUpdate(t);
		s.close();
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param t object
	 * @return obj object
	 */
	public T buscar(T t) {
		s.beginTransaction();
		T obj = s.find(c, t);
		s.close();
		return obj;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param t object
	 * return l list
	 */
	public List<T> listar(T t) {
		s.beginTransaction();
		List<T> l = s.createCriteria(c).list();
		s.close();
		return l;
	}
}
