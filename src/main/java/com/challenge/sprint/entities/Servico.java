package com.challenge.sprint.entities;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_servico")
public class Servico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idServico;
	private Long idCliente;
	private Long idPrestadorModal;
	private Timestamp horaServico;
	private String localUsuario;
	private boolean statusOrdem;
	
	public Servico() {
		
	}
	
	public Servico(Long idServico, Long idCliente, Long idPrestadorModal, Timestamp horaServico, String localUsuario,
			boolean statusOrdem) {
		this.idServico = idServico;
		this.idCliente = idCliente;
		this.idPrestadorModal = idPrestadorModal;
		this.horaServico = horaServico;
		this.localUsuario = localUsuario;
		this.statusOrdem = statusOrdem;
	}
	
	public Long getIdServico() {
		return idServico;
	}
	
	public void setIdServico(Long idServico) {
		this.idServico = idServico;
	}
	
	public Long getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	
	public Long getIdPrestadorModal() {
		return idPrestadorModal;
	}
	
	public void setIdPrestadorModal(Long idPrestadorModal) {
		this.idPrestadorModal = idPrestadorModal;
	}
	
	public Timestamp getHoraServico() {
		return horaServico;
	}
	
	public void setHoraServico(Timestamp horaServico) {
		this.horaServico = horaServico;
	}
	
	public String getLocalUsuario() {
		return localUsuario;
	}
	
	public void setLocalUsuario(String localUsuario) {
		this.localUsuario = localUsuario;
	}
	
	public boolean isStatusOrdem() {
		return statusOrdem;
	}
	
	public void setStatusOrdem(boolean statusOrdem) {
		this.statusOrdem = statusOrdem;
	}
}
