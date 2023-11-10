package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_cliente_apolice")
public class ClienteApolice {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClienteApolice;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_apolice")
	private Apolice apolice;
	
	public ClienteApolice() {
		
	}

	public ClienteApolice(Long idClienteApolice, Cliente cliente, Apolice apolice) {
		this.idClienteApolice = idClienteApolice;
		this.cliente = cliente;
		this.apolice = apolice;
	}

	public Long getIdClienteApolice() {
		return idClienteApolice;
	}

	public void setIdClienteApolice(Long idClienteApolice) {
		this.idClienteApolice = idClienteApolice;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Apolice getApolice() {
		return apolice;
	}

	public void setApolice(Apolice apolice) {
		this.apolice = apolice;
	}
	
	
}
