package examenlab2_eliasgiron;

public class Procesador extends Parte{
    private int nucleos;
    private String velocidad;

    public Procesador() {
    }

    public Procesador(int nucleos, String velocidad, int tiempo) {
        super(tiempo);
        this.nucleos = nucleos;
        this.velocidad = velocidad;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "nucleos=" + nucleos + ", velocidad=" + velocidad + super.toString();
    }
    
    
    
}
