package br.com.tc.view;

import com.vaadin.ui.CssLayout;

/**
 * @author Jeronimo
 * @since 28/05/2017
 */
public class Menu extends MenuView {
	
	private MainUI mainUI;
	private UsuarioGrid usuarioGrid;
	
	public Menu(MainUI mainUI) {
		this.mainUI = mainUI;
		usuarioGrid = new UsuarioGrid(mainUI);
		eventos();
	}
	
	public CssLayout content() {
		return content3;
	}
	
	public void setTitle(String title) {
		view_title.setValue(title);
	}
	
	private void eventos() {
		admin.addClickListener(e -> {
			admin();
		});
	}
	
	public void admin() {
		content().removeAllComponents();
		content().addComponent(usuarioGrid);
		setTitle(admin.getCaption());
		usuarioGrid.updateList();
	}
}
