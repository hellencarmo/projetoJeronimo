package br.com.tc.view;

import br.com.tc.control.ManterUsuario;
import br.com.tc.model.Usuario;
import br.com.tc.util.Convert;
import br.com.tc.util.Messages;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.data.Binder;
import com.vaadin.event.ShortcutAction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeronimo
 * @since 28/05/2017
 */
public class UsuarioGrid extends UsuarioGridView implements GridView<ManterUsuario, Usuario> {
	
	private MainUI mainUI;
	private ManterUsuario manterUsuario;
	private Usuario usuario;
	private Binder<Usuario> binder;
	private List<Usuario> mList;
	private List<Usuario> upList;
	
	public UsuarioGrid(MainUI mainUI) {
		this.mainUI = mainUI;
		setVariables();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public void setVariables() {
		binder();
		setIM();
		list();
		events();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public void binder() {
		binder = new BeanValidationBinder<Usuario>(Usuario.class);
		binder.bindInstanceFields(this);
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public void setIM() {
		manterUsuario = new ManterUsuario();
		usuario = manterUsuario.getM();
		setB();
	}
	
	/**
	 * @param manterUsuario
	 * @param usuario
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param manterUsuario
	 * @param usuario
	 */
	@Override
	public void setIM(ManterUsuario manterUsuario, Usuario usuario) {
		this.manterUsuario = manterUsuario;
		this.usuario = usuario;
		manterUsuario.setM(usuario);
		setB();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param manterUsuario
	 */
	@Override
	public void setI(ManterUsuario manterUsuario) {
		this.manterUsuario = manterUsuario;
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param usuario
	 */
	@Override
	public void setM(Usuario usuario) {
		this.usuario = usuario;
		manterUsuario.setM(usuario);
		senha_padrao.setReadOnly(false);
		senha_padrao.clear();
		senha_padrao.setReadOnly(!usuario.isPersisted());
		setB();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public void setB() {
		binder.forField(nome_usuario).asRequired(Messages.required).bind("nome_usuario");
		binder.setBean(usuario);
		if (usuario.isPersisted()) {
			action_title.setValue("Atualizar");
			delete.setEnabled(true);
		} else {
			action_title.setValue("Adicionar");
			delete.setEnabled(false);
		}
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public void list() {
		try {
			mList = manterUsuario.list();
			if (upList == null) {
				upList = new ArrayList<Usuario>();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public void updateList() {
		filter.clear();
		list.setItems(mList);
		list.sort("id_usuario");
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param key
	 */
	@Override
	public void updateList(String key) {
		key = key.toLowerCase();
		upList.clear();
		for (Usuario usuario : mList) {
			String id = Convert.integerToString(usuario.id());
			String nome = usuario.getNome_usuario().toLowerCase();
			String s_inserted = Convert.dateToString(usuario.getInserted());
			String s_changed = Convert.dateToString(usuario.getChanged());
			Boolean contains_id = id.contains(key);
			Boolean contains_nome = nome.contains(key);
			Boolean contains_inserted = s_inserted.contains(key);
			Boolean contains_changed = s_changed.contains(key);
			if (contains_id || contains_nome || contains_inserted || contains_changed) {
				upList.add(usuario);
			}
		}
		list.setItems(upList);
		list.sort("id_usuario");
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public void events() {
		add.addClickListener(e -> {
			add();
		});
		save.setClickShortcut(ShortcutAction.KeyCode.ENTER);
		save.addClickListener(e -> {
			saveOrUpdate();
		});
		delete.addClickListener(e -> {
			delete();
		});
		list.asSingleSelect().addValueChangeListener(e -> {
			if (e.getValue() != null) {
				setM(e.getValue());
			}
		});
		cliente_gravar.addValueChangeListener(e -> {
			if (e.getValue() && !cliente_visualizar.getValue()) {
				cliente_visualizar.setValue(true);
			}
			cliente_visualizar.setReadOnly(e.getValue() || cliente_excluir.getValue());
		});
		cliente_excluir.addValueChangeListener(e -> {
			if (e.getValue() && !cliente_visualizar.getValue()) {
				cliente_visualizar.setValue(true);
			}
			cliente_visualizar.setReadOnly(e.getValue() || cliente_gravar.getValue());
		});
		contrato_gravar.addValueChangeListener(e -> {
			if (e.getValue() && !contrato_visualizar.getValue()) {
				contrato_visualizar.setValue(true);
			}
			contrato_visualizar.setReadOnly(e.getValue() || contrato_excluir.getValue());
		});
		contrato_excluir.addValueChangeListener(e -> {
			if (e.getValue() && !contrato_visualizar.getValue()) {
				contrato_visualizar.setValue(true);
			}
			contrato_visualizar.setReadOnly(e.getValue() || contrato_gravar.getValue());
		});
		financeira_gravar.addValueChangeListener(e -> {
			if (e.getValue() && !financeira_visualizar.getValue()) {
				financeira_visualizar.setValue(true);
			}
			financeira_visualizar.setReadOnly(e.getValue() || financeira_excluir.getValue());
		});
		financeira_excluir.addValueChangeListener(e -> {
			if (e.getValue() && !financeira_visualizar.getValue()) {
				financeira_visualizar.setValue(true);
			}
			financeira_visualizar.setReadOnly(e.getValue() || financeira_gravar.getValue());
		});
		caixa_gravar.addValueChangeListener(e -> {
			if (e.getValue() && !caixa_visualizar.getValue()) {
				caixa_visualizar.setValue(true);
			}
			caixa_visualizar.setReadOnly(e.getValue() || caixa_excluir.getValue());
		});
		caixa_excluir.addValueChangeListener(e -> {
			if (e.getValue() && !caixa_visualizar.getValue()) {
				caixa_visualizar.setValue(true);
			}
			caixa_visualizar.setReadOnly(e.getValue() || caixa_gravar.getValue());
		});
		filter.addValueChangeListener(e -> {
			updateList(e.getValue());
		});
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public void add() {
		setM(new Usuario());
		list.deselectAll();
		nome_usuario.focus();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public void saveOrUpdate() {
		Boolean isPersisted = usuario.isPersisted();
		if (binder.validate().isOk()) {
			try {
				usuario.setDefault();
				if (senha_padrao.getValue()) {
					usuario.setSenha("1234");
				}
				if (manterUsuario.persist()) {
					if (isPersisted) {
						Messages.updateSucess();
					} else {
						Messages.insertSucess();
						mList.add(usuario);
					}
					updateList();
				} else {
					if (isPersisted) {
						Messages.updateError();
					} else {
						Messages.insertError();
					}
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	/**
	 * @author Jeronimo
	 * @since 29/05/2017
	 */
	@Override
	public void delete() {
		if (usuario.isPersisted()) {
			try {
				if (manterUsuario.delete()) {
					Messages.deleteSucess();
					mList.remove(usuario);
					updateList();
				} else {
					Messages.deleteError();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
