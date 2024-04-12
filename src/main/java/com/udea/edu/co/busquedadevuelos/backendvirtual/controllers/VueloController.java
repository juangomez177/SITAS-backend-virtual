package com.udea.edu.co.busquedadevuelos.backendvirtual.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.udea.edu.co.busquedadevuelos.backendvirtual.entities.Vuelo;
import com.udea.edu.co.busquedadevuelos.backendvirtual.services.VueloService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("api/vuelos")
public class VueloController {
    
    private final VueloService vueloService;

    public VueloController(VueloService vueloService){
        this.vueloService = vueloService;
    }

    @GetMapping("listar")
    public ResponseEntity<List<Vuelo>> getAllflights(){
        var vuelos = vueloService.getAllflights();
        return ResponseEntity.ok(vuelos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Vuelo>> getFlightsById(@PathVariable Long id) {
        List<Vuelo> vuelos = vueloService.listarVuelosPorId(id);
        return ResponseEntity.ok(vuelos);
    }

    @GetMapping("/ida-vuelta")
    public ResponseEntity<List<Vuelo>> getRoundTripFlights() {
        List<Vuelo> vuelos = vueloService.listarVuelosIdaVuelta();
        return ResponseEntity.ok(vuelos);
    }
}