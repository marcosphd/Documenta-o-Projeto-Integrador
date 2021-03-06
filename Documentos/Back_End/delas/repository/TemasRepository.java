package com.projetointegrador.delas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetointegrador.delas.model.Temas;

@Repository
public interface TemasRepository extends JpaRepository<Temas, Long>{
public List<Temas> findAllByCategoriasContainingIgnoreCase(String categorias);
}
