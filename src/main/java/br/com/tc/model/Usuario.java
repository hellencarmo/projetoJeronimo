package br.com.tc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Junior on 25/05/17.
 */
@Entity
public class Usuario extends Master {
	
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
	
	public Usuario() {
		super();
	}
	
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
	
	public Integer getId_usuario() {
		return id_usuario;
	}
	
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	public String getNome_usuario() {
		return nome_usuario;
	}
	
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Boolean getCliente_visualizar() {
		return cliente_visualizar;
	}
	
	public void setCliente_visualizar(Boolean cliente_visualizar) {
		this.cliente_visualizar = cliente_visualizar;
	}
	
	public Boolean getCliente_gravar() {
		return cliente_gravar;
	}
	
	public void setCliente_gravar(Boolean cliente_gravar) {
		this.cliente_gravar = cliente_gravar;
	}
	
	public Boolean getCliente_excluir() {
		return cliente_excluir;
	}
	
	public void setCliente_excluir(Boolean cliente_excluir) {
		this.cliente_excluir = cliente_excluir;
	}
	
	public Boolean getContrato_visualizar() {
		return contrato_visualizar;
	}
	
	public void setContrato_visualizar(Boolean contrato_visualizar) {
		this.contrato_visualizar = contrato_visualizar;
	}
	
	public Boolean getContrato_gravar() {
		return contrato_gravar;
	}
	
	public void setContrato_gravar(Boolean contrato_gravar) {
		this.contrato_gravar = contrato_gravar;
	}
	
	public Boolean getContrato_excluir() {
		return contrato_excluir;
	}
	
	public void setContrato_excluir(Boolean contrato_excluir) {
		this.contrato_excluir = contrato_excluir;
	}
	
	public Boolean getTabela_visualizar() {
		return tabela_visualizar;
	}
	
	public void setTabela_visualizar(Boolean tabela_visualizar) {
		this.tabela_visualizar = tabela_visualizar;
	}
	
	public Boolean getTabela_excluir() {
		return tabela_excluir;
	}
	
	public void setTabela_excluir(Boolean tabela_excluir) {
		this.tabela_excluir = tabela_excluir;
	}
	
	public Boolean getCaixa_visualizar() {
		return caixa_visualizar;
	}
	
	public void setCaixa_visualizar(Boolean caixa_visualizar) {
		this.caixa_visualizar = caixa_visualizar;
	}
	
	public Boolean getCaixa_gravar() {
		return caixa_gravar;
	}
	
	public void setCaixa_gravar(Boolean caixa_gravar) {
		this.caixa_gravar = caixa_gravar;
	}
	
	public Boolean getCaixa_excluir() {
		return caixa_excluir;
	}
	
	public void setCaixa_excluir(Boolean caixa_excluir) {
		this.caixa_excluir = caixa_excluir;
	}
	
	public Boolean getRelatorio() {
		return relatorio;
	}
	
	public void setRelatorio(Boolean relatorio) {
		this.relatorio = relatorio;
	}
	
	public Boolean getComissao() {
		return comissao;
	}
	
	public void setComissao(Boolean comissao) {
		this.comissao = comissao;
	}
}
