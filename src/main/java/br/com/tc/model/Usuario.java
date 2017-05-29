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
	
	@Column(nullable = false, length = 50)
	private String nome_usuario;
	
	@Column(nullable = false, length = 50)
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
	private Boolean financeira_visualizar;
	
	@Column(nullable = false)
	private Boolean financeira_gravar;
	
	@Column(nullable = false)
	private Boolean financeira_excluir;
	
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
	 * @since 28/05/2017
	 * @throws Exception
	 */
	@Override
	public void setDefault() throws Exception {
		notNull("senha", senha, "1234");
		notNull("cliente_visualizar", cliente_visualizar, false);
		notNull("cliente_gravar", cliente_gravar, false);
		notNull("cliente_excluir", cliente_excluir, false);
		notNull("contrato_visualizar", contrato_visualizar, false);
		notNull("contrato_gravar", contrato_gravar, false);
		notNull("contrato_excluir", contrato_excluir, false);
		notNull("financeira_visualizar", financeira_visualizar, false);
		notNull("financeira_gravar", financeira_gravar, false);
		notNull("financeira_excluir", financeira_excluir, false);
		notNull("caixa_visualizar", caixa_visualizar, false);
		notNull("caixa_gravar", caixa_gravar, false);
		notNull("caixa_excluir", caixa_excluir, false);
		notNull("relatorio", relatorio, false);
		notNull("comissao", comissao, false);
		super.setDefault();
	}
	
	/**
	 * @return v value
	 * @author Jeronimo
	 * @since 28/05/2017
	 */
	@Override
	public <V> V id() {
		return (V) id_usuario;
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
	 * @return financeira_visualizar
	 */
	public Boolean getFinanceira_visualizar() {
		return financeira_visualizar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param financeira_visualizar
	 */
	public void setFinanceira_visualizar(Boolean financeira_visualizar) {
		this.financeira_visualizar = financeira_visualizar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return financeira_gravar
	 */
	public Boolean getFinanceira_gravar() {
		return financeira_gravar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param financeira_gravar
	 */
	public void setFinanceira_gravar(Boolean financeira_gravar) {
		this.financeira_gravar = financeira_gravar;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return financeira_excluir
	 */
	public Boolean getFinanceira_excluir() {
		return financeira_excluir;
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param financeira_excluir
	 */
	public void setFinanceira_excluir(Boolean financeira_excluir) {
		this.financeira_excluir = financeira_excluir;
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
