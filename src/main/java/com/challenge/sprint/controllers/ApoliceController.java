package com.challenge.sprint.controllers;

import com.challenge.sprint.entities.Apolice;
import com.challenge.sprint.services.ApoliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/apolices")
public class ApoliceController {

    private final ApoliceService apoliceService;

    @Autowired
    public ApoliceController(ApoliceService apoliceService) {
        this.apoliceService = apoliceService;
    }

    @GetMapping
    public List<Apolice> getAllApolices() {
        return apoliceService.getAllApolices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Apolice> getApoliceById(@PathVariable Long id) {
        Apolice apolice = apoliceService.findApoliceById(id)
            .orElseThrow(() -> new RuntimeException("Apolice não encontrada"));
        return ResponseEntity.ok(apolice);
    }

    @PostMapping
    public ResponseEntity<Apolice> createApolice(@RequestBody Apolice apolice) {
        Apolice novaApolice = apoliceService.saveApolice(apolice);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaApolice);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Apolice> updateApolice(@PathVariable Long id, @RequestBody Apolice apolice) {
        Apolice apoliceAtualizada = apoliceService.updateApolice(id, apolice);
        return ResponseEntity.ok(apoliceAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApolice(@PathVariable Long id) {
        Optional<Apolice> apolice = apoliceService.findApoliceById(id);
        if (apolice.isPresent()) {
            apoliceService.deleteApolice(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
