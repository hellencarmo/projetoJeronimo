package br.com.tc.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Jeronimo
 * @since 25/05/2017
 */
@MappedSuperclass
public abstract class Master extends GenericModel {
	
	@OneToOne
	@JoinColumn(name = "id_usuario")
	protected Usuario usuario;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	protected Date inserted;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	protected Date changed;
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 */
	public Master() {}
	
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
	 * @return usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
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
}
