package dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import lectura.ArchivoGrabacion;
import lectura.ArchivoLectura;

public class Puesto {

    private String titulo;
    private String tipo;
    private ArrayList<String> habilidades;

    public Puesto(String titulo, String tipo) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.habilidades = new ArrayList<>();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String tipo) {
        this.tipo = tipo;
    }

    public  void setHabilidadesRequeridas(String habilidad) {
        this.habilidades.add(habilidad);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList<String> getHabilidadesRequeridas() {
        return habilidades;
    }
    public String toString(){
       return getTitulo();
     }
    // Este método convierte el objeto Puesto en una cadena para guardar en un archivo
    public String toFileString() {

        StringBuilder sb = new StringBuilder();
        sb.append(this.getTitulo() + ";" + this.getTipo() + ";");
        for (String j : habilidades) {
            sb.append(j)
              .append("-");
        }
        return sb.toString();
    }

    public static Puesto fromFileString(String fileString) {
        String[] parts = fileString.split(";");
        String [] habilidades = parts[2].split("-");
        Puesto puesto = new Puesto(parts[0], parts[1]);    
        for (int i =0; i < habilidades.length;i++){        
            puesto.setHabilidadesRequeridas(habilidades[i]);
        
        
        }
       
        return puesto;
    }

    // Método para guardar el puesto actual en un archivo
    public void guardar() {
        ArchivoGrabacion archivo = new ArchivoGrabacion("puestos.txt", true); // true para extender
        archivo.grabarLinea(this.toFileString());
        archivo.cerrar();
    }

    // Método para leer todos los conocimientos de un archivo
    public static ArrayList<Puesto> obtenerListaPuestos() {
        ArrayList<Puesto> puestos = new ArrayList<>();
        ArchivoLectura archivo = new ArchivoLectura("puestos.txt");
        while (archivo.hayMasLineas()) {
            Puesto puesto = Puesto.fromFileString(archivo.linea());
            puestos.add(puesto);
        }
        archivo.cerrar();
        return puestos;
    }

}
