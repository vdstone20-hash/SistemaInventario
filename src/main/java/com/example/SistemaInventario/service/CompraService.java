package com.example.SistemaInventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SistemaInventario.entity.Compra;
import com.example.SistemaInventario.repository.CompraRepository;

@Service
public class CompraService {

    private final CompraRepository repository = null;


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
