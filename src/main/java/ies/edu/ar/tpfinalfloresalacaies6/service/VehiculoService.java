package ies.edu.ar.tpfinalfloresalacaies6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ies.edu.ar.tpfinalfloresalacaies6.model.Vehiculo;

@Service
public interface VehiculoService{

    public void borrarVehiculo (Integer patente);
    public void agregarVehiculo(Vehiculo vehiculo);
    public void modificarVehiculo(Vehiculo vehiculo);
    public List<Vehiculo> listarTodosVehiculos();
    public Vehiculo buscarUnVehiculo(Integer patente);
    public Vehiculo buscarPorNombreVehiculo(Integer patente);
    public Vehiculo crearNuevoVehiculo();
    public List<Vehiculo> listarTodosVehiculosActivos();

}

