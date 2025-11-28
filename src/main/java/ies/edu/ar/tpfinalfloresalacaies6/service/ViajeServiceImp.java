package ies.edu.ar.tpfinalfloresalacaies6.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ies.edu.ar.tpfinalfloresalacaies6.model.TipoVehiculo;
import ies.edu.ar.tpfinalfloresalacaies6.model.TipoViaje;
import ies.edu.ar.tpfinalfloresalacaies6.model.Viaje;

@Service
@Qualifier("servicioViajeMySQL")
public class ViajeServiceImp implements ViajeService{

     private List<Viaje> listadoViajes = new ArrayList<>();

     @Autowired
    Viaje nuevoViaje;

    @Override
    public void borraViaje(Integer idViaje) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borraViaje'");
    }

    @Override
    public Viaje agregarViaje(Viaje viaje) {
        listadoViajes.add(viaje);
        return viaje;
    }

    @Override
    public void modificarViaje(Viaje viaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarViaje'");
    }

    @Override
    public List<Viaje> listarTodosViajes() {
        return listadoViajes;
    }

    @Override
    public Viaje buscarUnViaje(Integer idViaje) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUnViaje'");
    }

    @Override
    public Viaje crearNuevoViaje() {
        return nuevoViaje;
    }

    @Override
    public double calcularPrecio(TipoViaje tipoViaje, TipoVehiculo tipoVehiculo) {
        double base = 0;

        //precio de la distancia
        switch (tipoViaje) {
            case CORTA:
                base = 7000;
                break;
            case MEDIA:
                base = 10000;
                break;
            case LARGA:
                base = 20000;
                break;    
            }

        //aumento

            double extra = 0;

        switch (tipoVehiculo) {
            case X:
                extra = 0;
                break;
            case LUXE:
                extra = 0.10;
                break;
            case PREMIUM:
                extra = 0.20;
                break;
        }

        return base + (base * extra);
    }
}
