package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_prestador_modal")
public class PrestadorModal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrestadorModal;
	private Long idPrestador;
	private Long idModal;
	private String placaGuincho;
	
	public PrestadorModal() {
		
	}
	
	public PrestadorModal(Long idPrestadorModal, Long idPrestador, Long idModal, String placaGuincho) {
		this.idPrestadorModal = idPrestadorModal;
		this.idPrestador = idPrestador;
		this.idModal = idModal;
		this.placaGuincho = placaGuincho;
	}
	
	public Long getIdPrestadorModal() {
		return idPrestadorModal;
	}
	
	public void setIdPrestadorModal(Long idPrestadorModal) {
		this.idPrestadorModal = idPrestadorModal;
	}
	
	public Long getIdPrestador() {
		return idPrestador;
	}
	
	public void setIdPrestador(Long idPrestador) {
		this.idPrestador = idPrestador;
	}
	
	public Long getIdModal() {
		return idModal;
	}
	
	public void setIdModal(Long idModal) {
		this.idModal = idModal;
	}
	
	public String getPlacaGuincho() {
		return placaGuincho;
	}
	
	public void setPlacaGuincho(String placaGuincho) {
		this.placaGuincho = placaGuincho;
	}
}



