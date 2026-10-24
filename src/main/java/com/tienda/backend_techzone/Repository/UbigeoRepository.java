package com.tienda.backend_techzone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.Ubigeo;

public interface UbigeoRepository extends JpaRepository<Ubigeo, Long> {
    
    List<Ubigeo> findAllByVigenteTrue();
}
