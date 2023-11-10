package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Prestador;
import com.challenge.sprint.services.PrestadorService;
@RestController
@RequestMapping(value = "/prestadores")
public class PrestadorController {
	private final PrestadorService prestadorService;
	
	@Autowired
	public PrestadorController(PrestadorService prestadorService) {
        this.prestadorService = prestadorService;
    }
	
	@GetMapping
	public ResponseEntity<List<Prestador>> findAll() {
		List<Prestador> prestadores = prestadorService.getAllPrestador();
		return ResponseEntity.ok(prestadores);
	}
	
	@GetMapping(value = "/{id}")
	public Prestador findPrestadorById (@PathVariable Long id) {
		Prestador result = prestadorService.findPrestadorById(id);
		return result;
	}
}