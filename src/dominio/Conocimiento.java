package dominio;


public class Conocimiento {
    private String tema;
    private int nivel; // Suponiendo que 1 es básico y 10 es experto
    private String descripcion;

    public Conocimiento(String tema, int nivel,String descripcion) {
        this.tema = tema;
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

  

    // Getters y setters
    public String getTema() {
        return tema;
    }
    

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = Math.max(1, Math.min(10, nivel)); // Asegurar que el nivel esté entre 1 y 10
    }
     
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Conocimiento{" +
                "tema='" + tema + '\'' +
                ", nivel=" + nivel + ",descripción=" + descripcion+
                '}';
    }
}