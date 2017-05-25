package br.com.tc.model;

import br.com.tc.util.Generic;

import javax.persistence.Column;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

/**
 * @author Jeronimo
 * @since 25/05/2017
 */
public abstract class Master implements Serializable, Cloneable {
	
	@Column(nullable = false)
	private Date inserted;
	
	@Column(nullable = false)
	private Date changed;
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 */
	public Master() {}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return inserted
	 */
	public Date getInserted() {
		return inserted;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param inserted
	 */
	public void setInserted(Date inserted) {
		this.inserted = inserted;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return changed
	 */
	public Date getChanged() {
		return changed;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param changed
	 */
	public void setChanged(Date changed) {
		this.changed = changed;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return fields
	 */
	public Field[] fields() {
		return Generic.fields(this);
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param f field
	 * @param v value
	 * @throws Exception
	 */
	public <V extends Object>void set(Field f, V v) throws Exception {
		Generic.set(f, this, v);
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param f field
	 * @return value
	 * @throws Exception
	 */
	public <V extends Object>V get(Field f) throws Exception {
		return Generic.get(f, this);
	}
}
