package com.gustavomp.almacen.springbootmicroservicesalmacencompras.services;

import com.gustavomp.almacen.springbootmicroservicesalmacencompras.models.Compra;
import com.gustavomp.almacen.springbootmicroservicesalmacencompras.repositories.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {

    @Autowired
    private CompraRepository compraRepository;

    @Override
    public Compra saveCompra(Compra compra) {
        return this.compraRepository.save(compra);
    }

    @Override
    public List<Compra> getAllComprasByUserId(Long id) {
        return this.compraRepository.findAllByUserId(id);
    }

}
