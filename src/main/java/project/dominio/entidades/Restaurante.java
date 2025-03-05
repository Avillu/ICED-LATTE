package project.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Restaurante extends Usuario{
    @Column
    private String nombre;
    @Column
    private String cif;

    public Restaurante(String email, String pass, String nombre, String cif) {
        super(email, pass);
        this.nombre = nombre;
        this.cif = cif;
    }

    public Restaurante() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
