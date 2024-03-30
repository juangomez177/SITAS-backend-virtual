package com.udea.edu.co.busquedadevuelos.backendvirtual.entities;

import java.sql.Timestamp;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vuelos")
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_vuelo", nullable = false)
    private String numeroVuelo;

    @Column(name = "tipo_vuelo", nullable = false)
    private String tipoVuelo;

    @Column(name = "id_aeropuerto_destino", nullable = false)
    private Long idAeropuertoDestino;

    @Column(name = "id_aeropuerto_origen", nullable = false)
    private Long idAeropuertoOrigen;

    @Column(name = "id_tipo_avion", nullable = false)
    private Long idTipoAvion;

    @Column(name = "fecha_salida")
    private Timestamp fechaSalida;

    @Column(name = "fecha_llegada")
    private Timestamp fechaLlegada;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "cantidad_pasajeros", nullable = false)
    private Integer cantidadPasajeros;

    @Column(name = "sobretasa", nullable = false)
    private Double sobretasa;

    @Column(name = "porcentaje_impuestos", nullable = false)
    private Double porcentajeImpuestos;

    @ManyToOne
    @JoinColumn(name = "id_aeropuerto_destino", insertable = false, updatable = false)
    private Aeropuerto destino;

    @ManyToOne
    @JoinColumn(name = "id_aeropuerto_origen", insertable = false, updatable = false)
    private Aeropuerto origen;

    
    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public Long getIdAeropuertoDestino() {
        return idAeropuertoDestino;
    }

    public void setIdAeropuertoDestino(Long idAeropuertoDestino) {
        this.idAeropuertoDestino = idAeropuertoDestino;
    }

    public Long getIdAeropuertoOrigen() {
        return idAeropuertoOrigen;
    }

    public void setIdAeropuertoOrigen(Long idAeropuertoOrigen) {
        this.idAeropuertoOrigen = idAeropuertoOrigen;
    }

    public Long getIdTipoAvion() {
        return idTipoAvion;
    }

    public void setIdTipoAvion(Long idTipoAvion) {
        this.idTipoAvion = idTipoAvion;
    }

    public Timestamp getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Timestamp fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Timestamp getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Timestamp fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(Integer cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public Double getSobretasa() {
        return sobretasa;
    }

    public void setSobretasa(Double sobretasa) {
        this.sobretasa = sobretasa;
    }

    public Double getPorcentajeImpuestos() {
        return porcentajeImpuestos;
    }

    public void setPorcentajeImpuestos(Double porcentajeImpuestos) {
        this.porcentajeImpuestos = porcentajeImpuestos;
    }

}