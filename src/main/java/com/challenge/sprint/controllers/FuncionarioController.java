package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Funcionario;
import com.challenge.sprint.repositories.FuncionarioRepository;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {
	@Autowired 
	private FuncionarioRepository repository;
	
	@GetMapping
	public List<Funcionario> findAll() {
		List<Funcionario> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Funcionario findById (@PathVariable Long id) {
		Funcionario result = repository.findById(id).get();
		return result;
	}
}