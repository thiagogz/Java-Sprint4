package com.challenge.sprint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.sprint.entities.Modal;
import com.challenge.sprint.services.ModalService;

@RestController
@RequestMapping(value = "/modais")
public class ModalController {
	private final ModalService modalService;
	
	@Autowired
	public ModalController(ModalService modalService) {
        this.modalService = modalService;
    }
	
	@GetMapping
	public ResponseEntity<List<Modal>> findAll() {
		List<Modal> modais = modalService.getAllModal();
		return ResponseEntity.ok(modais);
	}
	
	@GetMapping(value = "/{id}")
	public Modal findModalById (@PathVariable Long id) {
		Modal result = modalService.findModalById(id);
		return result;
	}
}