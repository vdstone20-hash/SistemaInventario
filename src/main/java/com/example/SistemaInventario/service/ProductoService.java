package com.example.SistemaInventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SistemaInventario.entity.Producto;
import com.example.SistemaInventario.repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repository; // Inyección automática por Spring

    public List<Producto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Producto> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Producto guardar(Producto entidad) {
        return repository.save(entidad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
