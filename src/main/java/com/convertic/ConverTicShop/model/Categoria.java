package com.convertic.ConverTicShop.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "categoria")
@Getter
@Setter
@ToString

public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_categoria")
    private int categoria;
    @Column(name = "nombre")
    private String nombre;




}
