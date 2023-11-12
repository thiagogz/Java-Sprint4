package com.challenge.sprint.controllers;

import com.challenge.sprint.entities.Marca;
import com.challenge.sprint.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    private final MarcaService marcaService;

    @Autowired
    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @GetMapping
    public List<Marca> getAllMarcas() {
        return marcaService.getAllMarcas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Marca> getMarcaById(@PathVariable Long id) {
        Marca marca = marcaService.findMarcaById(id)
            .orElseThrow(() -> new RuntimeException("Marca não encontrada"));
        return ResponseEntity.ok(marca);
    }

    @PostMapping
    public ResponseEntity<Marca> createMarca(@RequestBody Marca marca) {
        Marca novaMarca = marcaService.saveMarca(marca);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaMarca);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Marca> updateMarca(@PathVariable Long id, @RequestBody Marca marca) {
        Marca marcaAtualizada = marcaService.updateMarca(id, marca);
        return ResponseEntity.ok(marcaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMarca(@PathVariable Long id) {
        marcaService.deleteMarca(id);
        return ResponseEntity.noContent().build();
    }
}
