package entidad;

public class Palos {

    private String nombre;

    public Palos() {
    }

    public Palos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     @Override
    public String toString() {
        return nombre;

    }

}
