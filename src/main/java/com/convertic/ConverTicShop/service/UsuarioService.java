package com.convertic.ConverTicShop.service;

import com.convertic.ConverTicShop.model.Usuario;
import com.convertic.ConverTicShop.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService implements UsuarioInterface {
    private final UsuarioRepository usuarioRepository;


    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
