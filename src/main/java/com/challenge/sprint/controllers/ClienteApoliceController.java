package com.challenge.sprint.controllers;

import com.challenge.sprint.entities.ClienteApolice;
import com.challenge.sprint.services.ClienteApoliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente-apolices")
public class ClienteApoliceController {

    private final ClienteApoliceService clienteApoliceService;

    @Autowired
    public ClienteApoliceController(ClienteApoliceService clienteApoliceService) {
        this.clienteApoliceService = clienteApoliceService;
    }

    @GetMapping
    public List<ClienteApolice> getAllClienteApolices() {
        return clienteApoliceService.getAllClienteApolices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteApolice> getClienteApoliceById(@PathVariable Long id) {
        ClienteApolice clienteApolice = clienteApoliceService.findClienteApoliceById(id)
            .orElseThrow(() -> new RuntimeException("Cliente Apolice não encontrado"));
        return ResponseEntity.ok(clienteApolice);
    }

    @PostMapping
    public ResponseEntity<ClienteApolice> createClienteApolice(@RequestBody ClienteApolice clienteApolice) {
        ClienteApolice novoClienteApolice = clienteApoliceService.saveClienteApolice(clienteApolice);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoClienteApolice);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClienteApolice(@PathVariable Long id) {
        clienteApoliceService.deleteClienteApolice(id);
        return ResponseEntity.noContent().build();
    }
}
