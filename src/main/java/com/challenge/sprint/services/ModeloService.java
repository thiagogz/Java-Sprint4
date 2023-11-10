package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.Modelo;
import com.challenge.sprint.repositories.ModeloRepository;

@Service
public class ModeloService {
	private final ModeloRepository modeloRepository;
	
	@Autowired
    public ModeloService(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

	public List<Modelo> getAllModelo() {
		return modeloRepository.findAll();
	}
	
	public Modelo findModeloById (@PathVariable Long id) {
		Modelo result = modeloRepository.findById(id).get();
		return result;
	}
}
