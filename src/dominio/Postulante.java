
package dominio;


import java.util.*;



enum TipoTrabajo {
    REMOTO, PRESENCIAL, MIXTO
}
public class Postulante extends Persona {
    private String telefono;
    private String email;
    private String linkedin;
    private TipoTrabajo tipoTrabajo;
    private Map<Habilidad, Integer> habilidades;
    
    // Constructor, getters y setters
    public Postulante(String nombre, String cedula, String direccion, String telefono, String email, String linkedin, String tipoTrabajo) {
        super(nombre, cedula, direccion);
        this.telefono = telefono;
        this.email = email;
        this.linkedin = linkedin;
        if (tipoTrabajo == "Remoto") {
            this.tipoTrabajo = TipoTrabajo.REMOTO;
        } else if (tipoTrabajo == "Presencial") {
            this.tipoTrabajo = TipoTrabajo.PRESENCIAL;
        } else if (tipoTrabajo == "Mixto") {
            this.tipoTrabajo = TipoTrabajo.MIXTO;
        }
    }

    
    public void addHabilidad(Habilidad habilidad, Integer nivel) {
        habilidades.put(habilidad, nivel);
    }

    public void removeHabilidad(Habilidad habilidad) {
        habilidades.remove(habilidad);
    }

    public int getNivelHabilidad(Habilidad habilidad) {
        return habilidades.getOrDefault(habilidad, 0);
    }
    
     public void setTipoTrabajo(TipoTrabajo tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }
    
    @Override
    public String toString() {
        return "Postulante{" +
                "nombre='" + getNombre() + '\'' +
                ", cedula='" + getCedula() + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", linkedin='" + linkedin + '\'' +
                ", conocimientos=" + habilidades +
                '}';
    }
}