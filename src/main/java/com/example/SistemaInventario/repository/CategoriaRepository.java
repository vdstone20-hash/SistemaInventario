package com.example.SistemaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaInventario.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
