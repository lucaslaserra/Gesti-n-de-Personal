/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class SistemaTemporal {
    private ArrayList <Conocimiento> temas;
    private ArrayList <Entrevista> entrevista;
    private ArrayList <Evaluador> evaluador;
    private ArrayList <Postulante> postulante;
    private ArrayList <Puesto> puesto;

    public SistemaTemporal() {
        this.temas = new ArrayList<>();
        this.entrevista = new ArrayList<>();
        this.evaluador = new ArrayList<>();
        this.postulante = new ArrayList<>();
        this.puesto = new ArrayList<>();
    }

    public ArrayList<Conocimiento> getTemas() {
        return temas;
    }

    public void setTemas(Conocimiento tema) {
        this.temas.add(tema);
    }

    public ArrayList<Entrevista> getEntrevista() {
        return entrevista;
    }

    public void setEntrevista(Entrevista entrevista) {
        this.entrevista.add(entrevista);
    }

    public ArrayList<Evaluador> getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Evaluador evaluador) {
        this.evaluador.add(evaluador);
    }

    public ArrayList<Postulante> getPostulante() {
        return postulante;
    }

    public void setPostulante(Postulante postulante) {
        this.postulante.add(postulante);
    }

    public ArrayList<Puesto> getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto.add(puesto);
    }
    
           
    
}
