package br.com.tc.view;

import br.com.tc.control.ManterUsuario;
import br.com.tc.model.Usuario;

/**
 * @author Jeronimo
 * @since 28/05/2017
 */
public class UsuarioGrid extends UsuarioGridView implements GridView<ManterUsuario, Usuario> {
	
	private MainUI mainUI;
	private ManterUsuario manterUsuario;
	private Usuario usuario;
	
	public UsuarioGrid(MainUI mainUI) {
		this.mainUI = mainUI;
		setCM();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public void setCM() {
		manterUsuario = new ManterUsuario();
		usuario = manterUsuario.getM();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public void eventos() {
		add.addClickListener(e -> {
			adicionar();
		});
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public void adicionar() {
	}
}
