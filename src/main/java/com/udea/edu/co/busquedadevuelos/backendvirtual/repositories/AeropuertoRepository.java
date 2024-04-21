package com.udea.edu.co.busquedadevuelos.backendvirtual.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.udea.edu.co.busquedadevuelos.backendvirtual.entities.Aeropuerto;

@Repository
public interface AeropuertoRepository extends JpaRepository<Aeropuerto, String> {

    @Query("SELECT a.id AS id_aeropuerto, a.nombre AS nombre_aeropuerto, c.nombre AS nombre_ciudad, p.nombre AS nombre_pais " +
           "FROM Aeropuerto a " +
           "INNER JOIN a.ciudad c " +
           "INNER JOIN c.pais p")
    List<Object> listAeropuertos();       

    @Query("SELECT a.codigoIata AS codigo_iata, a.nombre AS nombre_aeropuerto, c.nombre AS nombre_ciudad, p.nombre AS nombre_pais " +
       "FROM Aeropuerto a " +
       "INNER JOIN a.ciudad c " +
       "INNER JOIN c.pais p " +
       "WHERE a.nombre = ?1")
    List<Object> findAeropuertoByNombre(String nombreAeropuerto);
    
}
