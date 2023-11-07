package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_modelo")
public class Modelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idModelo;
	private String modeloVeiculo;
	private int anoModelo;
	private double comprimentoVeiculo;
	private double alturaVeiculo;
	private int eixoVeiculo;
	private int pesoVeiculo;
	
	public Modelo() {
		
	}
	
	public Modelo(Long idModelo, String modeloVeiculo, int anoModelo, double comprimentoVeiculo, double alturaVeiculo,
			int eixoVeiculo, int pesoVeiculo) {
		this.idModelo = idModelo;
		this.modeloVeiculo = modeloVeiculo;
		this.anoModelo = anoModelo;
		this.comprimentoVeiculo = comprimentoVeiculo;
		this.alturaVeiculo = alturaVeiculo;
		this.eixoVeiculo = eixoVeiculo;
		this.pesoVeiculo = pesoVeiculo;
	}

	public Long getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(Long idModelo) {
		this.idModelo = idModelo;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public double getComprimentoVeiculo() {
		return comprimentoVeiculo;
	}

	public void setComprimentoVeiculo(double comprimentoVeiculo) {
		this.comprimentoVeiculo = comprimentoVeiculo;
	}

	public double getAlturaVeiculo() {
		return alturaVeiculo;
	}

	public void setAlturaVeiculo(double alturaVeiculo) {
		this.alturaVeiculo = alturaVeiculo;
	}

	public int getEixoVeiculo() {
		return eixoVeiculo;
	}

	public void setEixoVeiculo(int eixoVeiculo) {
		this.eixoVeiculo = eixoVeiculo;
	}

	public int getPesoVeiculo() {
		return pesoVeiculo;
	}

	public void setPesoVeiculo(int pesoVeiculo) {
		this.pesoVeiculo = pesoVeiculo;
	}
}

