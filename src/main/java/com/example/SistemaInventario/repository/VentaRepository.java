package com.example.SistemaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaInventario.entity.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
