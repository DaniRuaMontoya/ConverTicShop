package com.convertic.ConverTicShop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponse {

    private boolean auntenticado;
    private String correoElectronico;
    private String nombre;
    private String apellidos;
}
