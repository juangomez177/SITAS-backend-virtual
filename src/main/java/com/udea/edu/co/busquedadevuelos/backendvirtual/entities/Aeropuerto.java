package com.udea.edu.co.busquedadevuelos.backendvirtual.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "aeropuertos")
public class Aeropuerto {
    
    @Id
    @Column(name = "codigo_iata", nullable = false)
    private String codigoIata;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "id_ciudad", nullable = false)
    private Long idCiudad;

    @ManyToOne
    @JoinColumn(name = "id_ciudad", insertable = false, updatable = false)
    private Ciudad ciudad;

    
    // Getters y Setters

    public Aeropuerto(String codigoIata, String nombre, Long idCiudad) {
        this.codigoIata = codigoIata;
        this.nombre = nombre;
        this.idCiudad = idCiudad;
    }

    public Aeropuerto() {
    }

    public String getId() {
        return codigoIata;
    }

    public void setId(String codigoIata) {
        this.codigoIata = codigoIata;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Long idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    
    
}
