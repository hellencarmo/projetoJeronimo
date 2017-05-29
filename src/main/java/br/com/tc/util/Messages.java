package br.com.tc.util;

import com.vaadin.server.Page;
import com.vaadin.ui.Notification;
import com.vaadin.ui.themes.ValoTheme;

/**
 * @author Jeronimo
 * @since 25/05/2017
 */
public class Messages {
	
	public static final String required;
	private static final Notification insertSucess;
	private static final Notification insertError;
	private static final Notification updateSucess;
	private static final Notification updateError;
	private static final Notification deleteSucess;
	private static final Notification deleteError;
	
	static {
		required = "Campo obrigatório!";
		insertSucess = new Notification(
				"Sucesso!",
				"Inserido com sucesso!",
				Notification.Type.TRAY_NOTIFICATION
		);
		insertSucess.setStyleName(ValoTheme.NOTIFICATION_SUCCESS);
		insertError = new Notification(
				"Erro!",
				"Erro ao inserir!",
				Notification.Type.TRAY_NOTIFICATION
		);
		insertError.setStyleName(ValoTheme.NOTIFICATION_FAILURE);
		updateSucess = new Notification(
				"Sucesso!",
				"Atualizado com sucesso!",
				Notification.Type.TRAY_NOTIFICATION
		);
		updateSucess.setStyleName(ValoTheme.NOTIFICATION_SUCCESS);
		updateError = new Notification(
				"Sucesso!",
				"Erro ao atualizar!",
				Notification.Type.TRAY_NOTIFICATION
		);
		updateError.setStyleName(ValoTheme.NOTIFICATION_FAILURE);
		deleteSucess = new Notification(
				"Sucesso!",
				"Apagado com sucesso!",
				Notification.Type.TRAY_NOTIFICATION
		);
		deleteSucess.setStyleName(ValoTheme.NOTIFICATION_SUCCESS);
		deleteError = new Notification(
				"Erro!",
				"Erro ao apagar!",
				Notification.Type.TRAY_NOTIFICATION
		);
		deleteError.setStyleName(ValoTheme.NOTIFICATION_FAILURE);
	}
	
	public static void insertSucess() {
		insertSucess.show(Page.getCurrent());
	}
	
	public static void insertError() {
		insertError.show(Page.getCurrent());
	}
	
	public static void updateSucess() {
		updateSucess.show(Page.getCurrent());
	}
	
	public static void updateError() {
		updateError.show(Page.getCurrent());
	}
	
	public static void deleteSucess() {
		deleteSucess.show(Page.getCurrent());
	}
	
	public static void deleteError() {
		deleteError.show(Page.getCurrent());
	}
}
