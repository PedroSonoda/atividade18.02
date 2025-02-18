package com.Jogador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Jogador.entites.Jogadores;

public interface JogadorRepository extends JpaRepository<Jogadores,Long> {

	//Nenhuma implemantação é necessária. Spring Data JPA cuidará disso.

}