package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_servico")
public class Servico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idServico;
	private String horaServico;
	private String localUsuario;
	private String statusOrdem;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_prestador_modal")
	private PrestadorModal prestadorModal;
	
	public Servico() {
		
	}
	
	public Servico(Long idServico, Cliente cliente, PrestadorModal prestadorModal, String horaServico, String localUsuario,
			String statusOrdem) {
		this.idServico = idServico;
		this.cliente = cliente;
		this.prestadorModal = prestadorModal;
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
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public PrestadorModal getPrestadorModal() {
		return prestadorModal;
	}

	public void setPrestadorModal(PrestadorModal prestadorModal) {
		this.prestadorModal = prestadorModal;
	}
	
	public String getHoraServico() {
		return horaServico;
	}
	
	public void setHoraServico(String horaServico) {
		this.horaServico = horaServico;
	}
	
	public String getLocalUsuario() {
		return localUsuario;
	}
	
	public void setLocalUsuario(String localUsuario) {
		this.localUsuario = localUsuario;
	}
	
	public String getStatusOrdem() {
		return statusOrdem;
	}
	
	public void setStatusOrdem(String statusOrdem) {
		this.statusOrdem = statusOrdem;
	}
}
