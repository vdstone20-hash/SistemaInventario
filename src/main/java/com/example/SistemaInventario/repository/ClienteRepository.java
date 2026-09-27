package com.example.SistemaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaInventario.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
