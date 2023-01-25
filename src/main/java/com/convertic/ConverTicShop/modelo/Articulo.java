package com.convertic.ConverTicShop.modelo;


import jakarta.persistence.*;

@Entity
@Table(name = "Articulo")

public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_articulo")
    private int articulo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "marca")
    private String marca;
    @Column(name = "color")
    private String color;

}
