package com.example.SistemaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaInventario.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
