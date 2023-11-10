package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Veiculo;
import com.challenge.sprint.services.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoController {
	private final VeiculoService veiculoService;
	
	@Autowired
	public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }
	
	@GetMapping
	public ResponseEntity<List<Veiculo>> findAll() {
		List<Veiculo> veiculos = veiculoService.getAllVeiculo();
		return ResponseEntity.ok(veiculos);
	}
	
	@GetMapping(value = "/{id}")
	public Veiculo findVeiculoById (@PathVariable Long id) {
		Veiculo result = veiculoService.findVeiculoById(id);
		return result;
	}
}