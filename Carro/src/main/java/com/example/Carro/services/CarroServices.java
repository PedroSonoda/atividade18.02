package com.example.Carro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Carro.entites.Carro;
import com.example.Carro.repository.CarroRepository;

@Service
public class CarroServices {

	
	private final CarroRepository CarroRepository;
	 
	@Autowired
	public CarroServices(CarroRepository CarroRepository) {
		this.CarroRepository = CarroRepository;
	}

	public Carro saveCarro(Carro carro) {
		return CarroRepository.save(carro);
		
	}

	public Carro getCarroById (Long id) {
		return CarroRepository.findById(id).orElse(null);
	}

	public List<Carro>getAllCarro(){
		return CarroRepository.findAll();
	}

	public void deleteCarro(Long id) {
		CarroRepository.deleteById(id);
	}

}


