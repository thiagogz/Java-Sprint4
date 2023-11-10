package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.TipoVeiculo;
import com.challenge.sprint.repositories.TipoVeiculoRepository;

@RestController
@RequestMapping(value = "/tipos-veiculos")
public class TipoVeiculoController {
	@Autowired 
	private TipoVeiculoRepository repository;
	
	@GetMapping
	public List<TipoVeiculo> findAll() {
		List<TipoVeiculo> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public TipoVeiculo findById (@PathVariable Long id) {
		TipoVeiculo result = repository.findById(id).get();
		return result;
	}
}