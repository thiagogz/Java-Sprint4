package com.challenge.sprint.services;

import com.challenge.sprint.entities.Apolice;
import com.challenge.sprint.entities.Veiculo;
import com.challenge.sprint.repositories.ApoliceRepository;
import com.challenge.sprint.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApoliceService {

    private final ApoliceRepository apoliceRepository;
    private final VeiculoRepository veiculoRepository;

    @Autowired
    public ApoliceService(ApoliceRepository apoliceRepository, VeiculoRepository veiculoRepository) {
        this.apoliceRepository = apoliceRepository;
        this.veiculoRepository = veiculoRepository;
    }

    public List<Apolice> getAllApolices() {
        return apoliceRepository.findAll();
    }

    public Optional<Apolice> findApoliceById(Long id) {
        return apoliceRepository.findById(id);
    }

    public Apolice saveApolice(Apolice apolice) {
        validateVeiculo(apolice.getVeiculo());
        return apoliceRepository.save(apolice);
    }

    public void deleteApolice(Long id) {
        apoliceRepository.deleteById(id);
    }

    public Apolice updateApolice(Long id, Apolice apoliceDetails) {
        Apolice apolice = apoliceRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Apolice não encontrada"));

        validateVeiculo(apoliceDetails.getVeiculo());
        apolice.setStatusApolice(apoliceDetails.getStatusApolice());
        apolice.setValorApolice(apoliceDetails.getValorApolice());
        apolice.setPlacaVeiculo(apoliceDetails.getPlacaVeiculo());        

        return apoliceRepository.save(apolice);
    }

    private void validateVeiculo(Veiculo veiculo) {
        if (veiculo != null && !veiculoRepository.existsById(veiculo.getIdVeiculo())) {
            throw new RuntimeException("Veículo associado não encontrado");
        }
    }
}
