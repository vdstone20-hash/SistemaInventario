package com.example.SistemaInventario.service;

import com.example.SistemaInventario.entity.Compra;
import com.example.SistemaInventario.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    private CompraRepository repository;

    public List<Compra> listarTodos() {
        return repository.findAll();
    }

    public Optional<Compra> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Compra guardar(Compra entidad) {
        return repository.save(entidad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
