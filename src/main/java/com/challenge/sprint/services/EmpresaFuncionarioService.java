package com.challenge.sprint.services;

import com.challenge.sprint.entities.EmpresaFuncionario;
import com.challenge.sprint.repositories.EmpresaFuncionarioRepository;
import com.challenge.sprint.repositories.EmpresaRepository;
import com.challenge.sprint.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaFuncionarioService {

    private final EmpresaFuncionarioRepository empresaFuncionarioRepository;
    private final EmpresaRepository empresaRepository;
    private final FuncionarioRepository funcionarioRepository;

    @Autowired
    public EmpresaFuncionarioService(EmpresaFuncionarioRepository empresaFuncionarioRepository, 
                                     EmpresaRepository empresaRepository,
                                     FuncionarioRepository funcionarioRepository) {
        this.empresaFuncionarioRepository = empresaFuncionarioRepository;
        this.empresaRepository = empresaRepository;
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<EmpresaFuncionario> getAllEmpresaFuncionarios() {
        return empresaFuncionarioRepository.findAll();
    }

    public Optional<EmpresaFuncionario> findEmpresaFuncionarioById(Long id) {
        return empresaFuncionarioRepository.findById(id);
    }

    public EmpresaFuncionario saveEmpresaFuncionario(EmpresaFuncionario empresaFuncionario) {
        validateForeignKeyEntities(empresaFuncionario);
        return empresaFuncionarioRepository.save(empresaFuncionario);
    }

    public void deleteEmpresaFuncionario(Long id) {
        if (!empresaFuncionarioRepository.existsById(id)) {
            throw new RuntimeException("Associação Empresa-Funcionário não encontrada para exclusão");
        }
        empresaFuncionarioRepository.deleteById(id);
    }
    
    private void validateForeignKeyEntities(EmpresaFuncionario empresaFuncionario) {
        if (empresaFuncionario.getEmpresa() != null && !empresaRepository.existsById(empresaFuncionario.getEmpresa().getIdEmpresa())) {
            throw new RuntimeException("Empresa associada não encontrada");
        }
        if (empresaFuncionario.getFuncionario() != null && !funcionarioRepository.existsById(empresaFuncionario.getFuncionario().getIdFuncionario())) {
            throw new RuntimeException("Funcionário associado não encontrado");
        }
    }
}
