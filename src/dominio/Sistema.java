
package dominio;

import java.io.*;
import java.util.ArrayList;

public class Sistema implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String ARCHIVO_SISTEMA = "sistema.dat";
 
    private  ArrayList<Habilidad> habilidades = new ArrayList<>();
    private  ArrayList<Puesto> puestos = new ArrayList<>();
    private  ArrayList<Evaluador> evaluadores = new ArrayList<>();
    private  ArrayList<Postulante> postulantes = new ArrayList<>();
    private  ArrayList<Entrevista> entrevistas = new ArrayList<>();

    // Métodos para habilidades
    public  void guardarListaHabilidades(ArrayList<Habilidad> lista) {
        habilidades = lista;
        guardarSistema();
    }

    public  ArrayList<Habilidad> obtenerListaHabilidades() {
        cargarSistema();
        return habilidades;
    }

    // Métodos para puestos
    public  void guardarListaPuestos(ArrayList<Puesto> lista) {
        puestos = lista;
        guardarSistema();
    }

    public  ArrayList<Puesto> obtenerListaPuestos() {
        cargarSistema();
        return puestos;
    }

    // Métodos para evaluadores
    public  void guardarListaEvaluadores(ArrayList <Evaluador> lista) {       
        evaluadores = lista;
        guardarSistema();
    }

    public  ArrayList<Evaluador> obtenerListaEvaluadores() {
        cargarSistema();
        return evaluadores;
    }
 public void setEvaluador(Evaluador evaluador){
     evaluadores =obtenerListaEvaluadores();
     evaluadores.add(evaluador);
     guardarSistema();
 }
    // Métodos para postulantes
    public  void guardarListaPostulantes(ArrayList<Postulante> lista) {
        postulantes = lista;
        guardarSistema();
    }

    public  ArrayList<Postulante> obtenerListaPostulantes() {
        cargarSistema();
        return postulantes;
    }

    // Métodos para entrevistas
    public  void guardarListaEntrevistas(ArrayList<Entrevista> lista) {
        entrevistas = lista;
        guardarSistema();
    }

    public  ArrayList<Entrevista> obtenerListaEntrevistas() {
        cargarSistema();
        return entrevistas;
    }

    private void guardarSistema() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARCHIVO_SISTEMA))) {
            out.writeObject(habilidades);
            out.writeObject(puestos);
            out.writeObject(evaluadores);
            out.writeObject(postulantes);
            out.writeObject(entrevistas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  void cargarSistema() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARCHIVO_SISTEMA))) {
            habilidades = (ArrayList<Habilidad>) in.readObject();
            puestos = (ArrayList<Puesto>) in.readObject();
            evaluadores = (ArrayList<Evaluador>) in.readObject();
            postulantes = (ArrayList<Postulante>) in.readObject();
            entrevistas = (ArrayList<Entrevista>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Manejar la excepción (puede ser normal si es la primera vez que se ejecuta)
            e.printStackTrace();
        }
    }
}