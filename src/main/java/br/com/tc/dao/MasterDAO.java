package br.com.tc.dao;

import org.hibernate.Session;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author Jeronimo
 * @since 25/05/2017
 */
public abstract class MasterDAO<M extends Object> {
	
	protected Class<M> c;
	protected Session s;
	protected M m;
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 */
	public MasterDAO() {
		c = (Class<M>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		s = Hibernate.sessionFactory().openSession();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m model
	 */
	public void setM(M m) {
		this.m = m;
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return m model
	 */
	public M getM() {
		return m;
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m object
	 */
	public void persist(M m) {
		this.m = m;
		persist();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	public void persist() {
		s.beginTransaction();
		s.saveOrUpdate(m);
		s.close();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m object
	 * @return obj object
	 */
	public M find(M m) {
		this.m = m;
		return find();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return obj object
	 */
	public M find() {
		s.beginTransaction();
		M obj = s.find(c, m);
		s.close();
		return obj;
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m object
	 * return l list
	 */
	public List<M> list(M m) {
		this.m = m;
		return list();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * return l list
	 */
	public List<M> list() {
		s.beginTransaction();
		List<M> l = s.createCriteria(c).list();
		s.close();
		return l;
	}
}
