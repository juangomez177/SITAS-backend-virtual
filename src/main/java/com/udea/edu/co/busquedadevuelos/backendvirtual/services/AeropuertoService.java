package com.udea.edu.co.busquedadevuelos.backendvirtual.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.udea.edu.co.busquedadevuelos.backendvirtual.entities.Aeropuerto;
import com.udea.edu.co.busquedadevuelos.backendvirtual.repositories.AeropuertoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AeropuertoService {
    
    private final AeropuertoRepository aeropuertoRepository;

    public AeropuertoService(AeropuertoRepository aeropuertoRepository){
        this.aeropuertoRepository = aeropuertoRepository;
    }

    public List<Aeropuerto> findAeropuerto() {
        //List<Aeropuerto> aeropuertos = aeropuertoRepository.findAll();
        return aeropuertoRepository.findAll();
    }

}
