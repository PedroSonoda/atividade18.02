package com.example.Carro.entites;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table (name = "Carro")
public class Carro {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	@Column (name = "marca")
	private String marca;

	@Column (name = "placa")
	private String placa;

	@Column (name = "portas")
	private String portas;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getmarca() {
		return marca;
	}

	public void setmarca(String marca) {
		this.marca = marca;
	}

	public String getplaca() {
		return placa;
	}

	public void setplaca(String placa) {
		this.placa = placa;
	}
	
	public String getportas() {
		return portas;
	}

	public void setportas(String portas) {
		this.portas = portas;
	}
	
}



