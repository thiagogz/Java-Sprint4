package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.Apolice;
import com.challenge.sprint.repositories.ApoliceRepository;

@Service
public class ApoliceService {
	private final ApoliceRepository apoliceRepository;
	
	@Autowired
    public ApoliceService(ApoliceRepository apoliceRepository) {
        this.apoliceRepository = apoliceRepository;
    }

	public List<Apolice> getAllApolice() {
		return apoliceRepository.findAll();
	}
	
	public Apolice findApoliceById (@PathVariable Long id) {
		Apolice result = apoliceRepository.findById(id).get();
		return result;
	}
}