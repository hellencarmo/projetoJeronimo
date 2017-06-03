package br.com.tc.dao;

import br.com.tc.model.GenericModel;
import org.hibernate.Session;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeronimo
 * @since 25/05/2017
 */
public abstract class MasterDAO<M extends GenericModel> {
	
	protected Class<M> c;
	protected Session s;
	protected M m;
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 */
	public MasterDAO() {
		c = (Class<M>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		try {
			m = c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		create();
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
	
	protected void create() {
		try {
			session();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession();
		}
	}
	
	protected void session() {
		s = Hibernate.session();
	}
	
	protected void closeSession() {
		Hibernate.closeSession(s);
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m object
	 * @return  isOK
	 */
	public Boolean persist(M m) throws Exception {
		this.m = m;
		return persist();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return isOK
	 */
	public Boolean persist() throws Exception {
		Boolean isOK = false;
		try {
			session();
			s.getTransaction().begin();
			s.saveOrUpdate(m);
			s.getTransaction().commit();
			isOK = true;
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			closeSession();
			return isOK;
		}
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m object
	 * @return obj object
	 */
	public M find(M m) throws Exception {
		this.m = m;
		return find();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return obj object
	 */
	public M find() throws Exception {
		M obj = null;
		try {
			session();
			obj = s.find(c, m);
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			closeSession();
			return obj;
		}
	}
	
	/**
	 * @author Jeronimo
	 * @since 29/05/2017
	 * @param m object
	 * @return isOK
	 */
	public Boolean delete(M m) throws Exception {
		this.m = m;
		return delete();
	}
	
	/**
	 * @author Jeronimo
	 * @since 29/05/2017
	 * @return isOK
	 */
	public Boolean delete() throws Exception {
		Boolean isOK = false;
		try {
			session();
			s.getTransaction().begin();
			s.delete(m);
			s.getTransaction().commit();
			isOK = true;
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			closeSession();
			return isOK;
		}
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m object
	 * return l list
	 */
	public List<M> list(M m) throws Exception {
		this.m = m;
		return list();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * return l list
	 */
	public List<M> list() throws Exception {
		List<M> l = new ArrayList<M>();
		try {
			session();
			l.addAll(s.createCriteria(c).list());
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			closeSession();
			return l;
		}
	}
}
