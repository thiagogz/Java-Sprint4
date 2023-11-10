package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.Funcionario;
import com.challenge.sprint.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;
	
	@Autowired
    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

	public List<Funcionario> getAllFuncionario() {
		return funcionarioRepository.findAll();
	}
	
	public Funcionario findFuncionarioById (@PathVariable Long id) {
		Funcionario result = funcionarioRepository.findById(id).get();
		return result;
	}
}
