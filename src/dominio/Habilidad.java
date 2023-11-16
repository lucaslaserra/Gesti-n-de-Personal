package dominio;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
import lectura.ArchivoGrabacion;
import lectura.ArchivoLectura;

public class Habilidad implements Serializable {
    private Sistema miSistema;
    private String tema;
    private static final long serialVersionUID = 1L;
    private String descripcion;

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

    // Método para guardar el conocimiento actual en un archivo
    public void guardar() {
        ArchivoGrabacion archivo = new ArchivoGrabacion("habilidades.txt", true); // true para extender
        archivo.grabarLinea(this.toFileString());
        archivo.cerrar();
    }

   

    public boolean existeHabilidad(Habilidad habilidad, Sistema sistema) {
        ArrayList<Habilidad> aux = sistema.obtenerListaHabilidades();
        boolean existe = false;
       if(!aux.isEmpty()) {  
        for (Habilidad j : aux) {
            if ((j.getTema().toLowerCase()).equals(habilidad.getTema().toLowerCase())) {
                existe = true;
            }
        }
       }
        return existe;
    }
    
}
