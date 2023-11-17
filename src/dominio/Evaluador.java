
package dominio;

import java.io.Serializable;
import java.util.Date;

import lectura.ArchivoGrabacion;
import lectura.ArchivoLectura;



public class Evaluador extends Persona implements Serializable{
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
    
        public String toFileString() {
        return getNombre() + ";" + getCedula() +";"+getDireccion()+";"+ añoIngreso;
    }
    @Override
    public String toString(){
       return this.getNombre();
    }
    
  
     // Método para guardar el evaluador actual en un archivo
    public void guardar() {
        ArchivoGrabacion archivo = new ArchivoGrabacion("evaluadores.txt", true); // true para extender
        archivo.grabarLinea(this.toFileString());
        archivo.cerrar();
    }


    
    
    
}
