package com.example.SistemaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaInventario.entity.Compra;

public interface CompraRepository extends JpaRepository<Compra, Long> {
}
