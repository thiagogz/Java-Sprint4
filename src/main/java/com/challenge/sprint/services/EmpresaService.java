package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.Empresa;
import com.challenge.sprint.repositories.EmpresaRepository;

@Service
public class EmpresaService {
	private final EmpresaRepository empresaRepository;
	
	@Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

	public List<Empresa> getAllEmpresa() {
		return empresaRepository.findAll();
	}
	
	public Empresa findEmpresaById (@PathVariable Long id) {
		Empresa result = empresaRepository.findById(id).get();
		return result;
	}
}