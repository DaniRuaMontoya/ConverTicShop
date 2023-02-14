package com.convertic.ConverTicShop.controller;


import com.convertic.ConverTicShop.dto.UsuarioRequest;
import com.convertic.ConverTicShop.dto.UsuarioResponse;
import com.convertic.ConverTicShop.model.Usuario;
import com.convertic.ConverTicShop.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

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
@AllArgsConstructor
public class LoginController {


    private final UsuarioService usuarioService;

    @PostMapping("/login")
    public UsuarioResponse login (@RequestBody UsuarioRequest usuarioRequest){
        Usuario usuario = usuarioService.consultarPorCorreoElectronico(usuarioRequest.getCorreoElectronico());
        UsuarioResponse usuarioResponse = new UsuarioResponse();
        if (usuario == null){
            System.out.println("El usuario no existe");
            usuarioResponse.setAuntenticado(false);
        }else
        if (Objects.equals(usuarioRequest.getContrasena(), usuario.getContrasena())){
            System.out.println("El usuario se a logueado correctamente");
            usuarioResponse.setAuntenticado(true);
            usuarioResponse.setNombre(usuario.getNombres());
            usuarioResponse.setApellidos(usuario.getApellidos());
            usuarioResponse.setCorreoElectronico(usuario.getCorreoElectronico());
        }else {
            System.out.println("El usuario o la contraseña es incorrecta");
            usuarioResponse.setAuntenticado(false);
        }
        return usuarioResponse;
    }

}
