package com.ljt.api.controller;

import com.ljt.api.model.Productos;
import com.ljt.api.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/producto", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/add")
    public Productos AddProducto(Productos producto)
    {
        return productoService.AddProducto(producto);
    }

    @PutMapping("/edit")
    public Productos EditProducto(Productos producto)
    {
        return productoService.EditProducto(producto);
    }

    @GetMapping("/list")
    public List<Productos> ListProductos()
    {
        return productoService.listProductos();
    }

    @DeleteMapping("/delete")
    public void EliminarProducto(Productos producto)
    {
        productoService.EliminarProducto(producto);
    }

    @GetMapping("/listStock")
    public List<Productos> listProdcutosStock(int parametro)
    {
        return productoService.listStock(parametro);
    }

    @GetMapping("/search")
    public List<Productos> BusquedaProducto(String parametro)
    {
        return productoService.BuquedaProducto(parametro);
    }
}
