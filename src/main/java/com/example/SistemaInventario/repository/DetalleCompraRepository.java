package com.example.SistemaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaInventario.entity.DetalleCompra;

public interface DetalleCompraRepository extends JpaRepository<DetalleCompra, Long> {
}
