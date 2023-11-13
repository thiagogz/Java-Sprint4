package com.challenge.sprint.services;

import com.challenge.sprint.entities.Prestador;
import com.challenge.sprint.repositories.PrestadorRepository;
import com.challenge.sprint.repositories.EmpresaFuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestadorService {

    private final PrestadorRepository prestadorRepository;
    private final EmpresaFuncionarioRepository empresaFuncionarioRepository;

    @Autowired
    public PrestadorService(PrestadorRepository prestadorRepository,
                            EmpresaFuncionarioRepository empresaFuncionarioRepository) {
        this.prestadorRepository = prestadorRepository;
        this.empresaFuncionarioRepository = empresaFuncionarioRepository;
    }

    public List<Prestador> getAllPrestadores() {
        return prestadorRepository.findAll();
    }

    public Optional<Prestador> findPrestadorById(Long id) {
        return prestadorRepository.findById(id);
    }

    public Prestador savePrestador(Prestador prestador) {
        validateForeignKeyEntity(prestador);
        return prestadorRepository.save(prestador);
    }

    public void deletePrestador(Long id) {
        if (!prestadorRepository.existsById(id)) {
            throw new RuntimeException("Prestador não encontrado para exclusão");
        }
        prestadorRepository.deleteById(id);
    }

    public Prestador updatePrestador(Long id, Prestador prestadorDetails) {
        Prestador prestador = prestadorRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Prestador não encontrado"));
        
        validateForeignKeyEntity(prestadorDetails);
        prestador.setLocalPrestador(prestadorDetails.getLocalPrestador());

        return prestadorRepository.save(prestador);
    }

    private void validateForeignKeyEntity(Prestador prestador) {
        if (prestador.getIdEmpresaFuncionario() != null && 
            !empresaFuncionarioRepository.existsById(prestador.getIdEmpresaFuncionario().getIdEmpresaFuncionario())) {
            throw new RuntimeException("Associação Empresa-Funcionário não encontrada");
        }
    }
}
