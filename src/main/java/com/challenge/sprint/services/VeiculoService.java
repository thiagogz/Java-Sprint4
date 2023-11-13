package com.challenge.sprint.services;

import com.challenge.sprint.entities.Veiculo;
import com.challenge.sprint.entities.Marca;
import com.challenge.sprint.entities.TipoVeiculo;
import com.challenge.sprint.entities.Modelo;
import com.challenge.sprint.repositories.VeiculoRepository;
import com.challenge.sprint.repositories.MarcaRepository;
import com.challenge.sprint.repositories.TipoVeiculoRepository;
import com.challenge.sprint.repositories.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;
    private final MarcaRepository marcaRepository;
    private final TipoVeiculoRepository tipoVeiculoRepository;
    private final ModeloRepository modeloRepository;

    @Autowired
    public VeiculoService(VeiculoRepository veiculoRepository,
                          MarcaRepository marcaRepository,
                          TipoVeiculoRepository tipoVeiculoRepository,
                          ModeloRepository modeloRepository) {
        this.veiculoRepository = veiculoRepository;
        this.marcaRepository = marcaRepository;
        this.tipoVeiculoRepository = tipoVeiculoRepository;
        this.modeloRepository = modeloRepository;
    }

    public List<Veiculo> getAllVeiculos() {
        return veiculoRepository.findAll();
    }

    public Optional<Veiculo> findVeiculoById(Long id) {
        return veiculoRepository.findById(id);
    }


    public Veiculo saveVeiculo(Veiculo veiculo) {
        validateForeignKeyEntities(veiculo);
        return veiculoRepository.save(veiculo);
    }
    
    public void deleteVeiculo(Long id) {
        if (!veiculoRepository.existsById(id)) {
            throw new RuntimeException("Veículo não encontrado para exclusão");
        }
        veiculoRepository.deleteById(id);
    }


    public Veiculo updateVeiculo(Long id, Veiculo veiculoDetails) {
        Veiculo veiculo = veiculoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));

        validateForeignKeyEntities(veiculoDetails);
        veiculo.setMarca(veiculoDetails.getMarca());
        veiculo.setTipoVeiculo(veiculoDetails.getTipoVeiculo());
        veiculo.setModelo(veiculoDetails.getModelo());
        veiculo.setChassiAlongado(veiculoDetails.isChassiAlongado());
        // outros campos conforme necessário

        return veiculoRepository.save(veiculo);
    }

    private void validateForeignKeyEntities(Veiculo veiculo) {
        // Verifica se a Marca, TipoVeiculo e Modelo existem
        if (veiculo.getMarca() != null && !marcaRepository.existsById(veiculo.getMarca().getIdMarca())) {
            throw new RuntimeException("Marca não encontrada");
        }
        if (veiculo.getTipoVeiculo() != null && !tipoVeiculoRepository.existsById(veiculo.getTipoVeiculo().getIdTipoVeiculo())) {
            throw new RuntimeException("Tipo de Veículo não encontrado");
        }
        if (veiculo.getModelo() != null && !modeloRepository.existsById(veiculo.getModelo().getIdModelo())) {
            throw new RuntimeException("Modelo não encontrado");
        }
    }
}
