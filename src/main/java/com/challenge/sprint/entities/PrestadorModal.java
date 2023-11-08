package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_prestador_modal")
public class PrestadorModal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrestadorModal;
	private String placaGuincho;
	
	@ManyToOne
	@JoinColumn(name = "id_prestador")
	private Prestador prestador;
	
	@ManyToOne
	@JoinColumn(name = "id_modal")
	private Modal modal;
	
	public PrestadorModal() {
		
	}

	public PrestadorModal(Long idPrestadorModal, Prestador prestador, Modal modal, String placaGuincho) {
		this.idPrestadorModal = idPrestadorModal;
		this.prestador = prestador;
		this.modal = modal;
		this.placaGuincho = placaGuincho;
	}
	
	public Long getIdPrestadorModal() {
		return idPrestadorModal;
	}
	
	public void setIdPrestadorModal(Long idPrestadorModal) {
		this.idPrestadorModal = idPrestadorModal;
	}
	
	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}

	public Modal getModal() {
		return modal;
	}

	public void setModal(Modal modal) {
		this.modal = modal;
	}

	public String getPlacaGuincho() {
		return placaGuincho;
	}
	
	public void setPlacaGuincho(String placaGuincho) {
		this.placaGuincho = placaGuincho;
	}
}



