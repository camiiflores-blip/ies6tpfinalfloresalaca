package ies.edu.ar.tpfinalfloresalacaies6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import ies.edu.ar.tpfinalfloresalacaies6.model.TipoVehiculo;
import ies.edu.ar.tpfinalfloresalacaies6.model.TipoViaje;
import ies.edu.ar.tpfinalfloresalacaies6.model.Viaje;
import ies.edu.ar.tpfinalfloresalacaies6.repository.ViajeRepository;

@Service
@Primary
@Qualifier("servicioViajeMySQL")
public class ViajeServiceImpBD implements ViajeService {

    @Autowired
    Viaje nuevoViaje;

    @Autowired
    ViajeRepository viajeRepository;

    @Override
    public void borraViaje(Integer idViaje) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borraViaje'");
    }

    @Override
    public Viaje agregarViaje(Viaje viaje) {
        return viajeRepository.save(viaje);
    }
    

    @Override
    public void modificarViaje(Viaje viaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarViaje'");
    }

    @Override
    public List<Viaje> listarTodosViajes() {
        return viajeRepository.findAll();
    }

    @Override
    public Viaje buscarUnViaje(Integer idViaje) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUnViaje'");
    }

    @Override
    public Viaje crearNuevoViaje() {
        return new Viaje();
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
