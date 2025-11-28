package ies.edu.ar.tpfinalfloresalacaies6.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ies.edu.ar.tpfinalfloresalacaies6.model.Conductor;

@Repository
public interface ConductorRepository extends CrudRepository<Conductor,Integer> {

    java.util.List<Conductor> findByEstado(boolean b);

    
}
