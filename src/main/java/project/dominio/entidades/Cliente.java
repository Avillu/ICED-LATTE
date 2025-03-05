package project.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Cliente extends Usuario{
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column (unique = true)
    private String dni;

    public Cliente(String email, String pass,String nombre, String apellidos, String dni) {
        super (email, pass);
        this.nombre = nombre;
        this.apellidos=apellidos;
        this.dni=dni;
    }

    public Cliente() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
