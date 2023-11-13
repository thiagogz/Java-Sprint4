package com.challenge.sprint.services;

import com.challenge.sprint.entities.PrestadorModal;
import com.challenge.sprint.repositories.PrestadorModalRepository;
import com.challenge.sprint.repositories.PrestadorRepository;
import com.challenge.sprint.repositories.ModalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestadorModalService {

    private final PrestadorModalRepository prestadorModalRepository;
    private final PrestadorRepository prestadorRepository;
    private final ModalRepository modalRepository;

    @Autowired
    public PrestadorModalService(PrestadorModalRepository prestadorModalRepository,
                                 PrestadorRepository prestadorRepository,
                                 ModalRepository modalRepository) {
        this.prestadorModalRepository = prestadorModalRepository;
        this.prestadorRepository = prestadorRepository;
        this.modalRepository = modalRepository;
    }

    public List<PrestadorModal> getAllPrestadorModais() {
        return prestadorModalRepository.findAll();
    }

    public Optional<PrestadorModal> findPrestadorModalById(Long id) {
        return prestadorModalRepository.findById(id);
    }

    public PrestadorModal savePrestadorModal(PrestadorModal prestadorModal) {
        validateForeignKeyEntities(prestadorModal);
        return prestadorModalRepository.save(prestadorModal);
    }

    public void deletePrestadorModal(Long id) {
        if (!prestadorModalRepository.existsById(id)) {
            throw new RuntimeException("Prestador Modal não encontrado para exclusão");
        }
        prestadorModalRepository.deleteById(id);
    }

    public PrestadorModal updatePrestadorModal(Long id, PrestadorModal prestadorModalDetails) {
        PrestadorModal prestadorModal = prestadorModalRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Prestador Modal não encontrado"));
        
        validateForeignKeyEntities(prestadorModalDetails);
        prestadorModal.setPlacaGuincho(prestadorModalDetails.getPlacaGuincho());

        return prestadorModalRepository.save(prestadorModal);
    }

    private void validateForeignKeyEntities(PrestadorModal prestadorModal) {
        if (prestadorModal.getPrestador() != null && !prestadorRepository.existsById(prestadorModal.getPrestador().getIdPrestador())) {
            throw new RuntimeException("Prestador associado não encontrado");
        }
        if (prestadorModal.getModal() != null && !modalRepository.existsById(prestadorModal.getModal().getIdModal())) {
            throw new RuntimeException("Modal associado não encontrado");
        }
    }
}
