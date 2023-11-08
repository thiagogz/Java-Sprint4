package com.challenge.sprint.entities;

import java.sql.Timestamp;

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
	private Timestamp horaServico;
	private String localUsuario;
	private boolean statusOrdem;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_prestador_modal")
	private PrestadorModal pm;
	
	public Servico() {
		
	}
	
	public Servico(Long idServico, Cliente cliente, PrestadorModal pm, Timestamp horaServico, String localUsuario,
			boolean statusOrdem) {
		this.idServico = idServico;
		this.cliente = cliente;
		this.pm = pm;
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

	public PrestadorModal getPm() {
		return pm;
	}

	public void setPm(PrestadorModal pm) {
		this.pm = pm;
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
