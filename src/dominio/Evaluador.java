
package dominio;

import java.util.ArrayList;
import lectura.ArchivoGrabacion;
import lectura.ArchivoLectura;



public class Evaluador extends Persona{
    private String añoIngreso;

    public Evaluador(String añoIngreso, String nombre, String cedula, String direccion) {
        super(nombre, cedula, direccion);
        this.añoIngreso = añoIngreso;
    }
    
    
    public void setAñoIngreso(String añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public String getAñoIngreso() {
        return añoIngreso;
    }
    
        public String toFileString() {
        return getNombre() + ";" + getCedula() +";"+getDireccion()+";"+ añoIngreso;
    }
    
    public static Evaluador fromFileString(String fileString) {
        String[] parts = fileString.split(";");
        return new Evaluador(parts[0], parts[1],parts[2],parts[3]);
    }
     // Método para guardar el evaluador actual en un archivo
    public void guardar() {
        ArchivoGrabacion archivo = new ArchivoGrabacion("evaluadores.txt", true); // true para extender
        archivo.grabarLinea(this.toFileString());
        archivo.cerrar();
    }

    // Método static para leer todos los conocimientos de un archivo
    public static ArrayList<Evaluador> obtenerListaEvaluadores() {
        ArrayList<Evaluador> evaluadores = new ArrayList<>();
        ArchivoLectura archivo = new ArchivoLectura("evaluadores.txt");
        while (archivo.hayMasLineas()) {
            Evaluador evaluador = Evaluador.fromFileString(archivo.linea());
            evaluadores.add(evaluador);
        }
        archivo.cerrar();
        return evaluadores;
    }
    
    
    
}
