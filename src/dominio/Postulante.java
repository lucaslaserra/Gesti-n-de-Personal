// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package dominio;

import java.io.Serializable;
import java.util.*;
import lectura.ArchivoGrabacion;
import lectura.ArchivoLectura;

enum TipoTrabajo {
    REMOTO, PRESENCIAL, MIXTO
}

public class Postulante extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    private String telefono;
    private String email;
    private String linkedin;
    private String tipoTrabajo;
    private Map<Habilidad, Integer> habilidades;

    // Constructor, Get, Set, y Delete de Postulante.
    public Postulante(String nombre, String cedula, String direccion, String telefono, String email, String linkedin, String tipoTrabajo) {
        super(nombre, cedula, direccion);
        this.telefono = telefono;
        this.email = email;
        this.linkedin = linkedin;
        this.tipoTrabajo = tipoTrabajo;
        habilidades = new HashMap<>();
    }

    public Map<Habilidad, Integer> getHabilidades() {
        if (this.habilidades == null) {
            this.habilidades = new HashMap<>();
        }
        return this.habilidades;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public void addHabilidad(Habilidad habilidad, Integer nivel) {
        habilidades.put(habilidad, nivel);
    }

    public void removeHabilidad(Habilidad habilidad) {
        habilidades.remove(habilidad);
    }

    public int getNivelHabilidad(Habilidad habilidad) {
        int nivel = 0;
        boolean encontro = false;
        for (Map.Entry<Habilidad, Integer> entrada : habilidades.entrySet()) {
            if (entrada.getKey().equals(habilidad) && !encontro) {
                nivel = entrada.getValue();
                encontro = true;
            }
        }
        return nivel;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    @Override
    public String toString() {
        return getNombre() + " (" + getCedula() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Postulante postulante = (Postulante) obj;
        return Objects.equals(this.getCedula(), postulante.getCedula());
    }

}
