package com.myapi.controllers;

import com.myapi.entities.Usuario;
import com.myapi.services.UsuarioService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("/api/usuario")
public class UsuarioController {

    @Inject
    UsuarioService usuarioService;

    @GET
    public List<Usuario> getAll(){
        return usuarioService.findAllUsuarios();
    }
    @POST
    @Transactional
    public Usuario addUsuario(Usuario usuario){
        return usuarioService.addUsuario(usuario);
    }

}
