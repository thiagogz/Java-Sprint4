package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Prestador;
import com.challenge.sprint.repositories.PrestadorRepository;

@RestController
@RequestMapping(value = "/prestadores")
public class PrestadorController {
	@Autowired 
	private PrestadorRepository repository;
	
	@GetMapping
	public List<Prestador> findAll() {
		List<Prestador> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Prestador findById (@PathVariable Long id) {
		Prestador result = repository.findById(id).get();
		return result;
	}
}