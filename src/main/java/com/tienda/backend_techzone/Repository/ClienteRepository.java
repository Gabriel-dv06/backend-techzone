package com.tienda.backend_techzone.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.Cliente;
import com.tienda.backend_techzone.Model.Persona;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    Optional<Cliente> findByPersona (Persona persona);
    Optional<Cliente> findFirstByPersona (Persona persona);
    
}
