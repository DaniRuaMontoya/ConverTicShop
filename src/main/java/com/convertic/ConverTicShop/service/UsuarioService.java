package com.convertic.ConverTicShop.service;

import com.convertic.ConverTicShop.dto.RegistroRequest;
import com.convertic.ConverTicShop.model.Usuario;
import com.convertic.ConverTicShop.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public List<Usuario> listaUsuario() {
        return usuarioRepository.findAll();
    }


    public Usuario registrarUsuario(RegistroRequest registroRequest) {
        Usuario usuario = usuarioRepository.findByCorreoElectronico(registroRequest.getCorreoElectronico());

        if (usuario == null) {
            System.out.println("El usuario no existe");
            usuario = new Usuario();
            usuario.setDocumento(registroRequest.getDocumento());
            usuario.setNombres(registroRequest.getNombres());
            usuario.setApellidos(registroRequest.getApellidos());
            usuario.setCorreoElectronico(registroRequest.getCorreoElectronico());
            usuario.setContrasena(registroRequest.getContrasena());

            usuario = usuarioRepository.save(usuario);
        } else {
            usuario = null;
            System.out.println("El usuario existe");
        }
        return usuario;
    }

    public Usuario consultarPorCorreoElectronico(String correoElectronico) {
        return usuarioRepository.findByCorreoElectronico(correoElectronico);
    }

}


