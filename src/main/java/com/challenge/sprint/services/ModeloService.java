package com.challenge.sprint.services;

import com.challenge.sprint.entities.Modelo;
import com.challenge.sprint.repositories.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModeloService {

    private final ModeloRepository modeloRepository;

    @Autowired
    public ModeloService(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    public List<Modelo> getAllModelos() {
        return modeloRepository.findAll();
    }

    public Optional<Modelo> findModeloById(Long id) {
        return modeloRepository.findById(id);
    }

    public Modelo saveModelo(Modelo modelo) {
        return modeloRepository.save(modelo);
    }

    public void deleteModelo(Long id) {
        modeloRepository.deleteById(id);
    }

    public Modelo updateModelo(Long id, Modelo modeloDetails) {
        Modelo modelo = modeloRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Modelo não encontrado"));

        modelo.setModeloVeiculo(modeloDetails.getModeloVeiculo());
        modelo.setAnoModelo(modeloDetails.getAnoModelo());
        modelo.setComprimentoVeiculo(modeloDetails.getComprimentoVeiculo());
        modelo.setAlturaVeiculo(modeloDetails.getAlturaVeiculo());
        modelo.setEixoVeiculo(modeloDetails.getEixoVeiculo());
        modelo.setPesoVeiculo(modeloDetails.getPesoVeiculo());
        // outros campos conforme necessário

        return modeloRepository.save(modelo);
    }
}
