package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Apolice;
import com.challenge.sprint.services.ApoliceService;

@RestController
@RequestMapping(value = "/apolices")
public class ApoliceController {
	private final ApoliceService apoliceService;
	
	@Autowired
	public ApoliceController(ApoliceService apoliceService) {
        this.apoliceService = apoliceService;
    }
	
	@GetMapping
	public ResponseEntity<List<Apolice>> findAll() {
		List<Apolice> apolices = apoliceService.getAllApolice();
		return ResponseEntity.ok(apolices);
	}
	
	@GetMapping(value = "/{id}")
	public Apolice findApoliceById (@PathVariable Long id) {
		Apolice result = apoliceService.findApoliceById(id);
		return result;
	}
}