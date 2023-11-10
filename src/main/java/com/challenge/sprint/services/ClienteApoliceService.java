package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.ClienteApolice;
import com.challenge.sprint.repositories.ClienteApoliceRepository;

@Service
public class ClienteApoliceService {
	private final ClienteApoliceRepository clienteApoliceRepository;
	
	@Autowired
    public ClienteApoliceService(ClienteApoliceRepository clienteApoliceRepository) {
        this.clienteApoliceRepository = clienteApoliceRepository;
    }

	public List<ClienteApolice> getAllClienteApolice() {
		return clienteApoliceRepository.findAll();
	}
	
	public ClienteApolice findClienteApoliceById (@PathVariable Long id) {
		ClienteApolice result = clienteApoliceRepository.findById(id).get();
		return result;
	}
}
