package com.example.SistemaInventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SistemaInventario.entity.Cliente;
import com.example.SistemaInventario.repository.ClienteRepository;

@Service
public class ClienteService {

    private final ClienteRepository repository = null;


    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Optional<Cliente> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Cliente guardar(Cliente entidad) {
        return repository.save(entidad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
