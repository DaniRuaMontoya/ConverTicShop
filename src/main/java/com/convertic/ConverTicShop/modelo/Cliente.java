package com.convertic.ConverTicShop.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Indica que es autoincremental
    @Column(name = "id_cedula" )
    private int cedula;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Column(name = "contrasena")
    private String contrasena;

    /*@OneToMany
    @JoinColumn(name = "id_factura")
    private Factura factura; // clase de tipo objeto que vamos a relacionar*/



}
