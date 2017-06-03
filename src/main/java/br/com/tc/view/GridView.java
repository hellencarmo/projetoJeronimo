package br.com.tc.view;

import br.com.tc.control.IControl;
import br.com.tc.model.GenericModel;

/**
 * @author Jeronimo
 * @since 28/05/2017
 */
public interface GridView<I extends IControl<M>, M extends GenericModel> {
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	void setVariables();
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	void binder();
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	void setIM();
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param i icontrol
	 * @param m model
	 */
	void setIM(I i, M m);
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param i icontrol
	 */
	void setI(I i);
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param m model
	 */
	void setM(M m);
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	void setB();
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	void list();
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	void updateList();
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param key
	 */
	void updateList(String key);
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	void events();
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	void add();
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	void saveOrUpdate();
	
	/**
	 * @author Jeronimo
	 * @since 29/05/2017
	 */
	void delete();
}
