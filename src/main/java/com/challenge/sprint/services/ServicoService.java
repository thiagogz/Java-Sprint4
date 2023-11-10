package com.challenge.sprint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.sprint.entities.Servico;
import com.challenge.sprint.repositories.ServicoRepository;

@Service
public class ServicoService {
	private final ServicoRepository servicoRepository;
	
	@Autowired
    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

	public List<Servico> getAllServico() {
		return servicoRepository.findAll();
	}
	
	public Servico findServicoById (@PathVariable Long id) {
		Servico result = servicoRepository.findById(id).get();
		return result;
	}
}
