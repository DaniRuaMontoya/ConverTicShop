package com.convertic.ConverTicShop.controller;

import com.convertic.ConverTicShop.dto.RegistroRequest;
import com.convertic.ConverTicShop.dto.RegistroResponse;
import com.convertic.ConverTicShop.model.Usuario;
import com.convertic.ConverTicShop.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@AllArgsConstructor
public class RegistroController {
    private final UsuarioService usuarioService;

    @PostMapping("/registro")
    public RegistroResponse registro(@RequestBody RegistroRequest registroRequest) {
        Usuario usuario = usuarioService.registrarUsuario(registroRequest);
        RegistroResponse registroResponse = new RegistroResponse();
        if (usuario == null) {
            registroResponse.setRegistrado(false);
            registroResponse.setMensaje("El usuario " + registroRequest.getCorreoElectronico() + " no se pudo registrar");
        } else {
            registroResponse.setRegistrado(true);
            registroResponse.setMensaje("El usuario " + registroRequest.getCorreoElectronico() + " se registró correctamente");
        }
        return registroResponse;
    }
}
