package com.gustavomp.almacen.springbootmicroservicesalmacencompras.repositories;

import com.gustavomp.almacen.springbootmicroservicesalmacencompras.models.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {

    List<Compra> findAllByUserId(Long userId);
}
