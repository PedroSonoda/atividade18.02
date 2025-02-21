package com.ControleAluno.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table (name = "Aluno")
public class Aluno {


		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long idAluno;

		@Column (name = "nome")
		private String name;

		@Column (name = "cpf")
		private String cpf;

		@Column (name = "enderco")
		private String endereco;
		
		public Long getId() {
			return idAluno;
		}

		public void setId(Long id) {
			this.idAluno = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getcpf() {
			return cpf;
		}

		public void setcpf(String cpf) {
			this.cpf = cpf;
		}
		
		public String getendereco() {
			return endereco;
		}

		public void setendereco(String endereco) {
			this.endereco = endereco;
		}
		
	}

