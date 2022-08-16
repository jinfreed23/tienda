package com.ljt.api.repository;

import com.ljt.api.model.Tusuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Tusuarios,Integer> {
    @Query(value = "Select u From Tusuarios u where u.estado = ?1")
    public List<Tusuarios> listarPorEstado(String estado);
}
