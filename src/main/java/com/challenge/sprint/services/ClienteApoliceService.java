package com.challenge.sprint.services;

import com.challenge.sprint.entities.ClienteApolice;
import com.challenge.sprint.repositories.ClienteApoliceRepository;
import com.challenge.sprint.repositories.ClienteRepository;
import com.challenge.sprint.repositories.ApoliceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteApoliceService {

    private final ClienteApoliceRepository clienteApoliceRepository;
    private final ClienteRepository clienteRepository;
    private final ApoliceRepository apoliceRepository;

    @Autowired
    public ClienteApoliceService(ClienteApoliceRepository clienteApoliceRepository,
                                 ClienteRepository clienteRepository,
                                 ApoliceRepository apoliceRepository) {
        this.clienteApoliceRepository = clienteApoliceRepository;
        this.clienteRepository = clienteRepository;
        this.apoliceRepository = apoliceRepository;
    }

    public List<ClienteApolice> getAllClienteApolices() {
        return clienteApoliceRepository.findAll();
    }

    public Optional<ClienteApolice> findClienteApoliceById(Long id) {
        return clienteApoliceRepository.findById(id);
    }

    public ClienteApolice saveClienteApolice(ClienteApolice clienteApolice) {
        validateForeignKeyEntities(clienteApolice);
        return clienteApoliceRepository.save(clienteApolice);
    }

    public void deleteClienteApolice(Long id) {
        if (!clienteApoliceRepository.existsById(id)) {
            throw new RuntimeException("Cliente Apolice não encontrado para exclusão");
        }
        clienteApoliceRepository.deleteById(id);
    }

    private void validateForeignKeyEntities(ClienteApolice clienteApolice) {
        if (clienteApolice.getCliente() != null && !clienteRepository.existsById(clienteApolice.getCliente().getIdCliente())) {
            throw new RuntimeException("Cliente associado não encontrado");
        }
        if (clienteApolice.getApolice() != null && !apoliceRepository.existsById(clienteApolice.getApolice().getIdApolice())) {
            throw new RuntimeException("Apolice associada não encontrada");
        }
    }
}
