package com.convertic.ConverTicShop.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoDocumento")


public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tipo_documento")
    private int tipoDocumento;

}
