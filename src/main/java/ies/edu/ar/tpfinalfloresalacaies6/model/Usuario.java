package ies.edu.ar.tpfinalfloresalacaies6.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Component
@Entity
public class Usuario {

    //atributos
    // tipo de datos envoltorios (int Integer, double Double, boolean Boolean)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    private Integer dni;
    @Column
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 3, max = 20, message = "El nombre debe tener entre 3 y 20 caracteres")
    private String Nombre;
    @Column
    @NotBlank (message = "apellido es requerido")
    @Size (min = 4, max = 20, message = "debe tener mas de 4 letras y menos de 10")
    private String apellido;
    @Column
    private String correoElectronico;
    @Column
    private String telefono;
    @Column
    private LocalDate fechaDeNacimiento;
    @Column
    private Boolean estado = true;

    public Usuario() {
    }

    public Usuario(Integer dni,
            @NotBlank(message = "El nombre es obligatorio") @Size(min = 3, max = 20, message = "El nombre debe tener entre 3 y 20 caracteres") String nombre,
            @NotBlank(message = "apellido es requerido") @Size(min = 4, max = 20, message = "debe tener mas de 4 letras y menos de 10") String apellido,
            String correoElectronico, String telefono, LocalDate fechaDeNacimiento, Boolean estado) {
        this.dni = dni;
        this.Nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


}
