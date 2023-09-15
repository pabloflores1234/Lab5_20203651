package com.example.lab5_20203651_lab.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "persona", schema = "lugares")
public class Personas {
    @Id
    @Column(name = "idPersona", nullable = false)
    private Integer idpersona;

    @Column(name = "nombre", nullable = true,length = 45)
    private String nombrepersona;

    @Column(name = "dni", nullable = true,length = 45)
    private String dni;


    @Column(name = "celular", nullable = true,length = 45)
    private String vacunado;

    @Column(name = "tipo_persona", nullable = true,length = 45)
    private String desparasitado;


}