package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_empresa_funcionario")
public class EmpresaFuncionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmpresaFuncionario;
	private Long idEmpresa;
	private Long idFuncionario;
	
	public EmpresaFuncionario() {
		
	}
	
	public EmpresaFuncionario(Long idEmpresaFuncionario, Long idEmpresa, Long idFuncionario) {
		this.idEmpresaFuncionario = idEmpresaFuncionario;
		this.idEmpresa = idEmpresa;
		this.idFuncionario = idFuncionario;
	}
	
	public Long getIdEmpresaFuncionario() {
		return idEmpresaFuncionario;
	}
	
	public void setIdEmpresaFuncionario(Long idEmpresaFuncionario) {
		this.idEmpresaFuncionario = idEmpresaFuncionario;
	}
	
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
	public Long getIdFuncionario() {
		return idFuncionario;
	}
	
	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
}
