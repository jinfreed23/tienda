package com.ljt.api.repository;

import com.ljt.api.model.Boleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface BoletaRepository extends JpaRepository<Boleta,Integer>
{

    @Query(value = "select b from Boleta  b where b.estado = ?1")
    public List<Boleta> listarEstado(String parametro);

    @Query(value = "select b from  Boleta  b where b.numBoleta = ?1")
    public  List<Boleta> ListarNumBoleta(int parametro);

    @Query(value = "select b from Boleta b where b.fecha = ?1")
    public List<Boleta> ListarFecha(Date parametro);

    @Query(value = "select b from Boleta b where b.idCliente = ?1")
    public List<Boleta> LstarCliente(int parametro);
}
