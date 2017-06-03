package br.com.tc.control;

import br.com.tc.model.GenericModel;

import java.util.List;

/**
 * @author Jeronimo
 * @since 02/06/2017
 */
public interface IControl<M extends GenericModel> {
	
	/**
	 * @author Jeronimo
	 * @since 02/06/2017
	 * @param m model
	 */
	public void setM(M m);
	
	/**
	 * @author Jeronimo
	 * @since 02/06/2017
	 * @return m model
	 */
	public M getM();
	
	/**
	 * @author Jeronimo
	 * @since 02/06/2017
	 * @param m model
	 * @return isOK
	 */
	public Boolean persist(M m) throws Exception;
	
	/**
	 * @author Jeronimo
	 * @since 02/06/2017
	 * @return isOK
	 * @throws Exception
	 */
	public Boolean persist() throws Exception;
	
	/**
	 * @author Jeronimo
	 * @since 02/06/2017
	 * @param m model
	 * @return m model
	 * @throws Exception
	 */
	public M find(M m) throws Exception;
	
	/**
	 * @author Jeronimo
	 * @since 02/06/2017
	 * @return m model
	 * @throws Exception
	 */
	public M find() throws Exception;
	
	/**
	 * @author Jeronimo
	 * @since 02/06/2017
	 * @param m object
	 * @return isOK
	 * @throws Exception
	 */
	public Boolean delete(M m) throws Exception;
	
	/**
	 * @author Jeronimo
	 * @since 02/06/2017
	 * @return isOK
	 * @throws Exception
	 */
	public Boolean delete() throws Exception;
	
	/**
	 * @author Jeronimo
	 * @since 02/06/2017
	 * @param m model
	 * @return list
	 * @throws Exception
	 */
	public List<M> list(M m) throws Exception;
	
	/**
	 * @author Jeronimo
	 * @since 02/06/2017
	 * @return list
	 * @throws Exception
	 */
	public List<M> list() throws Exception;
}
