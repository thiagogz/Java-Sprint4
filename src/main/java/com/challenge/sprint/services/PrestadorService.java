package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.Prestador;
import com.challenge.sprint.repositories.PrestadorRepository;

@Service
public class PrestadorService {
	private final PrestadorRepository prestadorRepository;
	
	@Autowired
    public PrestadorService(PrestadorRepository prestadorRepository) {
        this.prestadorRepository = prestadorRepository;
    }

	public List<Prestador> getAllPrestador() {
		return prestadorRepository.findAll();
	}
	
	public Prestador findPrestadorById (@PathVariable Long id) {
		Prestador result = prestadorRepository.findById(id).get();
		return result;
	}
}
