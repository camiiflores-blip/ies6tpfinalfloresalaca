package ies.edu.ar.tpfinalfloresalacaies6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ies.edu.ar.tpfinalfloresalacaies6.model.Viaje;

@Repository
public interface ViajeRepository extends JpaRepository<Viaje , Integer>{
    
    // Si necesitas listar todos los viajes por algún criterio (e.g., TipoDeViaje), lo pondrías aquí
    // public List<Viaje> findByTipoDeViaje(TipoDeViaje tipo);
}
