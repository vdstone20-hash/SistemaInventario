package com.example.SistemaInventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SistemaInventario.entity.Categoria;
import com.example.SistemaInventario.repository.CategoriaRepository;

@Service
public class CategoriaService {

    private final CategoriaRepository repository = null;


    public List<Categoria> listarTodos() {
        return repository.findAll();
    }

    public Optional<Categoria> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Categoria guardar(Categoria entidad) {
        return repository.save(entidad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
