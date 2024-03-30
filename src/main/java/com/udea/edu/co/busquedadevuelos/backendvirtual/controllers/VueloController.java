package com.udea.edu.co.busquedadevuelos.backendvirtual.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.udea.edu.co.busquedadevuelos.backendvirtual.entities.Vuelo;
import com.udea.edu.co.busquedadevuelos.backendvirtual.services.VueloService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/vuelos")
public class VueloController {
    
    private final VueloService vueloService;

    public VueloController(VueloService vueloService){
        this.vueloService = vueloService;
    }

    @GetMapping
    public ResponseEntity<List<Vuelo>> getAllflights(){
        var vuelos = vueloService.getAllflights();
        return ResponseEntity.ok(vuelos);
    }
}