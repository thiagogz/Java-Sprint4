package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.TipoVeiculo;
import com.challenge.sprint.repositories.TipoVeiculoRepository;

@Service
public class TipoVeiculoService {
	private final TipoVeiculoRepository tipoVeiculoRepository;
	
	@Autowired
    public TipoVeiculoService(TipoVeiculoRepository tipoVeiculoRepository) {
        this.tipoVeiculoRepository = tipoVeiculoRepository;
    }

	public List<TipoVeiculo> getAllTipoVeiculo() {
		return tipoVeiculoRepository.findAll();
	}
	
	public TipoVeiculo findTipoVeiculoById (@PathVariable Long id) {
		TipoVeiculo result = tipoVeiculoRepository.findById(id).get();
		return result;
	}
}