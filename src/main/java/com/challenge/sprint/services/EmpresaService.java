package com.challenge.sprint.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.sprint.entities.Empresa;
import com.challenge.sprint.repositories.EmpresaRepository;

@Service
public class EmpresaService {
	private final EmpresaRepository empresaRepository;
	
	@Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

	public List<Empresa> getAllEmpresas() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> findEmpresaById(Long id) {
        return empresaRepository.findById(id);
    }

    public Empresa saveEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public void deleteEmpresa(Long id) {
        empresaRepository.deleteById(id);
    }

    public Empresa updateEmpresa(Long id, Empresa empresaDetails) {
        Empresa empresa = empresaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
        
        empresa.setNomeEmpresa(empresaDetails.getNomeEmpresa());
        empresa.setTelefoneEmpresa(empresaDetails.getTelefoneEmpresa());
        // outros campos conforme necessário
        
        return empresaRepository.save(empresa);
    }
}