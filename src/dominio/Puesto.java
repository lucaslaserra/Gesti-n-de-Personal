package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.*;


public class Puesto implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String tipo;
    private ArrayList<Habilidad> habilidades;

    public Puesto(String titulo, String tipo) {
        this.nombre = titulo;
        this.tipo = tipo;
        this.habilidades = new ArrayList<>();
    }

    public void setTitulo(String titulo) {
        this.nombre = titulo;
    }

    public void setDescripcion(String tipo) {
        this.tipo = tipo;
    }

    public  void setHabilidadesRequeridas(Habilidad habilidad) {
        this.habilidades.add(habilidad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList<Habilidad> getHabilidadesRequeridas() {
        return habilidades;
    }
    public String toString(){
       return getNombre();
     }
    
     @Override
     public boolean equals(Object obj) {
         Puesto puesto = (Puesto) obj;
        return puesto.getTipo() == this.getTipo();
    }
    // Este método convierte el objeto Puesto en una cadena para guardar en un archivo
  

//    public static Puesto fromFileString(String fileString) {
//        String[] parts = fileString.split(";");
//        String [] habilidades = parts[2].split("-");
//        Puesto puesto = new Puesto(parts[0], parts[1]);    
//        for (int i =0; i < habilidades.length;i++){        
//            puesto.setHabilidadesRequeridas(habilidades[i]);
//        
//        
//        }
//       
//        return puesto;
//    }

    // Método para guardar el puesto actual en un archivo
//    public void guardar() {
//        ArchivoGrabacion archivo = new ArchivoGrabacion("puestos.txt", true); // true para extender
//        archivo.grabarLinea(this.toFileString());
//        archivo.cerrar();
//    }

    // Método para leer todos los conocimientos de un archivo
//    public static ArrayList<Puesto> obtenerListaPuestos() {
//        ArrayList<Puesto> puestos = new ArrayList<>();
//        ArchivoLectura archivo = new ArchivoLectura("puestos.txt");
//        while (archivo.hayMasLineas()) {
//            Puesto puesto = Puesto.fromFileString(archivo.linea());
//            puestos.add(puesto);
//        }
//        archivo.cerrar();
//        return puestos;
//    }

}
