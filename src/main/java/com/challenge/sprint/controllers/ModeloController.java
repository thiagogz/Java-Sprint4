package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Modelo;
import com.challenge.sprint.repositories.ModeloRepository;

@RestController
@RequestMapping(value = "/modelos")
public class ModeloController {
	@Autowired 
	private ModeloRepository repository;
	
	@GetMapping
	public List<Modelo> findAll() {
		List<Modelo> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Modelo findById (@PathVariable Long id) {
		Modelo result = repository.findById(id).get();
		return result;
	}
}