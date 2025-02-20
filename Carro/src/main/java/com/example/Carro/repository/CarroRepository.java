package com.example.Carro.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Carro.entites.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

	// Nenhuma implementação é necessaria. Spring Data JPA cuidára disso 
} 