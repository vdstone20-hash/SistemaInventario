package com.example.SistemaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaInventario.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
}
