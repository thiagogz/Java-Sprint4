package com.challenge.sprint.controllers;

import com.challenge.sprint.entities.PrestadorModal;
import com.challenge.sprint.services.PrestadorModalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestador-modais")
public class PrestadorModalController {

    private final PrestadorModalService prestadorModalService;

    @Autowired
    public PrestadorModalController(PrestadorModalService prestadorModalService) {
        this.prestadorModalService = prestadorModalService;
    }

    @GetMapping
    public List<PrestadorModal> getAllPrestadorModais() {
        return prestadorModalService.getAllPrestadorModais();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrestadorModal> getPrestadorModalById(@PathVariable Long id) {
        PrestadorModal prestadorModal = prestadorModalService.findPrestadorModalById(id)
            .orElseThrow(() -> new RuntimeException("Prestador Modal não encontrado"));
        return ResponseEntity.ok(prestadorModal);
    }

    @PostMapping
    public ResponseEntity<PrestadorModal> createPrestadorModal(@RequestBody PrestadorModal prestadorModal) {
        PrestadorModal novoPrestadorModal = prestadorModalService.savePrestadorModal(prestadorModal);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPrestadorModal);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PrestadorModal> updatePrestadorModal(@PathVariable Long id, @RequestBody PrestadorModal prestadorModal) {
        PrestadorModal prestadorModalAtualizado = prestadorModalService.updatePrestadorModal(id, prestadorModal);
        return ResponseEntity.ok(prestadorModalAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrestadorModal(@PathVariable Long id) {
        prestadorModalService.deletePrestadorModal(id);
        return ResponseEntity.noContent().build();
    }
}
