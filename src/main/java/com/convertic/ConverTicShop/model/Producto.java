package com.convertic.ConverTicShop.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", length = 32, nullable = false)
    //@Max(value = 32, message = "El producto no debe tener mas de 32 caracteres")
    private String nombre;

    @Column(name = "descripcion",length = 254, nullable = false)
    private String descripcion;

    @Column(name = "marca", length = 32, nullable = false)
    private String marca;

    @Column(name = "color", length = 32, nullable = false)
    private String color;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "precio", nullable = false)
    private float precio;

    @Column(name = "cantidad_vistas")
    private int cantidadVistas;

    @OneToMany(mappedBy = "producto")
    List<Inventario> inventario;

    @ManyToOne
    private Categoria categoria;


}
