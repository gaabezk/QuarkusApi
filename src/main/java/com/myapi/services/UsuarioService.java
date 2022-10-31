package com.myapi.services;

import com.myapi.entities.Usuario;
import com.myapi.repositories.UsuarioRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UsuarioService {

    @Inject
    UsuarioRepository usuarioRepository;

    public List<Usuario> findAllUsuarios(){
        return usuarioRepository.findAll().list();
    }

    public Usuario addUsuario(Usuario usuario){
        usuarioRepository.persist(usuario);
        return usuario;
    }

}
