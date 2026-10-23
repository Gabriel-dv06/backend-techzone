package com.tienda.backend_techzone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.MedioPago;

public interface MedioPagoRepository extends JpaRepository<MedioPago, Long>{
    List<MedioPago> findAllByVigenteTrue();
}
