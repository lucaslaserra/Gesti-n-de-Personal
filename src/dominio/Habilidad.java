// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package dominio;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Objects;
import lectura.ArchivoGrabacion;

public class Habilidad implements Serializable {

    private String tema;
    private static final long serialVersionUID = 1L;
    private String descripcion;
    
    // Constructor, Get, Set, y Delete de Habilidad.
    public Habilidad(String tema, String descripcion) {
        this.tema = tema;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Este método convierte el objeto Conocimiento en una cadena para guardar en un archivo
    public String toFileString() {
        return tema + ";" + descripcion;
    }

    public static Habilidad fromFileString(String fileString) {
        String[] parts = fileString.split(";");
        return new Habilidad(parts[0], parts[1]);
    }

    @Override
    public String toString() {
        return tema;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag;
        if (this == obj) {
            flag = true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                flag = false;
            } else {
                Habilidad habilidad = (Habilidad) obj;
                return Objects.equals(getTema(), habilidad.getTema());
            }
        }
        return flag;
    }

    // Método para guardar el conocimiento actual en un archivo
    public void guardar() {
        ArchivoGrabacion archivo = new ArchivoGrabacion("habilidades.txt", true); // true para extender
        archivo.grabarLinea(this.toFileString());
        archivo.cerrar();
    }

    // Metodo para saber si existe habilidad
    public boolean existeHabilidad(Habilidad habilidad, Sistema sistema) {
        ArrayList<Habilidad> aux = sistema.obtenerListaHabilidades();
        boolean existe = false;
        if (!aux.isEmpty()) {
            for (Habilidad j : aux) {
                if ((j.getTema().toLowerCase()).equals(habilidad.getTema().toLowerCase())) {
                    existe = true;
                }
            }
        }
        return existe;
    }

}
