package com.udea.edu.co.busquedadevuelos.model;

import java.security.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "vuelos")
public class Vuelo<Aeropuerto> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroVuelo;
    private String tipoVuelo;
    @ManyToOne
    @JoinColumn(name = "id_aeropuerto_destino")
    private Aeropuerto aeropuertoDestino;
    @ManyToOne
    @JoinColumn(name = "id_aeropuerto_origen")
    private Aeropuerto aeropuertoOrigen;
    @Column(value = "id_tipo_avion")
    private Long idTipoAvion;
    private Timestamp fechaSalida;
    private Timestamp fechaLlegada;
    private Double precio;
    @Column(value = "cantidad_pasajeros")
    private Integer cantidadPasajeros;
    private Double sobretasa;
    @Column(value = "porcentaje_impuestos")
    private Double porcentajeImpuestos;


    

    public Vuelo() {
    }

    
    public Vuelo(Long id, String numeroVuelo, String tipoVuelo, Aeropuerto aeropuertoDestino,
            Aeropuerto aeropuertoOrigen, Long idTipoAvion, Timestamp fechaSalida, Timestamp fechaLlegada, Double precio,
            Integer cantidadPasajeros, Double sobretasa, Double porcentajeImpuestos) {
        this.id = id;
        this.numeroVuelo = numeroVuelo;
        this.tipoVuelo = tipoVuelo;
        this.aeropuertoDestino = aeropuertoDestino;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.idTipoAvion = idTipoAvion;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.precio = precio;
        this.cantidadPasajeros = cantidadPasajeros;
        this.sobretasa = sobretasa;
        this.porcentajeImpuestos = porcentajeImpuestos;
    }


    // Getters and setters
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
    public Aeropuerto getAeropuertoDestino() {
        return aeropuertoDestino;
    }
    public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }
    public Aeropuerto getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }
    public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
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
