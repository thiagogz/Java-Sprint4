package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Servico;
import com.challenge.sprint.repositories.ServicoRepository;

@RestController
@RequestMapping(value = "/servicos")
public class ServicoController {
	@Autowired 
	private ServicoRepository repository;
	
	@GetMapping
	public List<Servico> findAll() {
		List<Servico> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Servico findById (@PathVariable Long id) {
		Servico result = repository.findById(id).get();
		return result;
	}
}