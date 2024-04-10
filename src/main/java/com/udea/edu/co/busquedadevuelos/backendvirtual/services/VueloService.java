package com.udea.edu.co.busquedadevuelos.backendvirtual.services;


import java.util.List;
import java.time.LocalDateTime;
import java.util.Collections;
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

    public List<Vuelo> listarVuelosPorId(Long id) {
        List<Integer> ids = Collections.singletonList(id.intValue());
        return vueloRepository.findAllById(ids);
    }

    public List<Vuelo> listarVuelosIdaVuelta() {
        // Implementa la lógica para obtener los vuelos de ida y vuelta
        // Por ejemplo, podrías filtrar los vuelos por fecha de llegada igual a la fecha de salida más un día
        LocalDateTime fechaLlegada = LocalDateTime.now().plusDays(1); // Suponiendo que hoy es la fecha de salida
        return vueloRepository.findByFechaLlegada(fechaLlegada);
    }

}
