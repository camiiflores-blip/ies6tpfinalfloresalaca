package ies.edu.ar.tpfinalfloresalacaies6.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Component
@Entity
public class Vehiculo {
    @Id
    private Integer patente ;

    @Column
    private String marca;

    @Column
    private String modelo;
   
    @Column
    private String año;
    
    @Column
    @Enumerated(EnumType.STRING)
    private TipoVehiculo tipoVehiculo;

    @Column
    private String color;
    
    @Column
    private boolean estado = true;

    @OneToOne 
    private Conductor conductor;

    public Vehiculo() {
    }

    public Vehiculo(Integer patente, String marca, String modelo, String año, TipoVehiculo tipoVehiculo, String color, boolean estado) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipoVehiculo = tipoVehiculo;
        this.color = color;
        this.estado = estado;
    }

    public Integer getPatente() {
        return patente;
    }

    public void setPatente(Integer patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    




}
