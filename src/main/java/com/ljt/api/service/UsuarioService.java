package com.ljt.api.service;
import com.ljt.api.model.Usuarios;
import com.ljt.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuarios AgregarUsuario(Usuarios usuario)
    {
        String clave = usuarioRepository.encriptarLogin(usuario.getContraseña());
        usuario.setContraseña(clave);
        return usuarioRepository.save(usuario);
    }
    public Usuarios EditarUsuario(Usuarios usuario)
    {
        return usuarioRepository.save(usuario);
    }
    public List<Usuarios> listarUsuarios()
    {
        return usuarioRepository.findAll();
    }
    public Usuarios eliminarUsuario(Usuarios usuario){
        usuario.setEstado("Inactivo");
        return usuarioRepository.save(usuario);
    }

    public Map<String, Object> LoginUsur(String user,String password)
    {
        Map<String, Object> data = new HashMap<String ,Object>();
        String clave = usuarioRepository.encriptarLogin(password);
        Usuarios usr = usuarioRepository.LoginUsuario(user,clave);

        if(usr != null)
        {
            data.put("id",usr.getIdUsuario());
            data.put("dni",usr.getDni());
            data.put("nombres",usr.getNombre());
            data.put("apellidos",usr.getApellido());
            data.put("rol",usr.getCargo());
        }

        else
        {
            data.put("id",0);
            data.put("msj","Usuario y/o Contraseña incorrectos");
        }

        return data;
    }

}

