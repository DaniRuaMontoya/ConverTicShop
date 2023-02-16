package com.convertic.ConverTicShop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistroRequest {

    private Integer documento;
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String contrasena;
    private Integer tipoDocumento;

}
