package com.challenge.sprint.controllers;

import com.challenge.sprint.entities.Modal;
import com.challenge.sprint.services.ModalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modais")
public class ModalController {

    private final ModalService modalService;

    @Autowired
    public ModalController(ModalService modalService) {
        this.modalService = modalService;
    }

    @GetMapping
    public List<Modal> getAllModais() {
        return modalService.getAllModals();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Modal> getModalById(@PathVariable Long id) {
        Modal modal = modalService.findModalById(id)
            .orElseThrow(() -> new RuntimeException("Modal não encontrado"));
        return ResponseEntity.ok(modal);
    }

    @PostMapping
    public ResponseEntity<Modal> createModal(@RequestBody Modal modal) {
        Modal novoModal = modalService.saveModal(modal);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoModal);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Modal> updateModal(@PathVariable Long id, @RequestBody Modal modal) {
        Modal modalAtualizado = modalService.updateModal(id, modal);
        return ResponseEntity.ok(modalAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModal(@PathVariable Long id) {
        modalService.deleteModal(id);
        return ResponseEntity.noContent().build();
    }
}
