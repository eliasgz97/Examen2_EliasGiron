package examenlab2_eliasgiron;

public class Tecnico {
    private String nombre;
    private int edad;
    private String genero;
    private int cantcomp;

    public Tecnico(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cantcomp = 0;
    }

    public Tecnico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantcomp() {
        return cantcomp;
    }

    public void setCantcomp(int cantcomp) {
        this.cantcomp = cantcomp;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", cantcomp=" + cantcomp;
    }
    
    
}
