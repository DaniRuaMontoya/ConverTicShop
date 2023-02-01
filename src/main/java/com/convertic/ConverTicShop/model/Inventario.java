package com.convertic.ConverTicShop.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "inventario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cantidad")
    private int cantidad;

    @ManyToOne
    private Producto producto;

    @ManyToOne
    private Tallas tallas;

    @OneToMany(mappedBy = "inventario")
    List<CarritoCompras> carritoCompras;

}
