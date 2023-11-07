package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFuncionario;
	private String nomeFuncionario;
	private Long telefoneFuncionario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(Long idFuncionario, String nomeFuncionario, Long telefoneFuncionario) {
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.telefoneFuncionario = telefoneFuncionario;
	}

	public Long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Long getTelefoneFuncionario() {
		return telefoneFuncionario;
	}

	public void setTelefoneFuncionario(Long telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}
	
	
}