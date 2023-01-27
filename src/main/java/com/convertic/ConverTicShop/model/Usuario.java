package com.convertic.ConverTicShop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@ToString

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que es autoincremental
    @Column(name = "id_usuario" )
    private int usuario;
    @Column(name = "documento")
    private int documento;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Column(name = "contrasena")
    private String contrasena;
    @Column(name = "id_tipo_documento")
    private int tipo_Documento;


}
