package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.PrestadorModal;
import com.challenge.sprint.repositories.PrestadorModalRepository;

@Service
public class PrestadorModalService {
	private final PrestadorModalRepository prestadorModalRepository;
	
	@Autowired
    public PrestadorModalService(PrestadorModalRepository prestadorModalRepository) {
        this.prestadorModalRepository = prestadorModalRepository;
    }

	public List<PrestadorModal> getAllPrestadorModal() {
		return prestadorModalRepository.findAll();
	}
	
	public PrestadorModal findPrestadorModalById (@PathVariable Long id) {
		PrestadorModal result = prestadorModalRepository.findById(id).get();
		return result;
	}
}
