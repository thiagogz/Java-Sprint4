package com.challenge.sprint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.sprint.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}