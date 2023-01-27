package com.convertic.ConverTicShop.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "producto")
@Getter
@Setter
@ToString

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producto")
    private int producto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "marca")
    private String marca;
    @Column(name = "color")
    private String color;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "precio")
    private float precio;
    @Column(name = "cantidad_vistas")
    private int cantidadVistas;
    @Column(name = "id_categoria")
    private int Categoria;
}
