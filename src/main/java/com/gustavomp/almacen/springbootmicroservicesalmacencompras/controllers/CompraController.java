package com.gustavomp.almacen.springbootmicroservicesalmacencompras.controllers;

import com.gustavomp.almacen.springbootmicroservicesalmacencompras.models.Compra;
import com.gustavomp.almacen.springbootmicroservicesalmacencompras.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping("/{id}")
    public ResponseEntity<List<Compra>> getAllComprasByUserId(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok()
                .body(this.compraService.getAllComprasByUserId(id));
    }

    @PostMapping
    public ResponseEntity<Compra> saveCompra(@RequestBody Compra compra) {
        return new ResponseEntity<>(this.compraService.saveCompra(compra), HttpStatus.CREATED);
    }

}
