package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Funcionario;
import com.challenge.sprint.services.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {
	private final FuncionarioService funcionarioService;
	
	@Autowired
	public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }
	
	@GetMapping
	public ResponseEntity<List<Funcionario>> findAll() {
		List<Funcionario> funcionarios = funcionarioService.getAllFuncionario();
		return ResponseEntity.ok(funcionarios);
	}
	
	@GetMapping(value = "/{id}")
	public Funcionario findFuncionarioById (@PathVariable Long id) {
		Funcionario result = funcionarioService.findFuncionarioById(id);
		return result;
	}
}