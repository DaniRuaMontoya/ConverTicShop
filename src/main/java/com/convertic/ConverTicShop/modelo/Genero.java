package com.convertic.ConverTicShop.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Genero")

public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "genero")
    private int genero;
    @Column(name = "hombre")
    private String hombre;
    @Column(name = "mujer")
    private String mujer;
}
