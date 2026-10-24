package com.tienda.backend_techzone.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.Persona;
import com.tienda.backend_techzone.Model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    
    Optional<Usuario> findByCorreo (String correo);
    Optional<Usuario> findFirstByPersona (Persona persona);
    Optional<Usuario> findByPersona_IdPersona (Long idPersona);
    boolean existsByPersona (Persona persona);

}
