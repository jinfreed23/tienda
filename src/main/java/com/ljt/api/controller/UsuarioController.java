package com.ljt.api.controller;


import com.ljt.api.model.Tusuarios;
import com.ljt.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/add")
    public Tusuarios addUsuario(@RequestBody Tusuarios usuario){
        return usuarioService.AgregarUsuario(usuario);
    }

    @PutMapping("/edit")
    public Tusuarios editUsuario(@RequestBody Tusuarios usuario){
        return usuarioService.EditarUsuario(usuario);
    }

    @GetMapping("/all")
    public List<Tusuarios> listUsuarios(){
        return usuarioService.listarUsuarios();
    }

    @DeleteMapping("/remove")
    public Tusuarios eliminarUsuario(@RequestBody Tusuarios usuario){
        return usuarioService.eliminarUsuario(usuario);
    }

}
