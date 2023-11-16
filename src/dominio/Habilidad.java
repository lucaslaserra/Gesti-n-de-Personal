package dominio;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
import lectura.ArchivoGrabacion;
import lectura.ArchivoLectura;

public class Habilidad implements Serializable {

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
//    public boolean existeHabilidad(Habilidad habilidad) {
//        ArrayList<Habilidad> aux = obtenerListaHabilidades();
//        boolean existe = false;
//       if(!aux.isEmpty()) {  
//        for (Habilidad j : aux) {
//            if ((j.getTema().toLowerCase()).equals(habilidad.getTema().toLowerCase())) {
//                existe = true;
//            }
//        }
//       }
//        return existe;
//    }
    
    // Método para guardar el conocimiento actual en un archivo
    public void guardar() {
        ArchivoGrabacion archivo = new ArchivoGrabacion("habilidades.txt", true); // true para extender
        archivo.grabarLinea(this.toFileString());
        archivo.cerrar();
}

    // Método static para leer todos los conocimientos de un archivo
    public static ArrayList<Habilidad> obtenerListaHabilidades() {
        ArrayList<Habilidad> conocimientos = new ArrayList<>();
        ArchivoLectura archivo = new ArchivoLectura("habilidades.txt");
        while (archivo.hayMasLineas()) {
            Habilidad conocimiento = Habilidad.fromFileString(archivo.linea());
            conocimientos.add(conocimiento);
        }
        archivo.cerrar();
        return conocimientos;
    }

    public boolean existeHabilidad(Habilidad habilidad) {
        ArrayList<Habilidad> aux = obtenerListaHabilidades();
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
