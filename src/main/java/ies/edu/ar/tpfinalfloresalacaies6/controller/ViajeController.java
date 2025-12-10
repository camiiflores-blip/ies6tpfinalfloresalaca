package ies.edu.ar.tpfinalfloresalacaies6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ies.edu.ar.tpfinalfloresalacaies6.model.TipoVehiculo;
import ies.edu.ar.tpfinalfloresalacaies6.model.TipoViaje;
import ies.edu.ar.tpfinalfloresalacaies6.model.Viaje;
import ies.edu.ar.tpfinalfloresalacaies6.service.UsuarioService;
import ies.edu.ar.tpfinalfloresalacaies6.service.VehiculoService;
import ies.edu.ar.tpfinalfloresalacaies6.service.ViajeService;

@Controller
public class ViajeController {
    @Qualifier("servicioViajeMySQL")
    @Autowired
    ViajeService viajeService;

    @Qualifier("servicioVehiculoMySQL")
    @Autowired
    VehiculoService vehiculoService;

    @Qualifier("servicioUsuarioMySQL")
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/viaje/{patente}")
    public ModelAndView getViaje(@PathVariable("patente") Integer patente) throws Exception {


        ModelAndView carrito = new ModelAndView("viaje");
        
        ies.edu.ar.tpfinalfloresalacaies6.model.Viaje viajeNuevo = viajeService.crearNuevoViaje();
        
        viajeNuevo.setVehiculo(vehiculoService.buscarUnVehiculo(patente));
        
        carrito.addObject("nuevoViaje", viajeNuevo);
        
        carrito.addObject("listadoUsuario", usuarioService.listarTodosLosUsuariosActivos());
        return carrito;
    }

    @PostMapping("/guardarViaje")
    public ModelAndView saveViaje(@ModelAttribute("nuevoViaje") Viaje viajeParaGuardar) {

        ModelAndView modelAndView = new ModelAndView("ticketViaje");

        try {
            
            Integer patente = viajeParaGuardar.getVehiculo().getPatente();
            Integer dni = viajeParaGuardar.getUsuario().getDni();

            
            viajeParaGuardar.setVehiculo(vehiculoService.buscarUnVehiculo(patente));
            viajeParaGuardar.setUsuario(usuarioService.buscarUnUsuario(dni));

            
            TipoViaje tipoViaje = viajeParaGuardar.getTipoViaje();
            TipoVehiculo tipoVehiculo = viajeParaGuardar.getVehiculo().getTipoVehiculo();
            double precioFinal = viajeService.calcularPrecio(tipoViaje, tipoVehiculo);
            viajeParaGuardar.setCosto(precioFinal);

        
            Viaje viajeGuardado = viajeService.agregarViaje(viajeParaGuardar);

            
            modelAndView.addObject("viaje", viajeGuardado);

        } catch (Exception e) {
            modelAndView.setViewName("viaje"); // si hay error, vuelve al formulario
            modelAndView.addObject("errorViaje", "Error al guardar el viaje: " + e.getMessage());
        }

        return modelAndView;
    }

    
    @GetMapping("/listarViajes")
    public ModelAndView mostrarViajes() {
        ModelAndView carritoParaMostrarViajes = new ModelAndView("listaViaje");
        carritoParaMostrarViajes.addObject("listadoViajes", viajeService.listarTodosViajes());
        return carritoParaMostrarViajes;
    }

    
    @GetMapping("/realizarViajes")
    public ModelAndView listarviaje() {
        ModelAndView carritoParaMostrarVehiculos = new ModelAndView("realizarViaje");
        carritoParaMostrarVehiculos.addObject("listadoVehiculo", vehiculoService.listarTodosVehiculosActivos());
        return carritoParaMostrarVehiculos;
    }

}
    
