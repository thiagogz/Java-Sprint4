package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.EmpresaFuncionario;
import com.challenge.sprint.repositories.EmpresaFuncionarioRepository;

@RestController
@RequestMapping(value = "/empresa-funcionarios")
public class EmpresaFuncionarioController {
	@Autowired 
	private EmpresaFuncionarioRepository repository;
	
	@GetMapping
	public List<EmpresaFuncionario> findAll() {
		List<EmpresaFuncionario> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public EmpresaFuncionario findById (@PathVariable Long id) {
		EmpresaFuncionario result = repository.findById(id).get();
		return result;
	}
}
