package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Veiculo;
import com.challenge.sprint.repositories.VeiculoRepository;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoController {
	@Autowired 
	private VeiculoRepository repository;
	
	@GetMapping
	public List<Veiculo> findAll() {
		List<Veiculo> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Veiculo findById (@PathVariable Long id) {
		Veiculo result = repository.findById(id).get();
		return result;
	}
}