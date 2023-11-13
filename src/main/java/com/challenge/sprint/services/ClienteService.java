package com.challenge.sprint.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

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
	
	public Cliente findClienteById(@PathVariable Long id) {
        Optional<Cliente> result = clienteRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("Cliente não encontrado com o ID: " + id);
        }
    }
	
	public ResponseEntity<Cliente> saveCliente(Cliente cliente) {
        Cliente clienteCriado = clienteRepository.save(cliente);
		return new ResponseEntity<>(clienteCriado, HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deleteCliente(Long id) {
    	if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return ResponseEntity.noContent().build(); // Retorna 204 NO CONTENT
        } else {
            return ResponseEntity.notFound().build(); // Retorna 404 NOT FOUND
        }
    }
    
    public ResponseEntity<Cliente> updateCliente(Long id, Cliente clienteDetails) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);

        if (clienteOptional.isPresent()) {
            Cliente clienteExistente = clienteOptional.get();
            
            // Atualiza os campos do clienteExistente com os valores de clienteDetails
            clienteExistente.setNomeCliente(clienteDetails.getNomeCliente());
            clienteExistente.setSenhaCliente(clienteDetails.getSenhaCliente());
            clienteExistente.setEnderecoCliente(clienteDetails.getEnderecoCliente());
            clienteExistente.setTelefoneCliente(clienteDetails.getTelefoneCliente());
            clienteExistente.setTipoCliente(clienteDetails.getTipoCliente());
            clienteExistente.setCpfCnpjCliente(clienteDetails.getCpfCnpjCliente());
            // ... outros campos conforme necessário

            Cliente updatedCliente = clienteRepository.save(clienteExistente);
            return new ResponseEntity<>(updatedCliente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
