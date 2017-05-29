package br.com.tc.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author Jeronimo
 * @since 28/05/2017
 */
@MappedSuperclass
public abstract class UserMaster extends GenericModel {
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	protected Date inserted;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	protected Date changed;
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	public UserMaster() {}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @throws Exception
	 */
	public void setDefault() throws Exception {
		notNullSuper("inserted", inserted, new Date());
		setChanged(new Date());
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return inserted
	 */
	public Date getInserted() {
		return inserted;
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param inserted
	 */
	public void setInserted(Date inserted) {
		this.inserted = inserted;
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return changed
	 */
	public Date getChanged() {
		return changed;
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param changed
	 */
	public void setChanged(Date changed) {
		this.changed = changed;
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
	public boolean isPersisted() {
		return id() != null;
	}
}
