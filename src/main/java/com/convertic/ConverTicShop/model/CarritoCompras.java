package com.convertic.ConverTicShop.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "carritoCompras")
@Getter
@Setter
@ToString

public class CarritoCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_carrito_compras")
    private int carritoCompras;
    @Column(name = "id_inventario")
    private int inventario;

}
