package com.convertic.ConverTicShop.modelo;


import jakarta.persistence.*;

@Entity
@Table(name = "Factura")


public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_factura")
    private int factura;
    @Column(name = "cliente")
    private int cliente;




}
