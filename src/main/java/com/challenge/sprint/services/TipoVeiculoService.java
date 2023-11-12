package com.challenge.sprint.services;

import com.challenge.sprint.entities.TipoVeiculo;
import com.challenge.sprint.repositories.TipoVeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoVeiculoService {

    private final TipoVeiculoRepository tipoVeiculoRepository;

    @Autowired
    public TipoVeiculoService(TipoVeiculoRepository tipoVeiculoRepository) {
        this.tipoVeiculoRepository = tipoVeiculoRepository;
    }

    public List<TipoVeiculo> getAllTipoVeiculos() {
        return tipoVeiculoRepository.findAll();
    }

    public Optional<TipoVeiculo> findTipoVeiculoById(Long id) {
        return tipoVeiculoRepository.findById(id);
    }

    public TipoVeiculo saveTipoVeiculo(TipoVeiculo tipoVeiculo) {
        return tipoVeiculoRepository.save(tipoVeiculo);
    }

    public void deleteTipoVeiculo(Long id) {
        tipoVeiculoRepository.deleteById(id);
    }

    public TipoVeiculo updateTipoVeiculo(Long id, TipoVeiculo tipoVeiculoDetails) {
        TipoVeiculo tipoVeiculo = tipoVeiculoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Tipo de Veículo não encontrado"));

        tipoVeiculo.setTipoVeiculo(tipoVeiculoDetails.getTipoVeiculo());
        // outros campos conforme necessário

        return tipoVeiculoRepository.save(tipoVeiculo);
    }
}
