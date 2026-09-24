package com.example.SistemaInventario.controller;

import com.example.SistemaInventario.entity.DetalleCompra;
import com.example.SistemaInventario.service.DetalleCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallecompras")
public class DetalleCompraController {

    @Autowired
    private DetalleCompraService service;

    @GetMapping
    public List<DetalleCompra> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleCompra> obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DetalleCompra crear(@RequestBody DetalleCompra entidad) {
        return service.guardar(entidad);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetalleCompra> actualizar(@PathVariable Long id, @RequestBody DetalleCompra entidad) {
        return service.obtenerPorId(id)
                .map(p -> {
                    entidad.setId(id);
                    return ResponseEntity.ok(service.guardar(entidad));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (service.obtenerPorId(id).isPresent()) {
            service.eliminar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
