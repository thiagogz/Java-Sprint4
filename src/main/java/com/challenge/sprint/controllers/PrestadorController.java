package com.challenge.sprint.controllers;

import com.challenge.sprint.entities.Prestador;
import com.challenge.sprint.services.PrestadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestadores")
public class PrestadorController {

    private final PrestadorService prestadorService;

    @Autowired
    public PrestadorController(PrestadorService prestadorService) {
        this.prestadorService = prestadorService;
    }

    @GetMapping
    public List<Prestador> getAllPrestadores() {
        return prestadorService.getAllPrestadores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prestador> getPrestadorById(@PathVariable Long id) {
        Prestador prestador = prestadorService.findPrestadorById(id)
            .orElseThrow(() -> new RuntimeException("Prestador não encontrado"));
        return ResponseEntity.ok(prestador);
    }

    @PostMapping
    public ResponseEntity<Prestador> createPrestador(@RequestBody Prestador prestador) {
        Prestador novoPrestador = prestadorService.savePrestador(prestador);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPrestador);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prestador> updatePrestador(@PathVariable Long id, @RequestBody Prestador prestador) {
        Prestador prestadorAtualizado = prestadorService.updatePrestador(id, prestador);
        return ResponseEntity.ok(prestadorAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrestador(@PathVariable Long id) {
        prestadorService.deletePrestador(id);
        return ResponseEntity.noContent().build();
    }
}
