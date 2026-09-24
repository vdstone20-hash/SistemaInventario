package com.example.SistemaInventario.service;

import com.example.SistemaInventario.entity.Proveedor;
import com.example.SistemaInventario.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository repository;

    public List<Proveedor> listarTodos() {
        return repository.findAll();
    }

    public Optional<Proveedor> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Proveedor guardar(Proveedor entidad) {
        return repository.save(entidad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
