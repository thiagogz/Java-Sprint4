package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Marca;
import com.challenge.sprint.repositories.MarcaRepository;

@RestController
@RequestMapping(value = "/marcas")
public class MarcaController {
	@Autowired 
	private MarcaRepository repository;
	
	@GetMapping
	public List<Marca> findAll() {
		List<Marca> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Marca findById (@PathVariable Long id) {
		Marca result = repository.findById(id).get();
		return result;
	}
}