package com.example.SistemaInventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SistemaInventario.entity.DetalleVenta;
import com.example.SistemaInventario.repository.DetalleVentaRepository;

@Service
public class DetalleVentaService {

    private final DetalleVentaRepository repository = null;


    public List<DetalleVenta> listarTodos() {
        return repository.findAll();
    }

    public Optional<DetalleVenta> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public DetalleVenta guardar(DetalleVenta entidad) {
        return repository.save(entidad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
