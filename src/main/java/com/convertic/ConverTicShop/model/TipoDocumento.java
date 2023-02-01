package com.convertic.ConverTicShop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.*;

@Entity
@Table(name = "tipoDocumento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false)
    //@Max(value = 32, message = "El tipo de documento no debe tener mas de 32 caracteres")
    private String nombre;

    @OneToOne(mappedBy = "tipoDocumento")
    private Usuario usuario;



}
