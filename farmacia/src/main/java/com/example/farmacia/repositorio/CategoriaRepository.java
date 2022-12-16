package com.example.farmacia.repositorio;

import java.util.List;

import com.example.farmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

    public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao")String descricao);
}