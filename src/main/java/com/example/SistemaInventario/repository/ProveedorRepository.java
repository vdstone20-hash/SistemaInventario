package com.example.SistemaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaInventario.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
}
