package com.ControleEquipes.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ControleEquipes.entites.Equipes;
import com.ControleEquipes.repository.EquipesRepository;

@Service

public class EquipesServices {
	@Autowired
	private EquipesRepository EquipesRepository;

	public EquipesServices(EquipesRepository EquipesRepository) {
	this.EquipesRepository = EquipesRepository;
	}
	public Equipes saveEquipes(Equipes equipes) {
	return EquipesRepository.save(equipes);
	}
	public Equipes getEquipesById(Long id) {
	return EquipesRepository.findById(id).orElse(null);

	}
	public List<Equipes> getAllEquipes(){
	return EquipesRepository.findAll();
	}
	public void deleteEquipes(Long id) {
	EquipesRepository.deleteById(id);
	}
}
