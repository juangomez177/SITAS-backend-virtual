package com.udea.edu.co.busquedadevuelos.repository;

import com.udea.edu.co.busquedadevuelos.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {
}