package com.example.SistemaInventario.service;

import com.example.SistemaInventario.entity.Venta;
import com.example.SistemaInventario.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository repository;

    public List<Venta> listarTodos() {
        return repository.findAll();
    }

    public Optional<Venta> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Venta guardar(Venta entidad) {
        return repository.save(entidad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
