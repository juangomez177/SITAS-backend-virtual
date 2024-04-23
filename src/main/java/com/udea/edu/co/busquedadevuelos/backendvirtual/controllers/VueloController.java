package com.udea.edu.co.busquedadevuelos.backendvirtual.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.udea.edu.co.busquedadevuelos.backendvirtual.entities.Vuelo;
import com.udea.edu.co.busquedadevuelos.backendvirtual.services.VueloService;

import java.sql.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
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
    public ResponseEntity<List<Vuelo>> getAllflights() {
        try {
            List<Vuelo> vuelos = vueloService.getAllflights();
            return ResponseEntity.ok(vuelos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Vuelo>> getFlightsById(@PathVariable String id) {
        try {
            List<Vuelo> vuelos = vueloService.listarVuelosPorId(id);
            return ResponseEntity.ok(vuelos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/vuelos-ida")
    public ResponseEntity<List<Vuelo>> findVuelosIda(@RequestParam String origen,
                                                     @RequestParam String destino,
                                                     @RequestParam Date fechaSalida) {
        try {
            List<Vuelo> vuelos = vueloService.findVuelosIda(origen, destino, fechaSalida);
            return ResponseEntity.ok(vuelos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/vuelos-ida-vuelta")
    public ResponseEntity<List<Vuelo>> findVuelosIdaVuelta(@RequestParam String origen,
                                                           @RequestParam String destino,
                                                           @RequestParam Date fechaSalida,
                                                           @RequestParam Date fechaLlegada) {
        try {
            List<Vuelo> vuelos = vueloService.findVuelosIdaVuelta(origen, destino, fechaSalida, fechaLlegada);
            return ResponseEntity.ok(vuelos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}