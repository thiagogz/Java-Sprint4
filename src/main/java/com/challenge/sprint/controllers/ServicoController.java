package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Servico;
import com.challenge.sprint.services.ServicoService;

@RestController
@RequestMapping(value = "/servicos")
public class ServicoController {
	private final ServicoService servicoService;
	
	@Autowired
	public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }
	
	@GetMapping
	public ResponseEntity<List<Servico>> findAll() {
		List<Servico> servicos = servicoService.getAllServico();
		return ResponseEntity.ok(servicos);
	}
	
	@GetMapping(value = "/{id}")
	public Servico findServicoById (@PathVariable Long id) {
		Servico result = servicoService.findServicoById(id);
		return result;
	}
}