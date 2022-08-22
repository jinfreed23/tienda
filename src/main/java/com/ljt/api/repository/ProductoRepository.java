package com.ljt.api.repository;

import com.ljt.api.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Productos,Integer> {
    @Query(value = "select p from Productos p where p.producto = ?1")
    public List<Productos> BusquedaProducto(String parametro);

    @Query(value = "select p from Productos p where p.stock >= ?1")
    public  List<Productos> ListarStockMin(int parametro);
}
