package examenlab2_eliasgiron;

public class Pantalla extends Parte{
    private String tactil;
    private String tipo;

    public Pantalla(String tactil, String tipo, int tiempo) {
        super(tiempo);
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public String getTactil() {
        return tactil;
    }

    public void setTactil(String tactil) {
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "tactil=" + tactil + ", tipo=" + tipo + super.toString();
    }
    
}
