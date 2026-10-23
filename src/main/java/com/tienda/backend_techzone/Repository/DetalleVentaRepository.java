package com.tienda.backend_techzone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.DetalleVenta;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long>{
    List<DetalleVenta> findByVentaIdVenta (Long idVenta);
}
