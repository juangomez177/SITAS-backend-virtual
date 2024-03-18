package com.udea.edu.co.busquedadevuelos.service;

import com.udea.edu.co.busquedadevuelos.model.Pais;
import com.udea.edu.co.busquedadevuelos.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> getAllPaises() {
        return paisRepository.findAll();
    }

    public Optional<Pais> getPaisById(Long id) {
        return paisRepository.findById(id);
    }

    public Pais savePais(Pais pais) {
        return paisRepository.save(pais);
    }

    public void deletePais(Long id) {
        paisRepository.deleteById(id);
    }
}