package com.example.SistemaInventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SistemaInventario.entity.Rol;
import com.example.SistemaInventario.repository.RolRepository;

@Service
public class RolService {

    private final RolRepository repository = null;


    public List<Rol> listarTodos() {
        return repository.findAll();
    }

    public Optional<Rol> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Rol guardar(Rol entidad) {
        return repository.save(entidad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
