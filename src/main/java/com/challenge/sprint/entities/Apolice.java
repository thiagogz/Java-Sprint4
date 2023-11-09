package com.challenge.sprint.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_apolice")
public class Apolice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idApolice;
	private String statusApolice;
	private double valorApolice;
	private Date vigenciaApolice;
	private String placaVeiculo;
	
	@ManyToOne
	@JoinColumn(name = "id_veiculo")
	private Veiculo veiculo;
	
	public Apolice() {
		
	}
	
	public Apolice(Long idApolice, Veiculo veiculo, String statusApolice, double valorApolice, Date vigenciaApolice, String placaVeiculo) {
		this.idApolice = idApolice;
		this.veiculo = veiculo;
		this.statusApolice = statusApolice;
		this.valorApolice = valorApolice;
		this.vigenciaApolice = vigenciaApolice;
		this.placaVeiculo = placaVeiculo;
	}

	public Long getIdApolice() {
		return idApolice;
	}

	public void setIdApolice(Long idApolice) {
		this.idApolice = idApolice;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getStatusApolice() {
		return statusApolice;
	}

	public void setStatusApolice(String statusApolice) {
		this.statusApolice = statusApolice;
	}

	public double getValorApolice() {
		return valorApolice;
	}

	public void setValorApolice(double valorApolice) {
		this.valorApolice = valorApolice;
	}

	public Date getVigenciaApolice() {
		return vigenciaApolice;
	}

	public void setVigenciaApolice(Date vigenciaApolice) {
		this.vigenciaApolice = vigenciaApolice;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	
}
