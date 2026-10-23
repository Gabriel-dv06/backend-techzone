package com.tienda.backend_techzone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
