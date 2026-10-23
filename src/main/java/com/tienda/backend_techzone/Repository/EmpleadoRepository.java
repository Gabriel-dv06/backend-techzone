package com.tienda.backend_techzone.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.Empleado;
import com.tienda.backend_techzone.Model.Persona;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
    Optional<Empleado> findFirstByOptional (Persona persona);
    
}
