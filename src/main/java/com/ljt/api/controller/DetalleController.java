package com.ljt.api.controller;

import com.ljt.api.model.Detalles;
import com.ljt.api.service.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/detalle", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class DetalleController {
    @Autowired
    private DetalleService detalleService;

    @PostMapping("/add")
    public Detalles AddDetalle(@RequestBody Detalles detalle)
    {
        return detalleService.AddDetalle(detalle);
    }

    @PutMapping("/edit")
    public Detalles EditDetalle(@RequestBody Detalles detalle)
    {
        return detalleService.editDetalle(detalle);
    }

    @GetMapping("/ListVenta")
    public List<Detalles> listaVenta(@RequestParam(name = "numboleta") int numboleta)
    {
        return detalleService.extraerVentas(numboleta);
    }

}
