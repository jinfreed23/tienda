package com.ljt.api.service;

import com.ljt.api.model.Detalles;
import com.ljt.api.repository.DetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleService {

    @Autowired
    private DetalleRepository detalleRepository;

    public Detalles AddDetalle(Detalles detalle)
    {
        return detalleRepository.save(detalle);
    }

    public Detalles editDetalle(Detalles detalle)
    {
        return detalleRepository.save(detalle);
    }

    public List<Detalles> extraerVentas(int numBoleta)
    {
        return detalleRepository.ListaVenta(numBoleta);
    }
}
