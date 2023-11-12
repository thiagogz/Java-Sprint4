package com.challenge.sprint.controllers;

import com.challenge.sprint.entities.Modelo;
import com.challenge.sprint.services.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modelos")
public class ModeloController {

    private final ModeloService modeloService;

    @Autowired
    public ModeloController(ModeloService modeloService) {
        this.modeloService = modeloService;
    }

    @GetMapping
    public List<Modelo> getAllModelos() {
        return modeloService.getAllModelos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Modelo> getModeloById(@PathVariable Long id) {
        Modelo modelo = modeloService.findModeloById(id)
            .orElseThrow(() -> new RuntimeException("Modelo não encontrado"));
        return ResponseEntity.ok(modelo);
    }

    @PostMapping
    public ResponseEntity<Modelo> createModelo(@RequestBody Modelo modelo) {
        Modelo novoModelo = modeloService.saveModelo(modelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoModelo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Modelo> updateModelo(@PathVariable Long id, @RequestBody Modelo modelo) {
        Modelo modeloAtualizado = modeloService.updateModelo(id, modelo);
        return ResponseEntity.ok(modeloAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModelo(@PathVariable Long id) {
        modeloService.deleteModelo(id);
        return ResponseEntity.noContent().build();
    }
}
