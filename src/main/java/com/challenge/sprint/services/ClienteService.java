package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.Cliente;
import com.challenge.sprint.repositories.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	@Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
	}
	
	public Cliente findClienteById (@PathVariable Long id) {
		Cliente result = clienteRepository.findById(id).get();
		return result;
	}
}
