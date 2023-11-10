package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_veiculo")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVeiculo;
	private boolean chassiAlongado;
	
	@ManyToOne
	@JoinColumn(name = "id_marca")
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_veiculo")
	private TipoVeiculo tipoVeiculo;
	
	@ManyToOne
	@JoinColumn(name = "id_modelo")
	private Modelo modelo;
	
	public Veiculo() {
		
	}

	public Veiculo(Long idVeiculo, Marca marca, TipoVeiculo tipoVeiculo, Modelo modelo, boolean chassiAlongado) {
		this.idVeiculo = idVeiculo;
		this.marca = marca;
		this.tipoVeiculo = tipoVeiculo;
		this.modelo = modelo;
		this.chassiAlongado = chassiAlongado;
	}

	public Long getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(Long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public boolean isChassiAlongado() {
		return chassiAlongado;
	}

	public void setChassiAlongado(boolean chassiAlongado) {
		this.chassiAlongado = chassiAlongado;
	}
}

