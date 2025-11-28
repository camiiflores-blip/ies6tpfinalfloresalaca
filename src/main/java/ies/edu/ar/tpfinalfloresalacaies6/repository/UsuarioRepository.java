package ies.edu.ar.tpfinalfloresalacaies6.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ies.edu.ar.tpfinalfloresalacaies6.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Integer>{

    Object findAll = null;

    public List<Usuario> findByEstado(boolean estado);
    
}