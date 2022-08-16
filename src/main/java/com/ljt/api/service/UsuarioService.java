package com.ljt.api.service;
import com.ljt.api.model.Tusuarios;
import com.ljt.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Tusuarios AgregarUsuario(Tusuarios usuario){
        return usuarioRepository.save(usuario);
    }
    public Tusuarios EditarUsuario(Tusuarios usuario){
        return usuarioRepository.save(usuario);
    }
    public List<Tusuarios> listarUsuarios(){
        return usuarioRepository.findAll();
    }
    public Tusuarios eliminarUsuario(Tusuarios usuario){
        usuario.setEstado("Inactivo");
        return usuarioRepository.save(usuario);
    }

}
