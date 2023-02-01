package com.convertic.ConverTicShop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tallas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Tallas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombres", nullable = false)
    //@Max(value = 4, message = "Las tallas no deben tener mas de 4 caracteres")
    private String nombres;

    @OneToMany(mappedBy = "tallas")
    List<Inventario> inventario;

}
