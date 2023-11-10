package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Empresa;
import com.challenge.sprint.services.EmpresaService;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaController {
	private final EmpresaService empresaService;
	
	@Autowired
	public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }
	
	@GetMapping
	public ResponseEntity<List<Empresa>> findAll() {
		List<Empresa> empresas = empresaService.getAllEmpresa();
		return ResponseEntity.ok(empresas);
	}
	
	@GetMapping(value = "/{id}")
	public Empresa findEmpresaById (@PathVariable Long id) {
		Empresa result = empresaService.findEmpresaById(id);
		return result;
	}
}