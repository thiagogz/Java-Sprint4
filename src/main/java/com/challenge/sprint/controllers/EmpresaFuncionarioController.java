package com.challenge.sprint.controllers;

import com.challenge.sprint.entities.EmpresaFuncionario;
import com.challenge.sprint.services.EmpresaFuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa-funcionarios")
public class EmpresaFuncionarioController {

    private final EmpresaFuncionarioService empresaFuncionarioService;

    @Autowired
    public EmpresaFuncionarioController(EmpresaFuncionarioService empresaFuncionarioService) {
        this.empresaFuncionarioService = empresaFuncionarioService;
    }

    @GetMapping
    public List<EmpresaFuncionario> getAllEmpresaFuncionarios() {
        return empresaFuncionarioService.getAllEmpresaFuncionarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpresaFuncionario> getEmpresaFuncionarioById(@PathVariable Long id) {
        EmpresaFuncionario empresaFuncionario = empresaFuncionarioService.findEmpresaFuncionarioById(id)
            .orElseThrow(() -> new RuntimeException("Associação Empresa-Funcionário não encontrada"));
        return ResponseEntity.ok(empresaFuncionario);
    }

    @PostMapping
    public ResponseEntity<EmpresaFuncionario> createEmpresaFuncionario(@RequestBody EmpresaFuncionario empresaFuncionario) {
        EmpresaFuncionario novoEmpresaFuncionario = empresaFuncionarioService.saveEmpresaFuncionario(empresaFuncionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoEmpresaFuncionario);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<EmpresaFuncionario> updateEmpresaFuncionario(@PathVariable Long id, @RequestBody EmpresaFuncionario empresaFuncionario) {
//        EmpresaFuncionario empresaFuncionarioAtualizado = empresaFuncionarioService.updateEmpresaFuncionario(id, empresaFuncionario);
//        return ResponseEntity.ok(empresaFuncionarioAtualizado);
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpresaFuncionario(@PathVariable Long id) {
        empresaFuncionarioService.deleteEmpresaFuncionario(id);
        return ResponseEntity.noContent().build();
    }
}