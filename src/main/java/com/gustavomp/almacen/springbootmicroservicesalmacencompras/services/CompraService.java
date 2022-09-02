package com.gustavomp.almacen.springbootmicroservicesalmacencompras.services;

import com.gustavomp.almacen.springbootmicroservicesalmacencompras.models.Compra;

import java.util.List;

public interface CompraService {

    Compra saveCompra(Compra compra);

    List<Compra> getAllComprasByUserId(Long id);
}
