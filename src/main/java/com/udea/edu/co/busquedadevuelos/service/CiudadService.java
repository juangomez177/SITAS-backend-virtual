package com.udea.edu.co.busquedadevuelos.service;

import com.udea.edu.co.busquedadevuelos.model.Ciudad;
import com.udea.edu.co.busquedadevuelos.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    public List<Ciudad> getAllCiudades() {
        return ciudadRepository.findAll();
    }

    public Optional<Ciudad> getCiudadById(Long id) {
        return ciudadRepository.findById(id);
    }

    public Ciudad saveCiudad(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    public void deleteCiudad(Long id) {
        ciudadRepository.deleteById(id);
    }
}