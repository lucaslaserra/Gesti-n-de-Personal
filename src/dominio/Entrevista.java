// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package dominio;

import java.io.Serializable;
import lectura.ArchivoGrabacion;

public class Entrevista implements Serializable {

    private static final long serialVersionUID = 1L;
    private Postulante postulante;
    private Evaluador evaluador;
    private String comentarios;
    private int id;
    private int puntuacion;
    
     // Constructor, Get, Set, y Delete de Entrevista.
    public Entrevista(Postulante postulante, Evaluador evaluador, String comentarios, int puntuacion) {
        this.postulante = postulante;
        this.evaluador = evaluador;
        this.comentarios = comentarios;
        this.puntuacion = puntuacion;
        this.id = 0;
    }

    public Postulante getPostulante() {
        return postulante;
    }

    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }

    public Evaluador getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    public String toFileString() {
        return getPostulante() + ";" + getEvaluador() + ";" + getComentarios() + ";" + getPuntuacion();
    }

    public void guardar() {
        ArchivoGrabacion archivo = new ArchivoGrabacion("entrevistas.txt", true); // true para extender
        archivo.grabarLinea(this.toFileString());
        archivo.cerrar();
    }

}
