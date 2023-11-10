package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.Marca;
import com.challenge.sprint.repositories.MarcaRepository;

@Service
public class MarcaService {
	private final MarcaRepository marcaRepository;
	
	@Autowired
    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

	public List<Marca> getAllMarca() {
		return marcaRepository.findAll();
	}
	
	public Marca findMarcaById (@PathVariable Long id) {
		Marca result = marcaRepository.findById(id).get();
		return result;
	}
}
