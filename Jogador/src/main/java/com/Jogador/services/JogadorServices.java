package com.Jogador.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jogador.entites.Jogadores;
import com.Jogador.repository.JogadorRepository;

@Service

public class JogadorServices {
	@Autowired
	private JogadorRepository JogadorRepository;

	public JogadorServices(JogadorRepository JogadorRepository) {
		this.JogadorRepository = JogadorRepository;
	}
	public Jogadores saveJogadores(Jogadores jogadores) {
		return JogadorRepository.save(jogadores);
	}
	public Jogadores getJogadoresById(Long id) {
		return JogadorRepository.findById(id).orElse(null);

	}
	public List<Jogadores> getAllJogadores(){
		return JogadorRepository.findAll();
	}
	public void deleteJogadores(Long id) {
		JogadorRepository.deleteById(id);
	}
}

