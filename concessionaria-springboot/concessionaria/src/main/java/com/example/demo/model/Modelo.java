package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "modelo")
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idModelo")
    private int idModelo;

    private String nome;

    @Column(name = "marca_FK")
    private int marcaFK;
}
