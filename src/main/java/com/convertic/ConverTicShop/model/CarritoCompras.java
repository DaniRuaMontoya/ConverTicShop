package com.convertic.ConverTicShop.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "carritoCompras")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CarritoCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    private Inventario inventario;
}
