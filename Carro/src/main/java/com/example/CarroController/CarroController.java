package com.example.CarroController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Carro.entites.Carro;
import com.example.Carro.services.CarroServices;


@RestController
@RequestMapping("/Carro")
public class CarroController {

	private final CarroServices CarroService;

	@Autowired
	public CarroController(CarroServices CarroServices) {
		this.CarroService = CarroServices;
	}
	
	@PostMapping
	public Carro createProduct(@RequestBody Carro Carro) {
		return CarroService.saveCarro(Carro);
	}
	
	@GetMapping ("/(id)")
	public Carro getCarro(@PathVariable Long id) {
		return CarroService.getCarroById(id);	
	}

	@DeleteMapping("/(id)")
	public void deleteCarro(@PathVariable Long id) {
		CarroService.deleteCarro(id);
}
}

	

