package com.example.SistemaInventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SistemaInventario.entity.Proveedor;
import com.example.SistemaInventario.repository.ProveedorRepository;

@Service
public class ProveedorService {

    private final ProveedorRepository repository = null;


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
