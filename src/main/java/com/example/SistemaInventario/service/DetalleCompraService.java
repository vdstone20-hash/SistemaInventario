package com.example.SistemaInventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SistemaInventario.entity.DetalleCompra;
import com.example.SistemaInventario.repository.DetalleCompraRepository;

@Service
public class DetalleCompraService {

    private final DetalleCompraRepository repository = null;


    public List<DetalleCompra> listarTodos() {
        return repository.findAll();
    }

    public Optional<DetalleCompra> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public DetalleCompra guardar(DetalleCompra entidad) {
        return repository.save(entidad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
