package com.tienda.backend_techzone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.DetalleCarrito;

public interface DetalleCarritoRepository extends JpaRepository<DetalleCarrito, Long>{
    List<DetalleCarrito> findByCarritoIdCarrito(Long idCarrito);
    void deleteByCarritoIdCarrito (Long idCarrito);    
}
