package com.udea.edu.co.busquedadevuelos.repository;

import com.udea.edu.co.busquedadevuelos.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
}

