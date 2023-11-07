package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_veiculo")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVeiculo;
	private Long idMarca;
	private Long idTipoVeiculo;
	private Long idModelo;
	private boolean chassiAlongado;
	
	public Veiculo() {
		
	}
	
	public Veiculo(Long idVeiculo, Long idMarca, Long idTipoVeiculo, Long idModelo, boolean chassiAlongado) {
		this.idVeiculo = idVeiculo;
		this.idMarca = idMarca;
		this.idTipoVeiculo = idTipoVeiculo;
		this.idModelo = idModelo;
		this.chassiAlongado = chassiAlongado;
	}

	public Long getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(Long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public Long getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Long idMarca) {
		this.idMarca = idMarca;
	}

	public Long getIdTipoVeiculo() {
		return idTipoVeiculo;
	}

	public void setIdTipoVeiculo(Long idTipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
	}

	public Long getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(Long idModelo) {
		this.idModelo = idModelo;
	}

	public boolean isChassiAlongado() {
		return chassiAlongado;
	}

	public void setChassiAlongado(boolean chassiAlongado) {
		this.chassiAlongado = chassiAlongado;
	}
}

