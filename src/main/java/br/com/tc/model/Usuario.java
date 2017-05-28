package br.com.tc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Jeronimo
 * @since 25/05/2017
 */
@Entity
public class Usuario extends UserMaster {
	
	@Id
	@GeneratedValue
	private Integer id_usuario;
	
	@Column(nullable = false)
	private String nome_usuario;
	
	@Column(nullable = false)
	private String senha;
	
	@Column(nullable = false)
	private Boolean cliente_visualizar;
	
	@Column(nullable = false)
	private Boolean cliente_gravar;
	
	@Column(nullable = false)
	private Boolean cliente_excluir;
	
	@Column(nullable = false)
	private Boolean contrato_visualizar;
	
	@Column(nullable = false)
	private Boolean contrato_gravar;
	
	@Column(nullable = false)
	private Boolean contrato_excluir;
	
	@Column(nullable = false)
	private Boolean tabela_visualizar;
	
	@Column(nullable = false)
	private Boolean tabela_excluir;
	
	@Column(nullable = false)
	private Boolean caixa_visualizar;
	
	@Column(nullable = false)
	private Boolean caixa_gravar;
	
	@Column(nullable = false)
	private Boolean caixa_excluir;
	
	@Column(nullable = false)
	private Boolean relatorio;
	
	@Column(nullable = false)
	private Boolean comissao;
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 */
	public Usuario() {
		super();
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param nome_usuario
	 * @param senha
	 * @param cliente_visualizar
	 * @param cliente_gravar
	 * @param cliente_excluir
	 * @param contrato_visualizar
	 * @param contrato_gravar
	 * @param contrato_excluir
	 * @param tabela_visualizar
	 * @param tabela_excluir
	 * @param caixa_visualizar
	 * @param caixa_gravar
	 * @param caixa_excluir
	 * @param relatorio
	 * @param comissao
	 */
	public Usuario(String nome_usuario,
			String senha,
			Boolean cliente_visualizar,
			Boolean cliente_gravar,
			Boolean cliente_excluir,
			Boolean contrato_visualizar,
			Boolean contrato_gravar,
			Boolean contrato_excluir,
			Boolean tabela_visualizar,
			Boolean tabela_excluir,
			Boolean caixa_visualizar,
			Boolean caixa_gravar,
			Boolean caixa_excluir,
			Boolean relatorio,
			Boolean comissao) {
		super();
		this.nome_usuario = nome_usuario;
		this.senha = senha;
		this.cliente_visualizar = cliente_visualizar;
		this.cliente_gravar = cliente_gravar;
		this.cliente_excluir = cliente_excluir;
		this.contrato_visualizar = contrato_visualizar;
		this.contrato_gravar = contrato_gravar;
		this.contrato_excluir = contrato_excluir;
		this.tabela_visualizar = tabela_visualizar;
		this.tabela_excluir = tabela_excluir;
		this.caixa_visualizar = caixa_visualizar;
		this.caixa_gravar = caixa_gravar;
		this.caixa_excluir = caixa_excluir;
		this.relatorio = relatorio;
		this.comissao = comissao;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return id_usuario
	 */
	public Integer getId_usuario() {
		return id_usuario;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param id_usuario
	 */
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return nome_usuario
	 */
	public String getNome_usuario() {
		return nome_usuario;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param nome_usuario
	 */
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return senha
	 */
	public String getSenha() {
		return senha;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return cliente_visualizar
	 */
	public Boolean getCliente_visualizar() {
		return cliente_visualizar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param cliente_visualizar
	 */
	public void setCliente_visualizar(Boolean cliente_visualizar) {
		this.cliente_visualizar = cliente_visualizar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return cliente_gravar
	 */
	public Boolean getCliente_gravar() {
		return cliente_gravar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param cliente_gravar
	 */
	public void setCliente_gravar(Boolean cliente_gravar) {
		this.cliente_gravar = cliente_gravar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return cliente_excluir
	 */
	public Boolean getCliente_excluir() {
		return cliente_excluir;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param cliente_excluir
	 */
	public void setCliente_excluir(Boolean cliente_excluir) {
		this.cliente_excluir = cliente_excluir;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return contrato_visualizar
	 */
	public Boolean getContrato_visualizar() {
		return contrato_visualizar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param contrato_visualizar
	 */
	public void setContrato_visualizar(Boolean contrato_visualizar) {
		this.contrato_visualizar = contrato_visualizar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return contrato_gravar
	 */
	public Boolean getContrato_gravar() {
		return contrato_gravar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param contrato_gravar
	 */
	public void setContrato_gravar(Boolean contrato_gravar) {
		this.contrato_gravar = contrato_gravar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return contrato_excluir
	 */
	public Boolean getContrato_excluir() {
		return contrato_excluir;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param contrato_excluir
	 */
	public void setContrato_excluir(Boolean contrato_excluir) {
		this.contrato_excluir = contrato_excluir;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return tabela_visualizar
	 */
	public Boolean getTabela_visualizar() {
		return tabela_visualizar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param tabela_visualizar
	 */
	public void setTabela_visualizar(Boolean tabela_visualizar) {
		this.tabela_visualizar = tabela_visualizar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return tabela_excluir
	 */
	public Boolean getTabela_excluir() {
		return tabela_excluir;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param tabela_excluir
	 */
	public void setTabela_excluir(Boolean tabela_excluir) {
		this.tabela_excluir = tabela_excluir;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return caixa_visualizar
	 */
	public Boolean getCaixa_visualizar() {
		return caixa_visualizar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param caixa_visualizar
	 */
	public void setCaixa_visualizar(Boolean caixa_visualizar) {
		this.caixa_visualizar = caixa_visualizar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return caixa_gravar
	 */
	public Boolean getCaixa_gravar() {
		return caixa_gravar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param caixa_gravar
	 */
	public void setCaixa_gravar(Boolean caixa_gravar) {
		this.caixa_gravar = caixa_gravar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return caixa_excluir
	 */
	public Boolean getCaixa_excluir() {
		return caixa_excluir;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param caixa_excluir
	 */
	public void setCaixa_excluir(Boolean caixa_excluir) {
		this.caixa_excluir = caixa_excluir;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return relatorio
	 */
	public Boolean getRelatorio() {
		return relatorio;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param relatorio
	 */
	public void setRelatorio(Boolean relatorio) {
		this.relatorio = relatorio;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return comissao
	 */
	public Boolean getComissao() {
		return comissao;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param comissao
	 */
	public void setComissao(Boolean comissao) {
		this.comissao = comissao;
	}
}
