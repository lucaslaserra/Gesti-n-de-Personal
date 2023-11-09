/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;


import java.util.ArrayList;



enum TipoTrabajo {
    REMOTO, PRESENCIAL, MIXTO
}
public class Postulante extends Persona {
    private String telefono;
    private String email;
    private String linkedin;
    private TipoTrabajo tipoTrabajo;
    private ArrayList<Conocimiento> conocimientos;
    
    // Constructor, getters y setters
    public Postulante(String nombre, String cedula, String direccion, String telefono, String email, String linkedin) {
        super(nombre, cedula, cedula);
        this.telefono = telefono;
        this.email = email;
        this.linkedin = linkedin;
        this.tipoTrabajo = tipoTrabajo;
        this.conocimientos = new ArrayList<>();
    }

    public void agregarConocimiento(Conocimiento conocimiento) {
        conocimientos.add(conocimiento);
    }

    public void eliminarConocimiento(Conocimiento conocimiento) {
        conocimientos.remove(conocimiento);
    }

    public ArrayList<Conocimiento> getConocimientos() {
        return conocimientos;
    }
    
    @Override
    public String toString() {
        return "Postulante{" +
                "nombre='" + getNombre() + '\'' +
                ", cedula='" + getCedula() + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", linkedin='" + linkedin + '\'' +
                ", conocimientos=" + conocimientos +
                '}';
    }
}