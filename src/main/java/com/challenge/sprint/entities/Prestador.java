package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_prestador")
public class Prestador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrestador;
	private String localPrestador;
	
	@ManyToOne
	@JoinColumn(name = "id_empresa_funcionario")
	private EmpresaFuncionario idEmpresaFuncionario;
	
	public Prestador() {
		
	}
	
	public Prestador(Long idPrestador, EmpresaFuncionario idEmpresaFuncionario, String localPrestador) {
		this.idPrestador = idPrestador;
		this.idEmpresaFuncionario = idEmpresaFuncionario;
		this.localPrestador = localPrestador;
	}
	
	public Long getIdPrestador() {
		return idPrestador;
	}
	
	public void setIdPrestador(Long idPrestador) {
		this.idPrestador = idPrestador;
	}
	
	public EmpresaFuncionario getIdEmpresaFuncionario() {
		return idEmpresaFuncionario;
	}

	public void setidEmpresaFuncionario(EmpresaFuncionario idEmpresaFuncionario) {
		this.idEmpresaFuncionario = idEmpresaFuncionario;
	}

	public String getLocalPrestador() {
		return localPrestador;
	}
	
	public void setLocalPrestador(String localPrestador) {
		this.localPrestador = localPrestador;
	}
}
