
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

    public Sistema(boolean nuevoSistema) {
        if (nuevoSistema) {
            limpiarSistema();
        } else {
            cargarSistema();
        }
    }

    
    public void limpiarSistema() {
        habilidades.clear();
        puestos.clear();
        evaluadores.clear();
        postulantes.clear();
        entrevistas.clear();
        guardarSistema();
    }

    
    
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
    
    private void cargarSistema() {
    File archivo = new File(ARCHIVO_SISTEMA);
    if (archivo.exists()) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            habilidades = (ArrayList<Habilidad>) in.readObject();
            puestos = (ArrayList<Puesto>) in.readObject();
            evaluadores = (ArrayList<Evaluador>) in.readObject();
            postulantes = (ArrayList<Postulante>) in.readObject();
            entrevistas = (ArrayList<Entrevista>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Aquí podrías querer manejar el error inicializando listas vacías o notificando al usuario.
        }
    } else {
        // Inicializar listas vacías si el archivo no existe
        habilidades = new ArrayList<>();
        puestos = new ArrayList<>();
        evaluadores = new ArrayList<>();
        postulantes = new ArrayList<>();
        entrevistas = new ArrayList<>();
    }
}
    
    
    public void agregarHabilidad(Habilidad habilidad) {
        cargarSistema(); 
        habilidades.add(habilidad);
        guardarSistema(); 
    }

    
    public void agregarPuesto(Puesto puesto) {
        cargarSistema();
        puestos.add(puesto);
        guardarSistema(); 
    }

    
    public void agregarEvaluador(Evaluador evaluador) {
        cargarSistema();
        evaluadores.add(evaluador);
        guardarSistema(); 
    }

   
    public void agregarPostulante(Postulante postulante) {
        cargarSistema();
        postulantes.add(postulante);
        guardarSistema(); 
    }
   
    public void agregarEntrevista(Entrevista entrevista) {
        cargarSistema(); 
        entrevistas.add(entrevista);
        guardarSistema();
    }

    public void eliminarHabilidad(Habilidad habilidad) {
        cargarSistema();
        habilidades.remove(habilidad);
        guardarSistema();
    }

    public void eliminarPuesto(Puesto puesto) {
        cargarSistema();
        puestos.remove(puesto);
        guardarSistema();
    }

    public void eliminarEvaluador(Evaluador evaluador) {
        cargarSistema();
        evaluadores.remove(evaluador);
        guardarSistema();
    }

    public void eliminarPostulante(Postulante postulante) {
        cargarSistema();
        postulantes.remove(postulante);
        guardarSistema();
    }

    public void eliminarEntrevista(Entrevista entrevista) {
        cargarSistema();
        entrevistas.remove(entrevista);
        guardarSistema();
    }

}
