package com.example.SistemaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaInventario.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
