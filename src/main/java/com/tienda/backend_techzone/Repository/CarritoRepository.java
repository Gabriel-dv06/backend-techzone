package com.tienda.backend_techzone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.Carrito;

public interface CarritoRepository extends JpaRepository<Carrito, Long>{
    
}
