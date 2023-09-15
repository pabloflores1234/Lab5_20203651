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
@Table(name = "mascotas", schema = "lugares")
public class Mascotas {
    @Id
    @Column(name = "idMascotas", nullable = false)
    private Integer id;

    @Column(name = "nombre_mascota", nullable = true,length = 45)
    private String nombre_mascota;

    @Column(name = "genero", nullable = true,length = 45)
    private String genero;

    @Column(name = "edad", nullable = true,length = 45)
    private String edad;

    @Column(name = "fecha_nacimiento", nullable = true,length = 45)
    private String fecha_nacimiento;

    @Column(name = "Vacunado", nullable = true,length = 45)
    private String vacunado;

    @Column(name = "Desparasitado", nullable = true,length = 45)
    private String desparasitado;

    @ManyToOne
    @JoinColumn(name="Persona_idPersona")
    private Personas persona;

}