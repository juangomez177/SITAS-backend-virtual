package com.udea.edu.co.busquedadevuelos.backendvirtual.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.udea.edu.co.busquedadevuelos.backendvirtual.repositories.VueloRepository;
import com.udea.edu.co.busquedadevuelos.backendvirtual.entities.Vuelo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class VueloService {
    
    
    private final VueloRepository vueloRepository;

    public VueloService(VueloRepository vueloRepository){
        this.vueloRepository = vueloRepository;
    }

    public List<Vuelo> getAllflights(){
        var vuelos = vueloRepository.findAll();
        return vuelos;
    }

}
