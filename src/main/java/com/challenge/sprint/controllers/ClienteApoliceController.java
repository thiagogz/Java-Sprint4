package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.ClienteApolice;
import com.challenge.sprint.services.ClienteApoliceService;

@RestController
@RequestMapping(value = "/cliente-apolices")
public class ClienteApoliceController {
	@Autowired 
	private ClienteApoliceService clienteApoliceService;
	
	@GetMapping
	public ResponseEntity<List<ClienteApolice>> findAll() {
		List<ClienteApolice> clienteApolices = clienteApoliceService.getAllClienteApolice();
		return ResponseEntity.ok(clienteApolices);
	}
	
	@GetMapping(value = "/{id}")
	public ClienteApolice findClienteApoliceById (@PathVariable Long id) {
		ClienteApolice result = clienteApoliceService.findClienteApoliceById(id);
		return result;
	}
}
