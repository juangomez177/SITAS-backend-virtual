package com.udea.edu.co.busquedadevuelos.repository;

import com.udea.edu.co.busquedadevuelos.model.Aeropuerto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AeropuertoRepository extends JpaRepository<Aeropuerto, Long> {
}