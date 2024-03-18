package com.udea.edu.co.busquedadevuelos.repository;

import com.udea.edu.co.busquedadevuelos.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long> {
}