package com.tienda.backend_techzone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.Pago;

public interface PagoRepository extends JpaRepository<Pago, Long> {
    List<Pago> findByVentaIdVenta (Long idVenta);
    List<Pago> findByMedioPagoIdMedioPago (Long idMedioPago);
}
