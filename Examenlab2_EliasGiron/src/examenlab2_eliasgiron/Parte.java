package examenlab2_eliasgiron;

public class Parte {
    private int tiempo;

    public Parte(int tiempo) {
        this.tiempo = tiempo;
    }

    public Parte() {
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "tiempo = " + tiempo + '}';
    }
    
}
