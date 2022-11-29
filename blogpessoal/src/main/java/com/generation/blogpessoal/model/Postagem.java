package com.generation.blogpessoal.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O título é obrigatório e não pode ser vazio!")
    @Size(min = 10, max = 60, message = "O título deve conter entre 10 e 60 caracteres")
    private String titulo;
    @NotNull(message = "O texto é obrigatório!")
    @Size(min = 100, max = 606, message = "O texto deve conter entre 100 e 606 caracteres")
    private String texto;
    @UpdateTimestamp
    private LocalDateTime data;

    @ManyToOne
    @JsonIgnoreProperties("postagem")
    public Tema tema;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
