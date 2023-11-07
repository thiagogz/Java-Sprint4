package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_tipo_veiculo")
public class TipoVeiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoVeiculo;
	private String tipoVeiculo;
	
	public TipoVeiculo() {
		
	}

	public TipoVeiculo(Long idTipoVeiculo, String tipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
		this.tipoVeiculo = tipoVeiculo;
	}

	public Long getIdTipoVeiculo() {
		return idTipoVeiculo;
	}

	public void setIdTipoVeiculo(Long idTipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
}
