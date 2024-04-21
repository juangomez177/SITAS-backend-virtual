package com.udea.edu.co.busquedadevuelos.backendvirtual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.edu.co.busquedadevuelos.backendvirtual.entities.TipoAeronave;

@Repository
public interface TipoVueloRepository extends JpaRepository<TipoAeronave, Long> {
    
}
