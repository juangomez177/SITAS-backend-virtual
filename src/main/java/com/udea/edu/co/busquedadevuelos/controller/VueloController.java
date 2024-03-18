package com.udea.edu.co.busquedadevuelos.controller;

import com.udea.edu.co.busquedadevuelos.model.Vuelo;
import com.udea.edu.co.busquedadevuelos.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VueloController {

    @Autowired
    private VueloService vueloService;

    @GetMapping("/vuelos")
    public String listaDeVuelos(Model model) {
        List<Vuelo> vuelos = vueloService.getAllVuelos();
        model.addAttribute("vuelos", vuelos);
        return "listaVuelos"; // Debes crear una vista llamada listaVuelos.html para mostrar la lista de vuelos
    }
}