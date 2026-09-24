package com.example.SistemaInventario.service;

import com.example.SistemaInventario.entity.Rol;
import com.example.SistemaInventario.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService {

    @Autowired
    private RolRepository repository;

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
