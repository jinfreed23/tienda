package com.ljt.api.controller;

import com.ljt.api.model.Clientes;
import com.ljt.api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/add")
    public Clientes AddCliente(@RequestBody Clientes cliente)
    {
        return clienteService.AddCliente(cliente);
    }

    @PutMapping("/edit")
    public Clientes editCliente(@RequestBody Clientes cliente)
    {
        return clienteService.editCliente(cliente);
    }

    @GetMapping("/all")
    public List<Clientes> listClientes()
    {
        return clienteService.extraerClientes();
    }

    @GetMapping("/search")
    public  List<Clientes> clientebusqueda(int parametro)
    {
        return clienteService.BusquedaCliente(parametro);
    }
}
