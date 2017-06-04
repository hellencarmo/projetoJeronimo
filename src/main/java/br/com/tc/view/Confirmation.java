package br.com.tc.view;

import br.com.tc.control.IControl;
import br.com.tc.model.GenericModel;
import com.vaadin.event.ShortcutAction;
import com.vaadin.ui.Window;

/**
 * @author Jeronimo
 * @since 04/06/2017
 */
public class Confirmation<I extends IControl<M>, M extends GenericModel> extends ConfirmationView {
	
	private final Window window = new Window();
	private MainUI mainUI;
	private GridView<I, M> gridView;
	private FormView<I, M> formView;
	private Boolean danger;
	
	/**
	 * @author Jeronimo
	 * @since 04/06/2017
	 */
	public Confirmation(MainUI mainUI, GridView<I, M> gridView, Boolean danger) {
		this.mainUI = mainUI;
		this.gridView = gridView;
		window();
		type(danger);
		events();
	}
	
	/**
	 * @author Jeronimo
	 * @since 04/06/2017
	 */
	public Confirmation(MainUI mainUI, GridView<I, M> gridView, Boolean danger, String... messages) {
		this.mainUI = mainUI;
		this.gridView = gridView;
		window();
		type(danger);
		messages(messages);
		events();
	}
	
	/**
	 * @author Jeronimo
	 * @since 04/06/2017
	 */
	public Confirmation(MainUI mainUI, FormView<I, M> formView, Boolean danger) {
		this.mainUI = mainUI;
		this.formView = formView;
		window();
		type(danger);
		events();
	}
	
	/**
	 * @author Jeronimo
	 * @since 04/06/2017
	 */
	public Confirmation(MainUI mainUI, FormView<I, M> formView, Boolean danger, String... messages) {
		this.mainUI = mainUI;
		this.formView = formView;
		window();
		type(danger);
		messages(messages);
		events();
	}
	
	/**
	 * @author Jeronimo
	 * @since 04/06/2017
	 */
	private void window() {
		window.setContent(this);
		window.setModal(true);
		window.setClosable(false);
		window.setResizable(false);
		window.setDraggable(false);
		window.center();
	}
	
	/**
	 * @author Jeronimo
	 * @since 04/06/2017
	 */
	public void show() {
		mainUI.addWindow(window);
	}
	
	private void type(Boolean danger) {
		this.danger = danger;
		yes.setVisible(!danger);
		yes_d.setVisible(danger);
	}
	
	/**
	 * @author Jeronimo
	 * @since 04/06/2017
	 */
	public void messages(String... messages) {
		StringBuilder m = new StringBuilder();
		for (String message : messages) {
			m.append("<p align=center>").append(message);
		}
		l_message.setValue(m.toString());
	}
	
	/**
	 * @author Jeronimo
	 * @since 04/06/2017
	 */
	public Boolean danger() {
		return danger;
	}
	
	/**
	 * @author Jeronimo
	 * @since 04/06/2017
	 */
	private void events() {
		yes_d.setClickShortcut(ShortcutAction.KeyCode.F1);
		yes_d.addClickListener(e -> {
			if (gridView != null) {
				gridView.confirmation(true);
			} else if (formView != null) {
			}
			window.close();
		});
		yes.setClickShortcut(ShortcutAction.KeyCode.ENTER);
		yes.addClickListener(e -> {
			if (gridView != null) {
				gridView.confirmation(true);
			} else if (formView != null) {
			}
			window.close();
		});
		no.setClickShortcut(ShortcutAction.KeyCode.F2);
		no.addClickListener(e -> {
			window.close();
		});
	}
}
