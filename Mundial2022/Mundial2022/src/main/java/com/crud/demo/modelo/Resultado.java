package com.crud.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
@Entity
@Data
public class Resultado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int goles;
    private int amarillas;
    private int rojas;
    
    @ManyToOne()
    @JoinColumn(name = "id")
    private Seleccion seleccion;

    @ManyToOne()
    @JoinColumn(name = "id")
    private Partido partido;


}
