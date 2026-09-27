package com.example.SistemaInventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SistemaInventario.entity.Venta;
import com.example.SistemaInventario.repository.VentaRepository;

import jakarta.transaction.Transactional;

@Service
public class VentaService {

    // 1. Declarar el repositorio sin asignarlo a null
    private final VentaRepository repository;

    // 2. Inyección de dependencias por constructor (soluciona el NullPointerException)
    public VentaService(VentaRepository repository) {
        this.repository = repository;
    }

    public List<Venta> listarTodos() {
        return repository.findAll();
    }

    public Optional<Venta> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    // 3. Método guardar optimizado para asignar la venta a cada detalle antes de persistir
    @Transactional
    public Venta guardar(Venta entidad) {
        if (entidad.getDetalles() != null) {
            for (var detalle : entidad.getDetalles()) {
                detalle.setVenta(entidad);
            }
        }
        return repository.save(entidad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}