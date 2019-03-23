package examenlab2_eliasgiron;

public class OrdenEnsamblaje {
    private Computadora computadora;
    private Tecnico tecnico;

    public OrdenEnsamblaje(Computadora computadora, Tecnico tecnico) {
        this.computadora = computadora;
        this.tecnico = tecnico;
    }

    public OrdenEnsamblaje() {
    }
    
    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "computadora = " + computadora + " -> tecnico=" + tecnico;
    }
    
    
}
