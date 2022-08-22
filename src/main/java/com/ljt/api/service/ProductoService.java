package com.ljt.api.service;

import com.ljt.api.model.Productos;
import com.ljt.api.repository.DetalleRepository;
import com.ljt.api.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Productos AddProducto(Productos producto)
    {
        return productoRepository.save(producto);
    }

    public Productos EditProducto(Productos producto)
    {
        return productoRepository.save(producto);
    }

    public void EliminarProducto(Productos producto)
    {
        productoRepository.delete(producto);
    }

    public List<Productos> listProductos()
    {
        return productoRepository.findAll();
    }

    public List<Productos> listStock(int parametro)
    {
        return productoRepository.ListarStockMin(parametro);
    }

    public List<Productos> BuquedaProducto(String parametro)
    {
        return productoRepository.BusquedaProducto(parametro);
    }
}
