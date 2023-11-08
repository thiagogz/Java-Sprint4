package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_cliente_apolice")
public class ClienteApolice {	
	@ManyToMany
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@ManyToMany
	@JoinColumn(name = "id_apolice")
	private Apolice apolice;
	
	public ClienteApolice() {
		
	}

	public ClienteApolice(Cliente cliente, Apolice apolice) {
		this.cliente = cliente;
		this.apolice = apolice;
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
