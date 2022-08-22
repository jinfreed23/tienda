package com.ljt.api.repository;

import com.ljt.api.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Clientes,Integer> {

    @Query(value = "select c from Clientes c where c.dni=?1")
    public List<Clientes> ClienteExtraer(int dniparametro);
}
