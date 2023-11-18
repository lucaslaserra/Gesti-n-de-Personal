// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package dominio;

import java.io.Serializable;
import java.util.Date;

import lectura.ArchivoGrabacion;
import lectura.ArchivoLectura;

public class Evaluador extends Persona implements Serializable {

    private Date añoIngreso;
    private static final long serialVersionUID = 1L;

    public Evaluador(Date añoIngreso, String nombre, String cedula, String direccion) {
        super(nombre, cedula, direccion);
        this.añoIngreso = añoIngreso;
    }

    public void setAñoIngreso(Date añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public Date getAñoIngreso() {
        return añoIngreso;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

}
