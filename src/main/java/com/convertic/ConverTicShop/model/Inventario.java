package com.convertic.ConverTicShop.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "inventario")
@Getter
@Setter
@ToString

public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_inventario")
    private int inventario;
    @Column(name = "id_producto")
    private int producto;
    @Column(name = "id_tallas")
    private int tallas;
    @Column(name = "cantidad")
    private int cantidad;



}
