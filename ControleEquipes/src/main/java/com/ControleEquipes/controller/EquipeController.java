package com.ControleEquipes.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ControleEquipes.entites.Equipes;
import com.ControleEquipes.services.EquipesServices;

@RestController
@RequestMapping("/Equipes")

public class EquipeController {
	@Autowired
	private final EquipesServices EquipeService;

	public EquipeController(EquipesServices EquipeService) {
	this.EquipeService = EquipeService;
	}
	@PostMapping
	public Equipes createEquipes(@RequestBody Equipes equipes) {
	return EquipeService.saveEquipes(equipes);
	}
	@GetMapping("/{id}")
	public Equipes getEquipes(@PathVariable Long id) {
	return EquipeService.getEquipesById(id);
	}
	@GetMapping
	public List<Equipes> getAllEquipes() {
	return EquipeService.getAllEquipes();
	}
	@DeleteMapping("/{id}")
	public void deleteEquipes(@PathVariable Long id) {
	EquipeService.deleteEquipes(id);
	}

}
