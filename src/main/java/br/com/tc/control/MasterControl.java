package br.com.tc.control;

import br.com.tc.dao.MasterDAO;
import br.com.tc.model.GenericModel;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author Jeronimo
 * @since 27/05/2017
 */
public abstract class MasterControl<D extends MasterDAO<M>, M extends GenericModel> implements IControl<M> {
	
	protected Class<D> c;
	protected D d;
	protected M m;
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	public MasterControl() {
		c = (Class<D>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		try {
			d = c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		m = d.getM();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m model
	 */
	@Override
	public void setM(M m) {
		this.m = m;
		d.setM(m);
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return m model
	 */
	@Override
	public M getM() {
		return m;
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m model
	 * @return isOK
	 * @throws Exception
	 */
	@Override
	public Boolean persist(M m) throws Exception {
		setM(m);
		return persist();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return isOK
	 * @throws Exception
	 */
	@Override
	public Boolean persist() throws Exception {
		return d.persist();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m model
	 * @return m model
	 * @throws Exception
	 */
	@Override
	public M find(M m) throws Exception {
		setM(m);
		return find();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return m model
	 * @throws Exception
	 */
	@Override
	public M find() throws Exception {
		return d.find();
	}
	
	/**
	 * @author Jeronimo
	 * @since 29/05/2017
	 * @param m object
	 * @return isOK
	 * @throws Exception
	 */
	@Override
	public Boolean delete(M m) throws Exception {
		this.m = m;
		return delete();
	}
	
	/**
	 * @author Jeronimo
	 * @since 29/05/2017
	 * @return isOK
	 * @throws Exception
	 */
	@Override
	public Boolean delete() throws Exception {
		return d.delete();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m model
	 * @return list
	 * @throws Exception
	 */
	@Override
	public List<M> list(M m) throws Exception {
		setM(m);
		return list();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return list
	 * @throws Exception
	 */
	@Override
	public List<M> list() throws Exception {
		return d.list();
	}
}
