package com.challenge.sprint.controllers;

import com.challenge.sprint.entities.Servico;
import com.challenge.sprint.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    private final ServicoService servicoService;

    @Autowired
    public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }

    @GetMapping
    public List<Servico> getAllServicos() {
        return servicoService.getAllServicos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servico> getServicoById(@PathVariable Long id) {
        Servico servico = servicoService.findServicoById(id)
            .orElseThrow(() -> new RuntimeException("Serviço não encontrado"));
        return ResponseEntity.ok(servico);
    }

    @PostMapping
    public ResponseEntity<Servico> createServico(@RequestBody Servico servico) {
        Servico novoServico = servicoService.saveServico(servico);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoServico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Servico> updateServico(@PathVariable Long id, @RequestBody Servico servico) {
        Servico servicoAtualizado = servicoService.updateServico(id, servico);
        return ResponseEntity.ok(servicoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServico(@PathVariable Long id) {
        servicoService.deleteServico(id);
        return ResponseEntity.noContent().build();
    }
}
