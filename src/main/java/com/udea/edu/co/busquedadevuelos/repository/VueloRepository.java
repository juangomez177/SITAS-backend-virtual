package com.udea.edu.co.busquedadevuelos.repository;

import com.udea.edu.co.busquedadevuelos.model.Vuelo;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long> {
    List<Vuelo> findByOrigenAndDestino(String origen, String destino);
    List<Vuelo> findByFechaSalidaBetween(Timestamp fechaInicio, Timestamp fechaFin);
    List<Vuelo> findByPrecioBetween(Double precioMin, Double precioMax);
    List<Vuelo> findByFechaSalidaBetweenAndFechaLlegadaBetween(Timestamp horaSalidaMin, Timestamp horaSalidaMax,
                                                               Timestamp horaLlegadaMin, Timestamp horaLlegadaMax);
}