package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVeiculo")
    private int idVeiculo;

    @Column(name = "modelo_FK")
    private int modeloFK;

    private int ano;
    private String cor;
    private double preco;

    @Column(name = "quilometragem")
    private int km;

    private String status;
}
