package com.example.SistemaInventario.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SistemaInventario.entity.DetalleVenta;
import com.example.SistemaInventario.service.DetalleVentaService;

@RestController
@RequestMapping("/api/detalleventas")
public class DetalleVentaController {

    private final DetalleVentaService service = new DetalleVentaService();


    @GetMapping
    public List<DetalleVenta> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleVenta> obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DetalleVenta crear(@RequestBody DetalleVenta entidad) {
        return service.guardar(entidad);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetalleVenta> actualizar(@PathVariable Long id, @RequestBody DetalleVenta entidad) {
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
