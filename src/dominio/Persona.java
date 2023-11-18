// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package dominio;

import interfaz.*;
import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private String cedula;
    private String direccion;
    private static final long serialVersionUID = 1L;

    public Persona(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{"
                + "nombre='" + nombre + '\''
                + ", cedula='" + cedula + '\''
                + '}';
    }

}
