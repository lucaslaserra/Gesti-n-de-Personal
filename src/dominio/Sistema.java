// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package dominio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class Sistema implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String ARCHIVO_SISTEMA = "sistema.dat";

    private ArrayList<Habilidad> habilidades = new ArrayList<>();
    private ArrayList<Puesto> puestos = new ArrayList<>();
    private ArrayList<Evaluador> evaluadores = new ArrayList<>();
    private ArrayList<Postulante> postulantes = new ArrayList<>();
    private ArrayList<Entrevista> entrevistas = new ArrayList<>();
    private int siguienteNumEntrevista = 1;
    private List<SistemaObserver> observadores = new ArrayList<>();

    public Sistema(boolean nuevoSistema) {
        if (nuevoSistema) {
            limpiarSistema();
        } else {
            cargarSistema();
        }
    }
   

    // Get, Set, y Delete de las listas del sistema.
    public int obtenerNumdeEntrevistas() {
        cargarSistema();
        return siguienteNumEntrevista;
    }

    public ArrayList<Habilidad> obtenerListaHabilidades() {
        cargarSistema();
        return habilidades;
    }

    public ArrayList<Puesto> obtenerListaPuestos() {
        cargarSistema();
        return puestos;
    }

    public ArrayList<Evaluador> obtenerListaEvaluadores() {
        cargarSistema();
        return evaluadores;
    }

    public ArrayList<Postulante> obtenerListaPostulantes() {
        cargarSistema();
        return postulantes;
    }

    public ArrayList<Entrevista> obtenerListaEntrevistas() {
        cargarSistema();
        return entrevistas;
    }

    public void agregarHabilidad(Habilidad habilidad) {
        cargarSistema();
        habilidades.add(habilidad);
        guardarSistema();
        notificarObservadores();
    }

    public void agregarPuesto(Puesto puesto) {
        cargarSistema();
        puestos.add(puesto);
        guardarSistema();
        notificarObservadores();
    }

    public void agregarEvaluador(Evaluador evaluador) {
        cargarSistema();
        evaluadores.add(evaluador);
        guardarSistema();
        notificarObservadores();
    }

    public void agregarPostulante(Postulante postulante) {
        cargarSistema();
        postulantes.add(postulante);
        guardarSistema();
        notificarObservadores();
    }

    public void agregarEntrevista(Entrevista entrevista) {
        cargarSistema();
        entrevista.setId(siguienteNumEntrevista);
        siguienteNumEntrevista++;
        entrevistas.add(entrevista);
        guardarSistema();
        notificarObservadores();
    }

    public void eliminarHabilidad(Habilidad habilidad) {
        cargarSistema();
        habilidades.remove(habilidad);
        guardarSistema();
        notificarObservadores();
    }

    public void eliminarPuesto(Puesto puesto) {
        cargarSistema();
        puestos.remove(puesto);
        guardarSistema();
        notificarObservadores();
    }

    public void eliminarEvaluador(Evaluador evaluador) {
        cargarSistema();
        evaluadores.remove(evaluador);
        guardarSistema();
        notificarObservadores();
    }

    public void eliminarPostulante(Postulante postulante) {
        for (Postulante p : this.obtenerListaPostulantes()) {
        }
        cargarSistema();
        postulantes.remove(postulante);
        guardarSistema();
        for (Postulante p : this.obtenerListaPostulantes()) {
        }
        notificarObservadores();
    }

    public void eliminarEntrevista(Entrevista entrevista) {
        cargarSistema();
        entrevistas.remove(entrevista);
        guardarSistema();
        notificarObservadores();
    }

    // Persistir Sistema
    public void guardarSistema() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARCHIVO_SISTEMA))) {
            out.writeObject(habilidades);
            out.writeObject(puestos);
            out.writeObject(evaluadores);
           
            out.writeObject(postulantes);
            out.writeObject(entrevistas);
            out.writeObject(siguienteNumEntrevista);
        } catch (IOException e) {
            System.out.println("Error al guardar sistema.");
        }
    }

    // Cargar sistema persistido
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
                System.out.println("Error al cargar sistema.");
                // Aquí podrías querer manejar el error inicializando listas vacías o notificando al usuario.
            }
        } else {
            inicializarListas();
        }
    }

    // Inicializar variables
    private void inicializarListas() {
        habilidades = new ArrayList<>();
        puestos = new ArrayList<>();
        evaluadores = new ArrayList<>();
        postulantes = new ArrayList<>();
        entrevistas = new ArrayList<>();
        siguienteNumEntrevista = 1;
    }
    
    // Adjuntar panel para observar
    public void adjuntar(SistemaObserver observer) {
        observadores.add(observer);
    }
    // Desadjuntar panel para observar
    public void desadjuntar(SistemaObserver observer) {
        observadores.remove(observer);
    }

    // Notificar observadores, y actualizar pantallas.
    public void notificarObservadores() {
        for (SistemaObserver observer : observadores) {
            observer.actualizar();
        }
    }
    
    // Limpiar variables
    public void limpiarSistema() {
        habilidades.clear();
        puestos.clear();
        evaluadores.clear();
        postulantes.clear();
        entrevistas.clear();
        siguienteNumEntrevista = 1;
        guardarSistema();
    }
    
}
