package com.myapi.repositories;

import com.myapi.entities.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<Usuario> {

    public Usuario findByName(String name){
        return find("name", name).firstResult();
    }

    public List<Usuario> findByEmail(String email){
        return list("city", email);
    }

    public void deleteGabriel(){
        delete("name", "gabriel");
    }
}