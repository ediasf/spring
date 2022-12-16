package com.example.farmacia.repositorio;

import java.util.List;
import java.util.Optional;

import com.example.farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

    public List<Produto> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

}