
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
    private int siguienteNumEntrevista = 1;
//    private transient ArrayList<SistemaObserver> observers;
    
    
    public Sistema(boolean nuevoSistema) {  
//        this.observers = new ArrayList<>();
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
        siguienteNumEntrevista=1;
        guardarSistema();
    }

    public int obtenerNumdeEntrevistas(){
     cargarSistema();
     return siguienteNumEntrevista;
    }
   

    public  ArrayList<Habilidad> obtenerListaHabilidades() {
        cargarSistema();
        return habilidades;
    }
   
 
    public  ArrayList<Puesto> obtenerListaPuestos() {
        cargarSistema();
        return puestos;
    }

    
    public  ArrayList<Evaluador> obtenerListaEvaluadores() {
        cargarSistema();
        return evaluadores;
    }

  

    public  ArrayList<Postulante> obtenerListaPostulantes() {
        cargarSistema();
        return postulantes;
    }

    

    public  ArrayList<Entrevista> obtenerListaEntrevistas() {
        cargarSistema();
        return entrevistas;
    }

    public void guardarSistema() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARCHIVO_SISTEMA))) {
            out.writeObject(habilidades);
            out.writeObject(puestos);
            out.writeObject(evaluadores);
            System.out.print("Postulantes guardados: ");
            System.out.println(postulantes);
            out.writeObject(postulantes);
            out.writeObject(entrevistas);
            out.writeObject(siguienteNumEntrevista);
//            notificarObservers();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
//    private void notificarObservers() { 
//        for (SistemaObserver observer : observers) {
//            observer.actualizar();
//        }
//    }
    
    public void cargarSistema() {
    File archivo = new File(ARCHIVO_SISTEMA);
    if (archivo.exists()) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            habilidades = (ArrayList<Habilidad>) in.readObject();
            puestos = (ArrayList<Puesto>) in.readObject();
            evaluadores = (ArrayList<Evaluador>) in.readObject();
            postulantes = (ArrayList<Postulante>) in.readObject();
            entrevistas = (ArrayList<Entrevista>) in.readObject();
            siguienteNumEntrevista = (int) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Aquí podrías querer manejar el error inicializando listas vacías o notificando al usuario.
        }
    } else {
        inicializarListas();
    }
//    if (this.observers == null) {
//        this.observers = new ArrayList<>();
//    }
}
    
    private void inicializarListas() {
        habilidades = new ArrayList<>();
        puestos = new ArrayList<>();
        evaluadores = new ArrayList<>();
        postulantes = new ArrayList<>();
        entrevistas = new ArrayList<>();
        siguienteNumEntrevista=1;
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
        entrevista.setId(siguienteNumEntrevista);
        siguienteNumEntrevista++;
        System.out.println(entrevista.getId());
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
        System.out.println("Postulantes antes de elimianr: ");
        for (Postulante p : this.obtenerListaPostulantes()) {
            System.out.println(p.toString());
        }
        cargarSistema();
        System.out.println("Postulante que voy a elimianr: " + postulante.getNombre());
        postulantes.remove(postulante);
        guardarSistema();
        System.out.println("Postulantes luego de elimianr: ");
        for (Postulante p : this.obtenerListaPostulantes()) {
            System.out.println(p.toString());
        }
    }

    public void eliminarEntrevista(Entrevista entrevista) {
        cargarSistema();
        entrevistas.remove(entrevista);
        guardarSistema();
    }

} 
