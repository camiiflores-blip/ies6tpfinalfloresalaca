package ies.edu.ar.tpfinalfloresalacaies6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ies.edu.ar.tpfinalfloresalacaies6.model.Usuario;

@Service
public interface UsuarioService {
    
    //declaracion de metodos
    //nominativo solo nombre

    public void borrarUsuario(Integer dni);
    public void agregarUsuario(Usuario usuario);
    public void modificarUsuario(Usuario usuario);
    public List<Usuario> listarTodosLosUsuarios();
    public Usuario buscarUnUsuario(Integer dni) throws Exception;
    public Usuario buscarPorNombreDeUsuarios(String nombre);
    public Usuario crearNuevoUsuario();
    public List<Usuario> listarTodosLosUsuariosActivos();
    Usuario buscarPorNombreDeUsuarios(Integer dni);
}
