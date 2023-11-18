// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

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

}
