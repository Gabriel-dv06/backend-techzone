package com.tienda.backend_techzone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.TipoDocumento;

public interface TipoDocumentoRepository extends JpaRepository <TipoDocumento, Long> {
    List<TipoDocumento> findAllByVigenteTrue();
    
}
