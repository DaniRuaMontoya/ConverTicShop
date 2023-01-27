package com.convertic.ConverTicShop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tipoDocumento")
@Getter
@Setter
@ToString

public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tipo_documento")
    private int tipoDocumento;
    @Column(name = "nombre")
    private String nombre;

}
