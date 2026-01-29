package ies.edu.ar.tpfinalfloresalacaies6.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Component
@Entity
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idViaje;

    @Enumerated(EnumType.STRING)
    @Column
    private TipoViaje tipoViaje;

    @Column
    private Double costo;

    @Column
    private LocalDate fechaViaje;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dni")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patente")
    private Vehiculo vehiculo;

    public Viaje() {
    }

    public Viaje(Integer idViaje, TipoViaje tipoViaje, Double costo, LocalDate fechaViaje, Usuario usuario,
            Vehiculo vehiculo) {
        this.idViaje = idViaje;
        this.tipoViaje = tipoViaje;
        this.costo = costo;
        this.fechaViaje = fechaViaje;
        this.usuario = usuario;
        this.vehiculo = vehiculo;
    }

    public Integer getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(Integer idViaje) {
        this.idViaje = idViaje;
    }

    public TipoViaje getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(TipoViaje tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    
}

    
