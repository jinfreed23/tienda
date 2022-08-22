package com.ljt.api.service;

import com.ljt.api.model.Boleta;
import com.ljt.api.repository.BoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class BoletaService {
    @Autowired
    private BoletaRepository boletaRepository;

    public Boleta CrearBoleta(Boleta boleta)
    {
        return boletaRepository.save(boleta);
    }

    public Boleta EditarBoleta(Boleta boleta)
    {
        return boletaRepository.save(boleta);
    }

    public Boleta AnularBoleta(Boleta boleta)
    {
        boleta.setEstado("Anulado");
        return boletaRepository.save(boleta);
    }

    public List<Boleta> ListarEstado(String estado)
    {
        return boletaRepository.listarEstado(estado);
    }

    public List<Boleta> ListarNroBoleta(int NumBoleta)
    {
        return boletaRepository.ListarNumBoleta(NumBoleta);
    }

    public List<Boleta> ListarCliente(int Dni)
    {
        return boletaRepository.LstarCliente(Dni);
    }

    public List<Boleta> ListarFecha(Date fecha)
    {
        return boletaRepository.ListarFecha(fecha);
    }

    public List<Boleta> ListBoletas()
    {
        return boletaRepository.findAll();
    }

}
