package com.tienda.backend_techzone.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
    Optional<Persona> findByNumeroDocumento (String numeroDocumento);
    Optional<Persona> findFirstByNumeroDocumento (String numeroDocumento);
    Optional<Persona> findByTipoDocumentoAndNumeroDocumento (Long idTipoDocumento,String numeroDocumento);
    Optional<Persona> findFirstByTipoDocumentoAndNumeroDocumento (Long idTipoDocumento, String numeroDocumento);
    Long countByNumeroDocumento (String numeroDocumento);
    Long countByTipoDocumentoAndNumeroDocumento (Long idTipoDocumento, String numeroDocumento);

}
