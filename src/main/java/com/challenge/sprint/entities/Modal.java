package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_modal")
public class Modal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idModal;
	private String categoriaModal;
	private String tipoModal;
	private double limiteAltura;
	private double limiteComprimento;
	private Long limitePeso;
	private double limiteLargura;
	
	public Modal() {
		
	}
	
	public Modal(Long idModal, String categoriaModal, String tipoModal, double limiteAltura, double limiteComprimento,
			Long limitePeso, double limiteLargura) {
		this.idModal = idModal;
		this.categoriaModal = categoriaModal;
		this.tipoModal = tipoModal;
		this.limiteAltura = limiteAltura;
		this.limiteComprimento = limiteComprimento;
		this.limitePeso = limitePeso;
		this.limiteLargura = limiteLargura;
	}

	public Long getIdModal() {
		return idModal;
	}

	public void setIdModal(Long idModal) {
		this.idModal = idModal;
	}

	public String getCategoriaModal() {
		return categoriaModal;
	}

	public void setCategoriaModal(String categoriaModal) {
		this.categoriaModal = categoriaModal;
	}

	public String getTipoModal() {
		return tipoModal;
	}

	public void setTipoModal(String tipoModal) {
		this.tipoModal = tipoModal;
	}

	public double getLimiteAltura() {
		return limiteAltura;
	}

	public void setLimiteAltura(double limiteAltura) {
		this.limiteAltura = limiteAltura;
	}

	public double getLimiteComprimento() {
		return limiteComprimento;
	}

	public void setLimiteComprimento(double limiteComprimento) {
		this.limiteComprimento = limiteComprimento;
	}

	public Long getLimitePeso() {
		return limitePeso;
	}

	public void setLimitePeso(Long limitePeso) {
		this.limitePeso = limitePeso;
	}

	public double getLimiteLargura() {
		return limiteLargura;
	}

	public void setLimiteLargura(double limiteLargura) {
		this.limiteLargura = limiteLargura;
	}
}


