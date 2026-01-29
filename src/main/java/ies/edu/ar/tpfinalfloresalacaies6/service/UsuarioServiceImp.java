package ies.edu.ar.tpfinalfloresalacaies6.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ies.edu.ar.tpfinalfloresalacaies6.model.Usuario;

@Service
@Qualifier("servicioUsuarioMySQL")
public class UsuarioServiceImp implements UsuarioService{


    List<Usuario> listadoDeUsuarios = new ArrayList<Usuario>();

    @Autowired
    Usuario nuevoUsuario;


    @Override
    public void borrarUsuario(Integer dni) {
        throw new UnsupportedOperationException("Unimplemented method 'borrarUsuario'");
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        listadoDeUsuarios.add(usuario);
        System.out.println(listadoDeUsuarios.size());
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Unimplemented method 'modificarUsuario'");
    }

    @Override
    public List<Usuario> listarTodosLosUsuarios() {
        return listadoDeUsuarios;
    }

    @Override
    public Usuario buscarUnUsuario(Integer dni) {
        throw new UnsupportedOperationException("Unimplemented method 'buscarUnUsuario'");
    }

    @Override
    public Usuario buscarPorNombreDeUsuarios(Integer dni) {
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorNombreUsuario");
    }

    @Override
    public Usuario crearNuevoUsuario() {
        //logica para crear nuevo usuario
        //Usuario nuevoUsuario = new Usuario();
        return nuevoUsuario;
    }

    @Override
    public List<Usuario> listarTodosLosUsuariosActivos() {
         // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodosUsuariosActivos'");

    }

    @Override
    public Usuario buscarPorNombreDeUsuarios(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorNombreDeUsuarios'");
    }
}
