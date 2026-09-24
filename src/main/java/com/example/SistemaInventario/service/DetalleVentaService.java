package com.example.SistemaInventario.service;

import com.example.SistemaInventario.entity.DetalleVenta;
import com.example.SistemaInventario.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaService {

    @Autowired
    private DetalleVentaRepository repository;

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
