package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Modelo;
import com.challenge.sprint.services.ModeloService;

@RestController
@RequestMapping(value = "/modelos")
public class ModeloController {
	private final ModeloService modeloService;
	
	@Autowired
	public ModeloController(ModeloService modeloService) {
        this.modeloService = modeloService;
    }
	
	@GetMapping
	public ResponseEntity<List<Modelo>> findAll() {
		List<Modelo> modelos = modeloService.getAllModelo();
		return ResponseEntity.ok(modelos);
	}
	
	@GetMapping(value = "/{id}")
	public Modelo findModeloById (@PathVariable Long id) {
		Modelo result = modeloService.findModeloById(id);
		return result;
	}
}