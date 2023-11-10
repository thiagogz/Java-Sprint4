package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Cliente;
import com.challenge.sprint.repositories.ClienteRepository;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	@Autowired 
	private ClienteRepository repository;
	
	@GetMapping
	public List<Cliente> findAll() {
		List<Cliente> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Cliente findById (@PathVariable Long id) {
		Cliente result = repository.findById(id).get();
		return result;
	}
}
