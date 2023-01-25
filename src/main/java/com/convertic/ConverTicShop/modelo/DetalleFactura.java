package com.convertic.ConverTicShop.modelo;


import jakarta.persistence.*;

@Entity
@Table(name = "DetalleFactura")


public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "detalle_factura")
    private int detalleFactura;
}
