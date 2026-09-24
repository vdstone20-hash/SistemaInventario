package com.example.SistemaInventario.service;

import com.example.SistemaInventario.entity.Cliente;
import com.example.SistemaInventario.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

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
