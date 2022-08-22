package com.ljt.api.controller;

import com.ljt.api.model.Boleta;
import com.ljt.api.service.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/boleta", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class BoletaController {
    @Autowired
    private BoletaService boletaService;

    @PostMapping("/add")
    public Boleta addBoleta(@RequestBody Boleta boleta)
    {
        return boletaService.CrearBoleta(boleta);
    }

    @PutMapping("/edit")
    public Boleta editBoleta(@RequestBody Boleta boleta)
    {
        return boletaService.EditarBoleta(boleta);
    }

    @GetMapping("/all")
    public List<Boleta> listarBoleta()
    {
        return boletaService.ListBoletas();
    }

    @GetMapping("/listEstado")
    public List<Boleta> ListEstadoBoleta(@RequestParam(name = "estado")String estado)
    {
        return boletaService.ListarEstado(estado);
    }

    @GetMapping("/NumBoleta")
    public List<Boleta> ListNumBoleta(@RequestParam(name = "numboleta")int numboleta)
    {
        return boletaService.ListarNroBoleta(numboleta);
    }

    @GetMapping("/cliente")
    public List<Boleta> ListCliente(@RequestParam(name = "cliente")int cliente)
    {
        return boletaService.ListarCliente(cliente);
    }

    @GetMapping("/fecha")
    public List<Boleta> ListNumBoleta(@RequestParam(name = "fecha") Date fecha)
    {
        return boletaService.ListarFecha(fecha);
    }
}
