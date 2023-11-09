
package dominio;



public class Evaluador extends Persona{
    private String añoIngreso;

    public Evaluador(String añoIngreso, String nombre, String cedula, String direccion) {
        super(nombre, cedula, direccion);
        this.añoIngreso = añoIngreso;
    }

    public void setAñoIngreso(String añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public String getAñoIngreso() {
        return añoIngreso;
    }
    
    
    
}
