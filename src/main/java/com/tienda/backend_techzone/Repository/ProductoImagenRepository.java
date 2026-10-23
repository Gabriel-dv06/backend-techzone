package com.tienda.backend_techzone.Repository;

import com.tienda.backend_techzone.Model.ProductoImagen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoImagenRepository extends JpaRepository<ProductoImagen, Long> {
    List<ProductoImagen> findByProductoIdProducto(Long idProducto);
}
