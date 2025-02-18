package com.ControleEquipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ControleEquipes.entites.Equipes;

public interface EquipesRepository extends JpaRepository<Equipes,Long> {

//Nenhuma implemantação é necessária. Spring Data JPA cuidará disso.

}
