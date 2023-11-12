package com.challenge.sprint.controllers;

import com.challenge.sprint.entities.TipoVeiculo;
import com.challenge.sprint.services.TipoVeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipos-veiculos")
public class TipoVeiculoController {

    private final TipoVeiculoService tipoVeiculoService;

    @Autowired
    public TipoVeiculoController(TipoVeiculoService tipoVeiculoService) {
        this.tipoVeiculoService = tipoVeiculoService;
    }

    @GetMapping
    public List<TipoVeiculo> getAllTipoVeiculos() {
        return tipoVeiculoService.getAllTipoVeiculos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoVeiculo> getTipoVeiculoById(@PathVariable Long id) {
        TipoVeiculo tipoVeiculo = tipoVeiculoService.findTipoVeiculoById(id)
            .orElseThrow(() -> new RuntimeException("Tipo de Veículo não encontrado"));
        return ResponseEntity.ok(tipoVeiculo);
    }

    @PostMapping
    public ResponseEntity<TipoVeiculo> createTipoVeiculo(@RequestBody TipoVeiculo tipoVeiculo) {
        TipoVeiculo novoTipoVeiculo = tipoVeiculoService.saveTipoVeiculo(tipoVeiculo);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoTipoVeiculo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoVeiculo> updateTipoVeiculo(@PathVariable Long id, @RequestBody TipoVeiculo tipoVeiculo) {
        TipoVeiculo tipoVeiculoAtualizado = tipoVeiculoService.updateTipoVeiculo(id, tipoVeiculo);
        return ResponseEntity.ok(tipoVeiculoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTipoVeiculo(@PathVariable Long id) {
        tipoVeiculoService.deleteTipoVeiculo(id);
        return ResponseEntity.noContent().build();
    }
}
