package com.example.SistemaInventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SistemaInventario.entity.Usuario;
import com.example.SistemaInventario.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repository = null;


    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Optional<Usuario> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Usuario guardar(Usuario entidad) {
        return repository.save(entidad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
