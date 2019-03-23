package examenlab2_eliasgiron;

public class Bateria extends Parte{
    private int capacidad;
    private String material;

    public Bateria() {
    }

    public Bateria(int capacidad, String material, int tiempo) {
        super(tiempo);
        this.capacidad = capacidad;
        this.material = material;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "capacidad=" + capacidad + super.toString();
    }
    
    
}
