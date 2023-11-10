package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.TipoVeiculo;
import com.challenge.sprint.services.TipoVeiculoService;

@RestController
@RequestMapping(value = "/tipos-veiculos")
public class TipoVeiculoController {
	private final TipoVeiculoService tipoVeiculoService;
	
	@Autowired
	public TipoVeiculoController(TipoVeiculoService tipoVeiculoService) {
        this.tipoVeiculoService = tipoVeiculoService;
    }
	
	@GetMapping
	public ResponseEntity<List<TipoVeiculo>> findAll() {
		List<TipoVeiculo> tiposVeiculos = tipoVeiculoService.getAllTipoVeiculo();
		return ResponseEntity.ok(tiposVeiculos);
	}
	
	@GetMapping(value = "/{id}")
	public TipoVeiculo findTipoVeiculoById (@PathVariable Long id) {
		TipoVeiculo result = tipoVeiculoService.findTipoVeiculoById(id);
		return result;
	}
}