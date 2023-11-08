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
	private boolean status;
	private double valor;
	private Date vigencia;
	private String placa;
	
	@ManyToOne
	@JoinColumn(name = "id_veiculo")
	private Veiculo veiculo;
	
	public Apolice() {
		
	}
	
	public Apolice(Long idApolice, Veiculo veiculo, boolean status, double valor, Date vigencia, String placa) {
		this.idApolice = idApolice;
		this.veiculo = veiculo;
		this.status = status;
		this.valor = valor;
		this.vigencia = vigencia;
		this.placa = placa;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getVigencia() {
		return vigencia;
	}

	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
}
