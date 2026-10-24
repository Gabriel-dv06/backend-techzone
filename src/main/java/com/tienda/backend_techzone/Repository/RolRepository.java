package com.tienda.backend_techzone.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.Rol;

public interface RolRepository extends JpaRepository <Rol, Long>{

    Optional<Rol> findByNombre (String nombre);
    
}
