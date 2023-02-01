package com.convertic.ConverTicShop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;


@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor // Constructor Vacío//
@AllArgsConstructor // Constructor Lleno//
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que es autoincremental en base de datos
    @Column(name = "id")
    private Integer id;

    // length nos dice la cantidad de numeros. validación para BD//
    // nullable para que siempre el campo este lleno. validación para BD//
    @Column(name = "documento", length = 10, nullable = false)
    private Integer documento;

    //Max son validaciones contra el negocio, esto lo piden en el reto//
    @Column(name = "nombres", length = 32, nullable = false)// de cara a la BD
    //@Max(value = 32, message = "Los nombres no deben tener mas de 32 caracteres")// validacion de cara a los datos que pueden llegar
    private String nombres;

    @Column(name = "apellidos", length = 32, nullable = false)
    //@Max(value = 32, message = "Los apellidos no deben tener mas de 32 caracteres")
    private String apellidos;

    @Column(name = "correo_electronico", nullable = false)
    @Email(message = "El correo no es válido")//Valiación para BD//
    private String correoElectronico;

    @Column(name = "contrasena", nullable = false)
    //@Min(value = 5, message = "La contraseña debe tener mas de 5 caracteres")// desde los atributos//
    private String contrasena;


    @OneToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumento tipoDocumento;




}
