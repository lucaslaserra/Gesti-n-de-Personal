/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import lectura.ArchivoGrabacion;
import lectura.ArchivoLectura;


public class Entrevista implements Serializable{
    private Postulante postulante;
    private Evaluador evaluador;
    private Puesto puesto;
    private LocalDate fecha;
    private String comentarios;
    private int puntuacion; 

    public Entrevista(Postulante postulante, Evaluador evaluador, Puesto puesto, LocalDate fecha, String comentarios, int puntuacion) {
        this.postulante = postulante;
        this.evaluador = evaluador;
        this.puesto = puesto;
        this.fecha = fecha;
        this.comentarios = comentarios;
        this.puntuacion = puntuacion;
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

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    @Override
    public String toString() {
        return "Entrevista{" + " El postulante fue: " + postulante + ",El evaluador fue: " + evaluador + ", El puesto es: " + puesto + ", La fecha es: " + fecha + ", Los comentarios son:" + comentarios + ",La puntuacion es: " + puntuacion + '}';
    }
    
   
    
   public String toFileString() {
       return getPostulante() + ";" + getEvaluador() +";"+getPuesto()+";"+ getFecha()+";"+getComentarios()+";"+getPuntuacion();
    }
    
   // public static Entrevista fromFileString(String fileString) {
     //   String[] parts = fileString.split(";");   
       // return new Entrevista(parts[0], parts[1],parts[2],parts[3],parts[4],parts[5]);
    //}
     // Método para guardar el evaluador actual en un archivo
    
   public void guardar() {
        ArchivoGrabacion archivo = new ArchivoGrabacion("entrevistas.txt", true); // true para extender
        archivo.grabarLinea(this.toFileString());
        archivo.cerrar();
    }

    // Método static para leer todos los conocimientos de un archivo
   // public static ArrayList<Entrevista> obtenerListaEntrevistas() {
     //   ArrayList<Entrevista> entrevistas = new ArrayList<>();
       // ArchivoLectura archivo = new ArchivoLectura("entrevistas.txt");
        //while (archivo.hayMasLineas()) {
          //  Entrevista entrevista = Entrevista.fromFileString(archivo.linea());
            //entrevistas.add(entrevista);
        //}
       // archivo.cerrar();
        //return evaluadores;
    //}
}




