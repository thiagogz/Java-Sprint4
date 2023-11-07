package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_marca")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMarca;
	private String marcaVeiculo;
	
	public Marca() {
		
	}
	
	public Marca(Long idMarca, String marcaVeiculo) {
		this.idMarca = idMarca;
		this.marcaVeiculo = marcaVeiculo;
	}
	
	public Long getIdMarca() {
		return idMarca;
	}
	
	public void setIdMarca(Long idMarca) {
		this.idMarca = idMarca;
	}
	
	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}
	
	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}
}
