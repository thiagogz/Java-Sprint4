package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmpresa;
	private String nomeEmpresa;
	private Long telefoneEmpresa;
	
	public Empresa() {
		
	}
	
	public Empresa(Long idEmpresa, String nomeEmpresa, Long telefoneEmpresa) {
		this.idEmpresa = idEmpresa;
		this.nomeEmpresa = nomeEmpresa;
		this.telefoneEmpresa = telefoneEmpresa;
	}
	
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public Long getTelefoneEmpresa() {
		return telefoneEmpresa;
	}
	
	public void setTelefoneEmpresa(Long telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}
}
