package com.convertic.ConverTicShop.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "categoria")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor



public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre", length = 32, nullable = false)
    //@Max(value = 32, message = "Los nombres no deben tener mas de 32 caracteres")
    private String nombre;

    @OneToMany(mappedBy = "categoria")
    List<Producto> producto;



}
