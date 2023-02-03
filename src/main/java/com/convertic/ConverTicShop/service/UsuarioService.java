package com.convertic.ConverTicShop.service;

import com.convertic.ConverTicShop.model.Usuario;
import com.convertic.ConverTicShop.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Override Lo utilizamos para sobobrescribir la clase principal

@Service
@AllArgsConstructor
public class UsuarioService  {  //implements UsuarioInterface
    /*private final UsuarioRepository usuarioRepository;
    @Override
    public Usuario saveUsuario(Usuario usuario) {

        return usuarioRepository.save(usuario);
    }*/

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listaUsuario(){
        return usuarioRepository.findAll();
    }

    public Usuario registrar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }


}


