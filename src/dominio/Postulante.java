
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
    private TipoTrabajo tipoTrabajo;
    private Map<Habilidad, Integer> habilidades;

   
    // Constructor, getters y setters
    public Postulante(String nombre, String cedula, String direccion, String telefono, String email, String linkedin, String tipoTrabajo) {
        super(nombre, cedula, direccion);
        this.telefono = telefono;
        this.email = email;
        this.linkedin = linkedin;
        if ("Remoto".equals(tipoTrabajo)) {
            this.tipoTrabajo = TipoTrabajo.REMOTO;
        } else if ("Presencial".equals(tipoTrabajo)) {
            this.tipoTrabajo = TipoTrabajo.PRESENCIAL;
        } else if ("Mixto".equals(tipoTrabajo)) {
            this.tipoTrabajo = TipoTrabajo.MIXTO;
        }
        habilidades = new HashMap<>();
    }

   public Map<Habilidad, Integer> getHabilidades() {
        if (this.habilidades == null) {
            this.habilidades = new HashMap<>();
        }
        return this.habilidades;
    }

   public String getTipoTrabajo() {
       String tipoTrabajoStr = "";
       if (this.tipoTrabajo == TipoTrabajo.REMOTO) {
            tipoTrabajoStr = "Remoto";
        } else if (this.tipoTrabajo == TipoTrabajo.PRESENCIAL) {
            tipoTrabajoStr = "Presencial";
        } else if (this.tipoTrabajo == TipoTrabajo.MIXTO) {
            tipoTrabajoStr = "Mixto";
        }
       return tipoTrabajoStr;
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
        return habilidades.getOrDefault(habilidad, 0);
    }
    
     public void setTipoTrabajo(TipoTrabajo tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }
    
    @Override
    public String toString() {
        return getNombre();
    }
    
    @Override
     public boolean equals(Object obj) {
         Postulante postulante = (Postulante) obj;
        return Objects.equals(this.getCedula(), postulante.getCedula());
    }
    
    
//    public String toFileString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(super.getNombre()) 
//          .append(";")
//          .append(super.getCedula()) 
//          .append(";")
//          .append(super.getDireccion()) 
//          .append(";")
//          .append(this.getTelefono())
//          .append(";")
//          .append(this.getEmail())
//          .append(";")
//          .append(this.getLinkedin())
//          .append(";")
//          .append(this.getTipoTrabajo());
//
//        
//        for (Map.Entry<Habilidad, Integer> entry : this.habilidades.entrySet()) {
//            Habilidad habilidad = entry.getKey();
//            Integer nivel = entry.getValue();
//            sb.append(";")
//              .append(habilidad.getTema())
//              .append(":")
//              .append(nivel);
//        }
//
//        return sb.toString();
//    }
    
//    public static Postulante fromFileString(String fileString) {
//        String[] parts = fileString.split(";");
//        String nombre = parts[0];
//        String cedula = parts[1];
//        String direccion = parts[2];
//        String telefono = parts[3];
//        String email = parts[4];
//        String linkedin = parts[5];
//        String tipoTrabajo = parts[6];
//
//        Postulante postulante = new Postulante(nombre, cedula, direccion, telefono, email, linkedin, tipoTrabajo);
//
//        // Añadir habilidades y niveles
//        for (int i = 7; i < parts.length; i++) {
//            String[] habilidadParts = parts[i].split(":");
//            String tema = habilidadParts[0];
//            Integer nivel = Integer.parseInt(habilidadParts[1]);
//            Habilidad habilidad = new Habilidad(tema, "");
//            postulante.addHabilidad(habilidad, nivel);
//        }
//
//        return postulante;
//    }

    
    
//    public void guardar() {
//        ArchivoGrabacion archivo = new ArchivoGrabacion("Sistema.txt", true); // true para extender
//        archivo.grabarLinea("POSTULANTE;" + this.toFileString());
//        archivo.cerrar();
//    }
    
//    public static ArrayList<Postulante> getPostulantesArchivo(){
//        ArrayList<Postulante> postulantes = new ArrayList<>();
//        ArchivoLectura archivo = new ArchivoLectura("Sistema.txt");
//
//        while (archivo.hayMasLineas()) {
//            String linea = archivo.linea();
//            if (linea.startsWith("POSTULANTE;")) {
//                Postulante postulante = Postulante.fromFileString(linea.substring(11)); // Elimina el prefijo
//                postulantes.add(postulante);
//            }
//        }
//        archivo.cerrar();
//        return postulantes;
//    }
    
}