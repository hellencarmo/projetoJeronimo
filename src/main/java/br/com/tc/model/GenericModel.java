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
	 * @return fields
	 */
	public Field[] fieldsSuper() {
		return Generic.fieldsSuper(this);
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param n field_name
	 * @return  field
	 * @throws Exception
	 */
	public <T extends Object>Field field(String n) throws Exception {
		return Generic.field(this, n);
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param n field_name
	 * @return  field
	 * @throws Exception
	 */
	public <T extends Object>Field fieldSuper(String n) throws Exception {
		return Generic.fieldSuper(this, n);
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
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param n name_field
	 * @param o object
	 * @param  v value
	 * @throws Exception
	 */
	public <O extends Object, V extends Object>void notNull(String n, O o, V v) throws Exception {
		if (o == null) {
			set(field(n), v);
		}
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param n name_field
	 * @param o object
	 * @param  v value
	 * @throws Exception
	 */
	public <O extends Object, V extends Object>void notNullSuper(String n, O o, V v) throws Exception {
		if (o == null) {
			set(fieldSuper(n), v);
		}
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return v value
	 */
	public abstract <V extends Object>V id();
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return isPersisted
	 */
	public Boolean isPersisted() {
		return id() != null;
	}
}
