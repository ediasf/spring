package com.generation.blogpessoal.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity 
@Table(name = "tb_personagens")

public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	@NotBlank(message = "O Atributo titulo e obrigatorio e nao pode ser vazio ")
	@Size(min = 5 , max = 100, message = "O Atributo titulo deve conter no minimo 5 caracteres e no maximo 100 caracteres")
	
	private String Titulo;
	
	@NotNull(message = "O Atributo titulo e obrigatorio!")
	@Size(min = 10 , max = 1000, message = "O Atributo titulo deve conter no minimo 10 caracteres e no maximo 1000 caracteres")
	
	private String texto;
	
	@UpdateTimestamp
	private LocalDate data;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
		
}
