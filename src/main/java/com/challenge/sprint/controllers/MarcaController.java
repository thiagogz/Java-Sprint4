package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Marca;
import com.challenge.sprint.services.MarcaService;

@RestController
@RequestMapping(value = "/marcas")
public class MarcaController {
	private final MarcaService marcaService;
	
	@Autowired
	public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }
	
	@GetMapping
	public ResponseEntity<List<Marca>> findAll() {
		List<Marca> marcas = marcaService.getAllMarca();
		return ResponseEntity.ok(marcas);
	}
	
	@GetMapping(value = "/{id}")
	public Marca findMarcaById (@PathVariable Long id) {
		Marca result = marcaService.findMarcaById(id);
		return result;
	}
}