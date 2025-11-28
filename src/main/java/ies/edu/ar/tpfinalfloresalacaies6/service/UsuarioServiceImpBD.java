package ies.edu.ar.tpfinalfloresalacaies6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import ies.edu.ar.tpfinalfloresalacaies6.model.Usuario;
import ies.edu.ar.tpfinalfloresalacaies6.repository.UsuarioRepository;

@Primary
@Service
@Qualifier("servicioUsuarioMySQL")
public class UsuarioServiceImpBD implements UsuarioService {
    
    @Autowired
    Usuario nuevoUsuario;

    @Autowired
    UsuarioRepository usuarioRepository;


    @Override
    public void borrarUsuario(Integer dni) {
       usuarioRepository.deleteById(dni);
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarUsuario'");
    }

    public List<Usuario> listarTodosLosUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarUnUsuario(Integer dni) throws Exception {
        return usuarioRepository.findById(dni).orElseThrow(()-> new Exception("usuario no encontrado"));
        
    }

    @Override
    public Usuario buscarPorNombreDeUsuarios(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorNombreDeUsuarios'");
    }

    @Override
    public Usuario crearNuevoUsuario() {
        return nuevoUsuario;
    }

    @Override
    public List<Usuario> listarTodosLosUsuariosActivos() {
        return usuarioRepository.findByEstado(true);
    }

    @Override
    public Usuario buscarPorNombreDeUsuarios(Integer dni) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorNombreDeUsuarios'");
    }
}
