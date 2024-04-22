package com.udea.edu.co.busquedadevuelos.backendvirtual.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.udea.edu.co.busquedadevuelos.backendvirtual.entities.Vuelo;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, String> {

    @Query("SELECT new com.udea.edu.co.busquedadevuelos.backendvirtual.entities.Vuelo(v.id, v.tipoVuelo, v.idAeropuertoDestino, v.idAeropuertoOrigen, v.idTipoAvion, v.fechaSalida, v.fechaLlegada, v.horaSalida, v.horaLlegada, v.precio, v.cantidadPasajeros, v.sobretasa, v.porcentajeImpuestos) FROM Vuelo v")
    List<Vuelo> findVuelosByFechaSalidaAndAeropuertos();

}
