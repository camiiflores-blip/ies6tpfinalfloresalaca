package ies.edu.ar.tpfinalfloresalacaies6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ies.edu.ar.tpfinalfloresalacaies6.model.TipoVehiculo;
import ies.edu.ar.tpfinalfloresalacaies6.model.TipoViaje;
import ies.edu.ar.tpfinalfloresalacaies6.model.Viaje;

@Service
public interface ViajeService {
     public void borraViaje(Integer idViaje) throws Exception;
    public Viaje agregarViaje(Viaje viaje);
    public void modificarViaje(Viaje viaje);
    public List<Viaje> listarTodosViajes();
    public Viaje buscarUnViaje(Integer idViaje) throws Exception;
    public Viaje crearNuevoViaje();
    public double calcularPrecio(TipoViaje tipoViaje, TipoVehiculo tipoVehiculo);
    
}
