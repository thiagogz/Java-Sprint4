package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.Modal;
import com.challenge.sprint.repositories.ModalRepository;

@Service
public class ModalService {
	private final ModalRepository modalRepository;
	
	@Autowired
    public ModalService(ModalRepository modalRepository) {
        this.modalRepository = modalRepository;
    }

	public List<Modal> getAllModal() {
		return modalRepository.findAll();
	}
	
	public Modal findModalById (@PathVariable Long id) {
		Modal result = modalRepository.findById(id).get();
		return result;
	}
}
