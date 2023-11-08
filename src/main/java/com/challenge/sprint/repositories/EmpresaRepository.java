package com.challenge.sprint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.sprint.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

}
