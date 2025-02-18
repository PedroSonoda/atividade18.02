package com.ControleAluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ControleAluno.entites.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	// Nenhuma implementação é necessaria. Spring Data JPA cuidára disso 
} 