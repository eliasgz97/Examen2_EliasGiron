package examenlab2_eliasgiron;

public class Teclado extends Parte{
    private String color;
    private String material;

    public String getColor() {
        return color;
    }

    public Teclado(String color, String material, int tiempo) {
        super(tiempo);
        this.color = color;
        this.material = material;
    }
    

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return " material=" + material + super.toString();
    }
    
}
