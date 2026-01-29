package ies.edu.ar.tpfinalfloresalacaies6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ies.edu.ar.tpfinalfloresalacaies6.model.Usuario;
import ies.edu.ar.tpfinalfloresalacaies6.service.UsuarioService;

@Controller
public class UsuarioController {

    @Qualifier("servicioUsuarioMySQL")
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario")
    public ModelAndView getUsuario() {

       

        ModelAndView carrito = new ModelAndView("usuario");
        carrito.addObject("nuevoUsuario", usuarioService.crearNuevoUsuario());
        // carrito.addObject("nuevoUsuario", usuarioService.crearNuevoUsuario());
        carrito.addObject("band", false);
        return carrito;
    }

    @PostMapping("/guardarUsuario")
    public ModelAndView saveUsuario(@ModelAttribute("nuevoUsuario") Usuario usuarioParaGuardar) {

        usuarioService.agregarUsuario(usuarioParaGuardar);
        

        ModelAndView modelView = new ModelAndView("listaUsuario");
        
        modelView.addObject("listadoUsuario", usuarioService.listarTodosLosUsuarios());
        return modelView;

    }

    // ELIMINAR
    @GetMapping("/eliminarUsuario/{dni}")
    public ModelAndView eliminarUsuario(@PathVariable("dni") Integer dni) {
        ModelAndView carritoDeEliminar = new ModelAndView("listaUsuario"); // Nombre de la vista.
        usuarioService.borrarUsuario(dni);  // Llama al servicio para eliminar
        carritoDeEliminar.addObject("listadoUsuario", usuarioService.listarTodosLosUsuariosActivos()); // Recarga la lista
        return carritoDeEliminar;
    }

    //modificar
    @GetMapping("/modificarUsuario/{dni}")
    public ModelAndView buscarUsuarioParaModificar(@PathVariable("dni") Integer dni) throws Exception {
        ModelAndView carritoParaModificarUsuario = new ModelAndView("usuario");
        carritoParaModificarUsuario.addObject("nuevoUsuario", usuarioService.buscarUnUsuario(dni));
        carritoParaModificarUsuario.addObject("band", true);
        return carritoParaModificarUsuario;
    }

    @PostMapping("/modificarUsuario")
    public ModelAndView modificarUsuario(@ModelAttribute("nuevoUsuario") Usuario usuarioModificado){
        ModelAndView listadoEditado = new ModelAndView("listaUsuario");
        usuarioService.agregarUsuario(usuarioModificado);
        listadoEditado.addObject("listadoUsuario", usuarioService.listarTodosLosUsuarios());

        return listadoEditado;
    }

    @GetMapping("/listarUsuario")
    public ModelAndView listarUsuariosActivos() {
        ModelAndView carritoParaMostrarUsuarios = new ModelAndView("listaUsuario");
        carritoParaMostrarUsuarios.addObject("listadoUsuario", usuarioService.listarTodosLosUsuariosActivos());
        return carritoParaMostrarUsuarios;
    }

}
