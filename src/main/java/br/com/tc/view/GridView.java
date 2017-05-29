package br.com.tc.view;

/**
 * @author Jeronimo
 * @since 28/05/2017
 */
public interface GridView<C extends Object, M extends Object> {
	
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
	void setCM();
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	void setCM(C c, M m);
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	void setC(C c);
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
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
