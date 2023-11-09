package dominio;


public class Conocimiento {
    private String tema;
    private int nivel; // Suponiendo que 1 es básico y 10 es experto

    public Conocimiento(String tema, int nivel) {
        this.tema = tema;
        this.nivel = nivel;
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

    @Override
    public String toString() {
        return "Conocimiento{" +
                "tema='" + tema + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}