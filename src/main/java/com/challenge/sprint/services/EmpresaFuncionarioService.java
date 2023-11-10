package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.EmpresaFuncionario;
import com.challenge.sprint.repositories.EmpresaFuncionarioRepository;

@Service
public class EmpresaFuncionarioService {
	private final EmpresaFuncionarioRepository empresaFuncionarioRepository;
	
	@Autowired
    public EmpresaFuncionarioService(EmpresaFuncionarioRepository empresaFuncionarioRepository) {
        this.empresaFuncionarioRepository = empresaFuncionarioRepository;
    }

	public List<EmpresaFuncionario> getAllEmpresaFuncionario() {
		return empresaFuncionarioRepository.findAll();
	}
	
	public EmpresaFuncionario findEmpresaFuncionarioById (@PathVariable Long id) {
		EmpresaFuncionario result = empresaFuncionarioRepository.findById(id).get();
		return result;
	}
}