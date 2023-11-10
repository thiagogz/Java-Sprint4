package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Empresa;
import com.challenge.sprint.repositories.EmpresaRepository;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaController {
	@Autowired 
	private EmpresaRepository repository;
	
	@GetMapping
	public List<Empresa> findAll() {
		List<Empresa> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Empresa findById (@PathVariable Long id) {
		Empresa result = repository.findById(id).get();
		return result;
	}
}