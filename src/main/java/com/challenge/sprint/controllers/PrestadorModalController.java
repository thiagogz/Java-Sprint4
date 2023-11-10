package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.PrestadorModal;
import com.challenge.sprint.repositories.PrestadorModalRepository;

@RestController
@RequestMapping(value = "/prestador-modais")
public class PrestadorModalController {
	@Autowired 
	private PrestadorModalRepository repository;
	
	@GetMapping
	public List<PrestadorModal> findAll() {
		List<PrestadorModal> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public PrestadorModal findById (@PathVariable Long id) {
		PrestadorModal result = repository.findById(id).get();
		return result;
	}
}