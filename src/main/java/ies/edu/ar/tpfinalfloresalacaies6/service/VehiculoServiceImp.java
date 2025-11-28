package ies.edu.ar.tpfinalfloresalacaies6.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ies.edu.ar.tpfinalfloresalacaies6.model.Vehiculo;

public class VehiculoServiceImp implements VehiculoService {

List<Vehiculo> listadoDeVehiculos = new ArrayList<Vehiculo>();

    @Autowired
    Vehiculo nuevoVehiculo;

    @Override
    public void borrarVehiculo(Integer patente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borrarVehiculo'");
    }

    @Override
    public void agregarVehiculo(Vehiculo vehiculo) {
    listadoDeVehiculos.add(vehiculo);
    System.out.println(listadoDeVehiculos.size());
    }

    @Override
    public void modificarVehiculo(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarVehiculo'");
    }

    @Override
    public List<Vehiculo> listarTodosVehiculos() {
        return listadoDeVehiculos;
    }

    @Override
    public Vehiculo buscarUnVehiculo(Integer patente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUnVehiculo'");
    }

    @Override
    public Vehiculo buscarPorNombreVehiculo(Integer patente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorNombreVehiculo'");
    }

    @Override
    public Vehiculo crearNuevoVehiculo() {
        return nuevoVehiculo; 
    }

    @Override
    public List<Vehiculo> listarTodosVehiculosActivos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodosVehiculosActivos'");
    }
    
}
