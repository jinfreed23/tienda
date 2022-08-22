package com.ljt.api.repository;

import com.ljt.api.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuarios,Integer> {
    @Query(value = "Select u From Usuarios u where u.estado = ?1")
    public List<Usuarios> listarPorEstado(String estado);

    @Query(value = "select md5(shal(?1))", nativeQuery = true)
    public String encriptarLogin(String clave0);

    @Query(value = "Select u From Usuarios u where  u.usuario = ?1 AND u.contraseña = ?2 AND u.estado = 'activo'")
    public Usuarios LoginUsuario(String usuario,String clave);
}
