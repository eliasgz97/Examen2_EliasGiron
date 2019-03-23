package examenlab2_eliasgiron;

public class DiscoDuro extends Parte{
    private int tamano;
    private String marca;

    public DiscoDuro(int tamano, String marca, int tiempo) {
        super(tiempo);
        this.tamano = tamano;
        this.marca = marca;
    }
    
    public DiscoDuro() {
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "tamano=" + tamano + ", marca=" + marca + super.toString();
    }
    
}
