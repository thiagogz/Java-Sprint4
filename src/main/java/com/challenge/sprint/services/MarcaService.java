package com.challenge.sprint.services;

import com.challenge.sprint.entities.Marca;
import com.challenge.sprint.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    private final MarcaRepository marcaRepository;

    @Autowired
    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public List<Marca> getAllMarcas() {
        return marcaRepository.findAll();
    }

    public Optional<Marca> findMarcaById(Long id) {
        return marcaRepository.findById(id);
    }

    public Marca saveMarca(Marca marca) {
        return marcaRepository.save(marca);
    }

    public void deleteMarca(Long id) {
        marcaRepository.deleteById(id);
    }

    public Marca updateMarca(Long id, Marca marcaDetails) {
        Marca marca = marcaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Marca não encontrada"));

        marca.setMarcaVeiculo(marcaDetails.getMarcaVeiculo());
        // outros campos conforme necessário

        return marcaRepository.save(marca);
    }
}
