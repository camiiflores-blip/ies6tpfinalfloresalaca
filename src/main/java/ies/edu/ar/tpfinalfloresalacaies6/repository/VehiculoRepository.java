package ies.edu.ar.tpfinalfloresalacaies6.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ies.edu.ar.tpfinalfloresalacaies6.model.Vehiculo;

@Repository

public interface VehiculoRepository extends CrudRepository<Vehiculo,Integer>{

    List<Vehiculo> findByEstado(boolean b);

    
}