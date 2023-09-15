package com.example.lab5_20203651_lab.Repositories;

import com.example.lab5_20203651_lab.entity.Mascotas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MascotasRepository extends JpaRepository<Mascotas,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM lugares.mascotas;")
    List<Mascotas> listaMascotas();
}
