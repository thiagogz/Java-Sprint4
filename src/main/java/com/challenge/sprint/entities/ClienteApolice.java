package com.challenge.sprint.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hl_cliente_apolice")
public class ClienteApolice {
	
	private Long idCliente;
	private Long idApolice;
	
	public ClienteApolice() {
		
	}
	
	public ClienteApolice(Long idCliente, Long idApolice) {
		this.idCliente = idCliente;
		this.idApolice = idApolice;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdApolice() {
		return idApolice;
	}

	public void setIdApolice(Long idApolice) {
		this.idApolice = idApolice;
	}
	
	
}
