package com.ljt.api.controller;


import com.ljt.api.model.Usuarios;
import com.ljt.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/usuario", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/add")
    public Usuarios addUsuario(@RequestBody Usuarios usuario){

        return usuarioService.AgregarUsuario(usuario);
    }

    @PutMapping("/edit")
    public Usuarios editUsuario(@RequestBody Usuarios usuario){
        return usuarioService.EditarUsuario(usuario);
    }

    @GetMapping("/all")
    public List<Usuarios> listUsuarios(){
        return usuarioService.listarUsuarios();
    }

    @DeleteMapping("/remove")
    public Usuarios eliminarUsuario(@RequestBody Usuarios usuario){
        return usuarioService.eliminarUsuario(usuario);
    }

    @GetMapping("/login")
    public Map<String, Object> encriptarMD5(@RequestParam(name = "usuario")String usuario, @RequestParam(name = "psw") String psw)
    {
        return usuarioService.LoginUsur(usuario,psw);
    }
}
