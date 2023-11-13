package com.challenge.sprint.services;

import com.challenge.sprint.entities.Servico;
import com.challenge.sprint.repositories.ServicoRepository;
import com.challenge.sprint.repositories.ClienteRepository;
import com.challenge.sprint.repositories.PrestadorModalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    private final ServicoRepository servicoRepository;
    private final ClienteRepository clienteRepository;
    private final PrestadorModalRepository prestadorModalRepository;

    @Autowired
    public ServicoService(ServicoRepository servicoRepository, 
                          ClienteRepository clienteRepository,
                          PrestadorModalRepository prestadorModalRepository) {
        this.servicoRepository = servicoRepository;
        this.clienteRepository = clienteRepository;
        this.prestadorModalRepository = prestadorModalRepository;
    }

    public List<Servico> getAllServicos() {
        return servicoRepository.findAll();
    }

    public Optional<Servico> findServicoById(Long id) {
        return servicoRepository.findById(id);
    }

    public Servico saveServico(Servico servico) {
        validateForeignKeyEntities(servico);
        return servicoRepository.save(servico);
    }

    public void deleteServico(Long id) {
        if (!servicoRepository.existsById(id)) {
            throw new RuntimeException("Serviço não encontrado para exclusão");
        }
        servicoRepository.deleteById(id);
    }

    public Servico updateServico(Long id, Servico servicoDetails) {
        Servico servico = servicoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Serviço não encontrado"));
        
        validateForeignKeyEntities(servicoDetails);
        servico.setHoraServico(servicoDetails.getHoraServico());
        servico.setLocalUsuario(servicoDetails.getLocalUsuario());
        servico.setStatusOrdem(servicoDetails.getStatusOrdem());

        return servicoRepository.save(servico);
    }

    private void validateForeignKeyEntities(Servico servico) {
        if (servico.getCliente() != null && !clienteRepository.existsById(servico.getCliente().getIdCliente())) {
            throw new RuntimeException("Cliente associado não encontrado");
        }
        if (servico.getPrestadorModal() != null && !prestadorModalRepository.existsById(servico.getPrestadorModal().getIdPrestadorModal())) {
            throw new RuntimeException("Prestador Modal associado não encontrado");
        }
    }
}
