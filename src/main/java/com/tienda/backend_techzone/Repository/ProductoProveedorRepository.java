package com.tienda.backend_techzone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend_techzone.Model.ProductoProveedor;
import com.tienda.backend_techzone.Model.ProductoProveedor.Id;

public interface ProductoProveedorRepository extends JpaRepository<ProductoProveedor, Id>{
    List<ProductoProveedor> findById_IdProducto (Long idProducto);
    List<ProductoProveedor> findById_IdProveedor (Long idProveedor);
    
}
