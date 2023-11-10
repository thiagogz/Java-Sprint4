package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.ClienteApolice;
import com.challenge.sprint.repositories.ClienteApoliceRepository;

@RestController
@RequestMapping(value = "/cliente-apolices")
public class ClienteApoliceController {
	@Autowired 
	private ClienteApoliceRepository repository;
	
	@GetMapping
	public List<ClienteApolice> findAll() {
		List<ClienteApolice> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public ClienteApolice findById (@PathVariable Long id) {
		ClienteApolice result = repository.findById(id).get();
		return result;
	}
}
