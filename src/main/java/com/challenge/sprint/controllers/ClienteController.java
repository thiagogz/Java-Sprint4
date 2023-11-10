package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Cliente;
import com.challenge.sprint.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	private final ClienteService clienteService;
	
	@Autowired
	public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		List<Cliente> clientes = clienteService.getAllCliente();
		return ResponseEntity.ok(clientes);
	}
	
	@GetMapping(value = "/{id}")
	public Cliente findClienteById (@PathVariable Long id) {
		Cliente result = clienteService.findClienteById(id);
		return result;
	}
}
