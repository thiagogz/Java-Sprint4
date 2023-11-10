package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Apolice;
import com.challenge.sprint.repositories.ApoliceRepository;

@RestController
@RequestMapping(value = "/apolices")
public class ApoliceController {
	@Autowired 
	private ApoliceRepository repository;
	
	@GetMapping
	public List<Apolice> findAll() {
		List<Apolice> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Apolice findById (@PathVariable Long id) {
		Apolice result = repository.findById(id).get();
		return result;
	}
}