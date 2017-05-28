package br.com.tc.control;

import br.com.tc.dao.MasterDAO;

import java.util.List;

/**
 * @author Jeronimo
 * @since 27/05/2017
 */
public abstract class MasterControl<M extends Object> {
	
	protected MasterDAO<M> dao;
	protected M m;
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	public MasterControl() {
		String p = getClass().getPackage().getName().replace("Control", "dao");
		String c = getClass().getSimpleName().replace("Manter", "");
		try {
			dao = (MasterDAO<M>) Class.forName(p + c).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		p = p.replace("dao", "model");
		try {
			m = (M) Class.forName(p + c).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		setM(m);
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m model
	 */
	public void setM(M m) {
		this.m = m;
		dao.setM(m);
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
	 * @param m model
	 */
	public void persist(M m) {
		setM(m);
		persist();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	public void persist() {
		dao.persist();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m model
	 * @return m model
	 */
	public M find(M m) {
		setM(m);
		return find();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return m model
	 */
	public M find() {
		return dao.find();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m model
	 * @return list
	 */
	public List<M> list(M m) {
		setM(m);
		return list();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return list
	 */
	public List<M> list() {
		return dao.list();
	}
}
