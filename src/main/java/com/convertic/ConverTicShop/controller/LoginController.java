package com.convertic.ConverTicShop.controller;


import com.convertic.ConverTicShop.dto.UsuarioRequest;
import com.convertic.ConverTicShop.dto.UsuarioResponse;
import com.convertic.ConverTicShop.model.Usuario;
import com.convertic.ConverTicShop.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@AllArgsConstructor
public class LoginController {
    private final UsuarioService usuarioService;

    @PostMapping("/login")
    public UsuarioResponse login(@RequestBody UsuarioRequest usuarioRequest) {
        Usuario usuario = usuarioService.consultarPorCorreoElectronico(usuarioRequest.getCorreoElectronico());
        UsuarioResponse usuarioResponse = new UsuarioResponse();
        if (usuario == null) {
            System.out.println("El usuario no existe");
            usuarioResponse.setAuntenticado(false);
        } else if (Objects.equals(usuarioRequest.getContrasena(), usuario.getContrasena())) {
            System.out.println("El usuario se a logueado correctamente");
            usuarioResponse.setAuntenticado(true);
            usuarioResponse.setNombre(usuario.getNombres());
            usuarioResponse.setApellidos(usuario.getApellidos());
            usuarioResponse.setCorreoElectronico(usuario.getCorreoElectronico());
        } else {
            System.out.println("El usuario o la contraseña es incorrecta");
            usuarioResponse.setAuntenticado(false);
        }
        return usuarioResponse;
    }

}
