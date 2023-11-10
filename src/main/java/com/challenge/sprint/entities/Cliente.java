package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	private String nomeCliente;
	private String senhaCliente;
	private String enderecoCliente;
	private Long telefoneCliente;
	private String tipoCliente;
	private String cpfCnpjCliente;
	
	public Cliente() {
		
	}

	public Cliente(Long idCliente, String nomeCliente, String senhaCliente, String enderecoCliente, Long telefoneCliente, String tipoCliente, String cpfCnpjCliente) {
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.senhaCliente = senhaCliente;
		this.enderecoCliente = enderecoCliente;
		this.telefoneCliente = telefoneCliente;
		this.tipoCliente = tipoCliente;
		this.cpfCnpjCliente = cpfCnpjCliente;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public Long getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(Long telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getCpfCnpjCliente() {
		return cpfCnpjCliente;
	}

	public void setCpfCnpjCliente(String cpfCnpjCliente) {
		this.cpfCnpjCliente = cpfCnpjCliente;
	}
}
