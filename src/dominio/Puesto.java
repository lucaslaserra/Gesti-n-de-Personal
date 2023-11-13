
package dominio;

import java.util.HashMap;

public class Puesto {
    private String titulo;
    private String descripcion;
    private HashMap<Habilidad, Integer> conocimientosRequeridos;

    public Puesto(String titulo, String descripcion, HashMap<Habilidad, Integer> conocimientosRequeridos) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.conocimientosRequeridos = conocimientosRequeridos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setConocimientosRequeridos(HashMap<Habilidad, Integer> conocimientosRequeridos) {
        this.conocimientosRequeridos = conocimientosRequeridos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public HashMap<Habilidad, Integer> getConocimientosRequeridos() {
        return conocimientosRequeridos;
    }
    
    
}
