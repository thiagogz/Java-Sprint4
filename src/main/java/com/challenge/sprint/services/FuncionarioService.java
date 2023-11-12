package com.challenge.sprint.services;

import com.challenge.sprint.entities.Funcionario;
import com.challenge.sprint.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> findFuncionarioById(Long id) {
        return funcionarioRepository.findById(id);
    }

    public Funcionario saveFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public void deleteFuncionario(Long id) {
        funcionarioRepository.deleteById(id);
    }

    public Funcionario updateFuncionario(Long id, Funcionario funcionarioDetails) {
        Funcionario funcionario = funcionarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));

        funcionario.setNomeFuncionario(funcionarioDetails.getNomeFuncionario());
        funcionario.setTelefoneFuncionario(funcionarioDetails.getTelefoneFuncionario());
        // outros campos conforme necessário

        return funcionarioRepository.save(funcionario);
    }
}
