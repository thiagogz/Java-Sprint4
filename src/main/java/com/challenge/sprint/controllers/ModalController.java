package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Modal;
import com.challenge.sprint.repositories.ModalRepository;

@RestController
@RequestMapping(value = "/modais")
public class ModalController {
	@Autowired 
	private ModalRepository repository;
	
	@GetMapping
	public List<Modal> findAll() {
		List<Modal> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Modal findById (@PathVariable Long id) {
		Modal result = repository.findById(id).get();
		return result;
	}
}