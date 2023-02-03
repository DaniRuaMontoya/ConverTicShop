package com.convertic.ConverTicShop.controller;


import ch.qos.logback.core.model.Model;
import com.convertic.ConverTicShop.model.Usuario;
import com.convertic.ConverTicShop.service.UsuarioInterface;
import com.convertic.ConverTicShop.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController Define que es un controlador
//@RequestMapping Indica la ruta del endpoint
//@AllArgsConstructo Genera un constructor vacio
//@RequestBody, para que se puede mapear el objeto jeison a la clase java.
//Esto se hace porque los microservicios van a enviar información en jeison.
//El @PostMapping Indica que va a hacer un método expuesto para que lo consuma otro microservicio. el el crud de crear usuario.
//@Autowired para poder inyectar en nuestro controlador el servicio.
// Utilizamos UsuarioInterface en el método para traer el contraro que hicimos en la interface de UsuarioInterface.
// Endpoint: Un endpoint es cualquier dispositivo que está conectado a una red informática.

@RestController
@RequestMapping("/api")
@AllArgsConstructor



public class UsuarioController {

    @Autowired
    private  UsuarioService usuarioService;

    @GetMapping // metodo GET para posatman
    public List<Usuario> usuarioList(){
        return usuarioService.listaUsuario();
    }


    @PostMapping("/registrar")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioService.registrar(usuario);
    }
}
