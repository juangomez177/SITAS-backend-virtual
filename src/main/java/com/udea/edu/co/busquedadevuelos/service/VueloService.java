package com.udea.edu.co.busquedadevuelos.service;

import com.udea.edu.co.busquedadevuelos.model.Vuelo;
import com.udea.edu.co.busquedadevuelos.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class VueloService {

    @Autowired
    private VueloRepository vueloRepository;

    public List<Vuelo> getAllVuelos() {
        return vueloRepository.findAll();
    }

    public Optional<Vuelo> getVueloById(Long id) {
        return vueloRepository.findById(id);
    }

    public Vuelo saveVuelo(Vuelo vuelo) {
        return vueloRepository.save(vuelo);
    }

    public void deleteVuelo(Long id) {
        vueloRepository.deleteById(id);
    }

    public List<Vuelo> getByOrigenAndDestino(String origen, String destino) {
        return vueloRepository.findByOrigenAndDestino(origen, destino);
    }

    public List<Vuelo> getByFechaSalidaBetween(Timestamp fechaInicio, Timestamp fechaFin) {
        return vueloRepository.findByFechaSalidaBetween(fechaInicio, fechaFin);
    }

    public List<Vuelo> getByPrecioBetween(Double precioMin, Double precioMax) {
        return vueloRepository.findByPrecioBetween(precioMin, precioMax);
    }

    public List<Vuelo> getByHoraSalidaBetweenAndHoraLlegadaBetween(Timestamp horaSalidaMin, Timestamp horaSalidaMax,
                                                                    Timestamp horaLlegadaMin, Timestamp horaLlegadaMax) {
        return vueloRepository.findByFechaSalidaBetweenAndFechaLlegadaBetween(horaSalidaMin, horaSalidaMax,
                                                                              horaLlegadaMin, horaLlegadaMax);
    }
}
