package ies.edu.ar.tpfinalfloresalacaies6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ies.edu.ar.tpfinalfloresalacaies6.model.Vehiculo;
import ies.edu.ar.tpfinalfloresalacaies6.repository.VehiculoRepository;

@Service
@Qualifier("servicioVehiculoMySQL")
public class VehiculoServiceImpBD implements VehiculoService {

    @Autowired
    Vehiculo nuevoVehiculo;
    @Autowired
    VehiculoRepository vehiculoRepository;

    @Override
    public void borrarVehiculo(Integer patente) {
        vehiculoRepository.deleteById(patente);
    }

    @Override
    public void agregarVehiculo(Vehiculo vehiculo) {
         vehiculoRepository.save(vehiculo);
    }

    @Override
    public void modificarVehiculo(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarVehiculo'");
    }

    @Override
    public List<Vehiculo> listarTodosVehiculos() {
        return (List<Vehiculo>) vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo buscarUnVehiculo(Integer patente) {
        return vehiculoRepository.findById(patente).orElseThrow(() -> new RuntimeException("Vehiculo no encontrado con patente:" +patente));
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
        return vehiculoRepository.findByEstado(true);
    }

    
     
}
