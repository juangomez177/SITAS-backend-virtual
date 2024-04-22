package com.udea.edu.co.busquedadevuelos.backendvirtual.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.udea.edu.co.busquedadevuelos.backendvirtual.entities.Aeropuerto;

@Repository
public interface AeropuertoRepository extends JpaRepository<Aeropuerto, String> {

    @Query("SELECT a FROM Aeropuerto a " +
       "INNER JOIN FETCH a.ciudad c " +
       "INNER JOIN FETCH c.pais p")
    List<Object> listAeropuertos();       

    @Query("SELECT a FROM Aeropuerto a " +
       "INNER JOIN FETCH a.ciudad c " +
       "INNER JOIN FETCH c.pais p " +
       "WHERE a.nombre = ?1")
    List<Object> findAeropuertoByNombre(String nombreAeropuerto);
    
}
