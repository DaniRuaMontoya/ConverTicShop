package com.convertic.ConverTicShop.modelo;


import jakarta.persistence.*;

@Entity
@Table(name = "Inventario")


public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_inventario")
    private int inventario;
    @Column(name = "cantidad")
    private int cantidad;



}
