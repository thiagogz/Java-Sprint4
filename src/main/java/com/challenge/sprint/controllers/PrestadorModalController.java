package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.PrestadorModal;
import com.challenge.sprint.services.PrestadorModalService;

@RestController
@RequestMapping(value = "/prestador-modais")
public class PrestadorModalController {
	private final PrestadorModalService prestadorModalService;
	
	@Autowired
	public PrestadorModalController(PrestadorModalService prestadorModalService) {
        this.prestadorModalService = prestadorModalService;
    }
	
	@GetMapping
	public ResponseEntity<List<PrestadorModal>> findAll() {
		List<PrestadorModal> prestadoresModais = prestadorModalService.getAllPrestadorModal();
		return ResponseEntity.ok(prestadoresModais);
	}
	
	@GetMapping(value = "/{id}")
	public PrestadorModal findPrestadorModalById (@PathVariable Long id) {
		PrestadorModal result = prestadorModalService.findPrestadorModalById(id);
		return result;
	}
}