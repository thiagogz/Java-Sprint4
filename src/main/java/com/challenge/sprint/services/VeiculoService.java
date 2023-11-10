package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.Veiculo;
import com.challenge.sprint.repositories.VeiculoRepository;

@Service
public class VeiculoService {
	private final VeiculoRepository veiculoRepository;
	
	@Autowired
    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

	public List<Veiculo> getAllVeiculo() {
		return veiculoRepository.findAll();
	}
	
	public Veiculo findVeiculoById (@PathVariable Long id) {
		Veiculo result = veiculoRepository.findById(id).get();
		return result;
	}
}