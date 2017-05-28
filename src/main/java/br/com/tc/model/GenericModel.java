package br.com.tc.model;

import br.com.tc.util.Generic;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * @author Jeronimo
 * @since 28/05/2017
 */
public abstract class GenericModel implements Serializable, Cloneable {
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	public GenericModel() {}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return fields
	 */
	public Field[] fields() {
		return Generic.fields(this);
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param f field
	 * @param v value
	 * @throws Exception
	 */
	public <V extends Object>void set(Field f, V v) throws Exception {
		Generic.set(f, this, v);
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param f field
	 * @return value
	 * @throws Exception
	 */
	public <V extends Object>V get(Field f) throws Exception {
		return Generic.get(f, this);
	}
}
