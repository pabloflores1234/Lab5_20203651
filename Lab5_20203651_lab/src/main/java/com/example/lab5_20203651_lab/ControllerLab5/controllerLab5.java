package com.example.lab5_20203651_lab.ControllerLab5;


import com.example.lab5_20203651_lab.Repositories.MascotasRepository;
import com.example.lab5_20203651_lab.Repositories.PersonasRepository;
import com.example.lab5_20203651_lab.entity.Mascotas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class controllerLab5 {


    final MascotasRepository mascotasRepository;
    final PersonasRepository personasRepository;
    public controllerLab5(MascotasRepository mascotasRepository, PersonasRepository personasRepository){
        this.mascotasRepository = mascotasRepository;
        this.personasRepository = personasRepository;
    }


    @GetMapping("/TravelCan")
    public String paginaprincipal(Model model){
        return "pagPrincipal";
    }
    @GetMapping("/Viajes")
    public String pagViajes(Model model){
        return "Viajes";
    }
    @GetMapping("/Mascotas")
    public String pagMascotas(Model model){
        List<Mascotas> listaMascotas = mascotasRepository.listaMascotas();
        model.addAttribute("listaMascotas",listaMascotas);
        return "Mascotas";
    }

    @GetMapping("/Lugares")
    public String pagLugares(Model model){
        return "Lugares";
    }

    @GetMapping("/nuevaMascota")
    public String pagnuevaMascota(Model model){
        return "NuevaMascota";
    }
    @PostMapping("/nuevaMascota")
    public String nuevaMascota(Model model){
        return "redirect:/Mascotas";
    }
}
