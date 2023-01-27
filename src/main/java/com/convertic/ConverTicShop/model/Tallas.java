package com.convertic.ConverTicShop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tallas")
@Getter
@Setter
@ToString

public class Tallas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tallas")
    private int tallas;
    @Column(name = "nombres")
    private String nombres;

}
