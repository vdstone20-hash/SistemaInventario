package com.example.SistemaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaInventario.entity.DetalleVenta;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {
}
