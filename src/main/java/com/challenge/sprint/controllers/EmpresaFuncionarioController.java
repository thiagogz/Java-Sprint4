package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.EmpresaFuncionario;
import com.challenge.sprint.services.EmpresaFuncionarioService;

@RestController
@RequestMapping(value = "/empresa-funcionarios")
public class EmpresaFuncionarioController {
	private final EmpresaFuncionarioService empresaFuncionarioService;
	
	@Autowired
	public EmpresaFuncionarioController(EmpresaFuncionarioService empresaFuncionarioService) {
        this.empresaFuncionarioService = empresaFuncionarioService;
    }
	
	@GetMapping
	public ResponseEntity<List<EmpresaFuncionario>> findAll() {
		List<EmpresaFuncionario> empresaFuncionario = empresaFuncionarioService.getAllEmpresaFuncionario();
		return ResponseEntity.ok(empresaFuncionario);
	}
	
	@GetMapping(value = "/{id}")
	public EmpresaFuncionario findEmpresaFuncionarioById (@PathVariable Long id) {
		EmpresaFuncionario result = empresaFuncionarioService.findEmpresaFuncionarioById(id);
		return result;
	}
}
