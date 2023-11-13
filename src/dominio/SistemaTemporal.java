
package dominio;

import java.util.ArrayList;
 
public class SistemaTemporal {
    private ArrayList <Habilidad> habilidades;
    private ArrayList <Entrevista> entrevista;
    private ArrayList <Evaluador> evaluador;
    private ArrayList <Postulante> postulante;
    private ArrayList <Puesto> puesto;

    public SistemaTemporal() {
        this.habilidades = new ArrayList<>();
        this.entrevista = new ArrayList<>();
        this.evaluador = new ArrayList<>();
        this.postulante = new ArrayList<>();
        this.puesto = new ArrayList<>();
    }

    public ArrayList<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidades.add(habilidad);
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
