package com.ljt.api.repository;

import com.ljt.api.model.Detalles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DetalleRepository extends JpaRepository<Detalles,Integer> {
    @Query(value = "select d from Detalles d where d.numBoleta = ?1")
    public List<Detalles> ListaVenta(int parametro);
}
