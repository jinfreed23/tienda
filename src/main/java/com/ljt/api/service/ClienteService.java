package com.ljt.api.service;

import com.ljt.api.model.Clientes;
import com.ljt.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Clientes AddCliente(Clientes cliente)
    {
        return clienteRepository.save(cliente);
    }

    public Clientes editCliente(Clientes cliente)
    {
        return clienteRepository.save(cliente);
    }

    public List<Clientes> extraerClientes()
    {
        return clienteRepository.findAll();
    }

    public  List<Clientes> BusquedaCliente(int parametro)
    {
        return clienteRepository.ClienteExtraer(parametro);
    }
}
