package com.example.SistemaInventario.service;

import com.example.SistemaInventario.entity.DetalleCompra;
import com.example.SistemaInventario.repository.DetalleCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleCompraService {

    @Autowired
    private DetalleCompraRepository repository;

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
