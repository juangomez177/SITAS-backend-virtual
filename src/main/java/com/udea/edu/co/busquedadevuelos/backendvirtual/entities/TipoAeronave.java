package com.udea.edu.co.busquedadevuelos.backendvirtual.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_aeronave")
public class TipoAeronave {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "cantidad_max_asientos", nullable = false)
    private Integer canMaximaAsientos;


    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCanMaximaAsientos() {
        return canMaximaAsientos;
    }

    public void setCanMaximaAsientos(Integer canMaximaAsientos) {
        this.canMaximaAsientos = canMaximaAsientos;
    }

    public TipoAeronave(Long id, String tipo, Integer canMaximaAsientos) {
        this.id = id;
        this.tipo = tipo;
        this.canMaximaAsientos = canMaximaAsientos;
    }

    public TipoAeronave() {
    }

    
}
