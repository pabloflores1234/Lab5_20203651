package com.example.lab5_20203651_lab.Repositories;

import com.example.lab5_20203651_lab.entity.Mascotas;
import com.example.lab5_20203651_lab.entity.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonasRepository extends JpaRepository<Personas,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM lugares.persona;")
    List<Personas> listaPersonas();
}
