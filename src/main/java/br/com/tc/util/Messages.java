package br.com.tc.util;

import com.vaadin.server.Page;
import com.vaadin.shared.Position;
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
				"Inserido com sucesso!",
				"Clique aqui aperte ESC para fechar",
				Notification.Type.TRAY_NOTIFICATION,
				true
		);
		insertSucess.setPosition(Position.TOP_CENTER);
		insertSucess.setDelayMsec(Notification.DELAY_FOREVER);
		insertSucess.setStyleName(ValoTheme.NOTIFICATION_SUCCESS);
		insertError = new Notification(
				"Erro ao inserir!",
				"Clique aqui aperte ESC para fechar",
				Notification.Type.TRAY_NOTIFICATION,
				true
		);
		insertError.setPosition(Position.TOP_CENTER);
		insertError.setDelayMsec(Notification.DELAY_FOREVER);
		insertError.setStyleName(ValoTheme.NOTIFICATION_FAILURE);
		updateSucess = new Notification(
				"Atualizado com sucesso!",
				"Clique aqui aperte ESC para fechar",
				Notification.Type.TRAY_NOTIFICATION,
				true
		);
		updateSucess.setPosition(Position.TOP_CENTER);
		updateSucess.setDelayMsec(Notification.DELAY_FOREVER);
		updateSucess.setStyleName(ValoTheme.NOTIFICATION_SUCCESS);
		updateError = new Notification(
				"Erro ao atualizar!",
				"Clique aqui aperte ESC para fechar",
				Notification.Type.TRAY_NOTIFICATION,
				true
		);
		updateError.setPosition(Position.TOP_CENTER);
		updateError.setDelayMsec(Notification.DELAY_FOREVER);
		updateError.setStyleName(ValoTheme.NOTIFICATION_FAILURE);
		deleteSucess = new Notification(
				"Apagado com sucesso!",
				"Clique aqui aperte ESC para fechar",
				Notification.Type.TRAY_NOTIFICATION,
				true
		);
		deleteSucess.setPosition(Position.TOP_CENTER);
		deleteSucess.setDelayMsec(Notification.DELAY_FOREVER);
		deleteSucess.setStyleName(ValoTheme.NOTIFICATION_SUCCESS);
		deleteError = new Notification(
				"Erro ao apagar!",
				"Clique aqui ou aperte ESC para fechar",
				Notification.Type.TRAY_NOTIFICATION,
				true
		);
		deleteError.setPosition(Position.TOP_CENTER);
		deleteError.setDelayMsec(Notification.DELAY_FOREVER);
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
