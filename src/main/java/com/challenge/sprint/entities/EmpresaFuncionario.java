package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_empresa_funcionario")
public class EmpresaFuncionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmpresaFuncionario;
	
	@ManyToOne
	@JoinColumn(name = "id_empresa")
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name = "id_funcionario")
	private Funcionario funcionario;
	
	public EmpresaFuncionario() {
		
	}
	
	public EmpresaFuncionario(Long idEmpresaFuncionario, Empresa empresa, Funcionario funcionario) {
		super();
		this.idEmpresaFuncionario = idEmpresaFuncionario;
		this.empresa = empresa;
		this.funcionario = funcionario;
	}

	public Long getIdEmpresaFuncionario() {
		return idEmpresaFuncionario;
	}
	
	public void setIdEmpresaFuncionario(Long idEmpresaFuncionario) {
		this.idEmpresaFuncionario = idEmpresaFuncionario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
