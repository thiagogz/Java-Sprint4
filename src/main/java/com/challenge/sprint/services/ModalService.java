package com.challenge.sprint.services;

import com.challenge.sprint.entities.Modal;
import com.challenge.sprint.repositories.ModalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModalService {

    private final ModalRepository modalRepository;

    @Autowired
    public ModalService(ModalRepository modalRepository) {
        this.modalRepository = modalRepository;
    }

    public List<Modal> getAllModals() {
        return modalRepository.findAll();
    }

    public Optional<Modal> findModalById(Long id) {
        return modalRepository.findById(id);
    }

    public Modal saveModal(Modal modal) {
        return modalRepository.save(modal);
    }

    public void deleteModal(Long id) {
        modalRepository.deleteById(id);
    }

    public Modal updateModal(Long id, Modal modalDetails) {
        Modal modal = modalRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Modal não encontrado"));

        modal.setCategoriaModal(modalDetails.getCategoriaModal());
        modal.setTipoModal(modalDetails.getTipoModal());
        modal.setLimiteAltura(modalDetails.getLimiteAltura());
        modal.setLimiteComprimento(modalDetails.getLimiteComprimento());
        modal.setLimitePeso(modalDetails.getLimitePeso());
        modal.setLimiteLargura(modalDetails.getLimiteLargura());
        // outros campos conforme necessário

        return modalRepository.save(modal);
    }
}
