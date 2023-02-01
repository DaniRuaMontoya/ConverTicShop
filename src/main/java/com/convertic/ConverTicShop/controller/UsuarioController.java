package com.convertic.ConverTicShop.controller;


import com.convertic.ConverTicShop.model.Usuario;
import com.convertic.ConverTicShop.service.UsuarioInterface;
import com.convertic.ConverTicShop.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Define que es un controlador
@RequestMapping("/api/usuario") // Indica la ruta del endpoint
@AllArgsConstructor // Genera un constructor vacio

//@RequestBody, para que se puede mapear el objeto jeison a la clase java
//Esto se hace porque los microservicios van a enviar información en jeison
//El @PostMapping Indica que va a hacer un método expuesto para que lo consuma otro microservicio

public class UsuarioController {
    private final UsuarioInterface usuarioService;

    @PostMapping
    public Usuario saveUsuario(@RequestBody Usuario usuario){

        return usuarioService.saveUsuario(usuario);
    }
}
