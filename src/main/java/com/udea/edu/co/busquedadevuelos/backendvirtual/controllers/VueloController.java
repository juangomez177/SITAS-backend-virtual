package com.udea.edu.co.busquedadevuelos.backendvirtual.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.udea.edu.co.busquedadevuelos.backendvirtual.entities.Vuelo;
import com.udea.edu.co.busquedadevuelos.backendvirtual.services.VueloService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

    @GetMapping("/vuelos-ida")
    public ResponseEntity<List<Vuelo>> findVuelosByFechaSalidaAndAeropuertos(@RequestParam String fechaSalida, 
                                                                              @RequestParam String nombreAeropuertoOrigen, 
                                                                              @RequestParam String nombreAeropuertoDestino) {
        List<Vuelo> vuelos = vueloService.findVuelosByFechaSalidaAndAeropuertos();
        return ResponseEntity.ok(vuelos);
    }
}