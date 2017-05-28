package br.com.tc.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author Jeronimo
 * @since 28/05/2017
 */
@MappedSuperclass
public abstract class UserMaster extends GenericModel {
	
	@Column(nullable = false)
	private Date inserted;
	
	@Column(nullable = false)
	private Date changed;
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	public UserMaster() {}
	
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
}
