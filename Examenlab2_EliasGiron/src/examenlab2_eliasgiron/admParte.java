package examenlab2_eliasgiron;

import javax.swing.JProgressBar;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class admParte extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int duracion;
    private int falla;
    private Computadora computadora;
    private String centinela;
    private JTable tabla;

    public admParte(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        vive = true;
        centinela = "ram";
    }

    public int getFalla() {
        return falla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public void setFalla(int falla) {
        this.falla = falla;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void run() {

        int cont = 1;

        while (vive) {
            if (avanzar) {
                if (cont <= duracion) {
                    barra.setValue(cont);
                    if (barra.getValue() == computadora.getRam().getTiempo()) {
                        tabla();
                        centinela = "disco duro";
                    } else if (barra.getValue() == computadora.getHdd().getTiempo()+computadora.getRam().getTiempo()) {
                        centinela = "bateria";
                        tabla();
                    } else if (barra.getValue() == computadora.getTeclado().getTiempo()+computadora.getHdd().getTiempo()+computadora.getRam().getTiempo()) {
                        centinela = "teclado";
                        tabla();
                    } else if (barra.getValue() == computadora.getPantalla().getTiempo()+computadora.getRam().getTiempo()+computadora.getHdd().getTiempo()+computadora.getTeclado().getTiempo()) {
                        centinela = "pantalla";
                        tabla();
                    } else if (barra.getValue() == computadora.getProcesador().getTiempo()+computadora.getPantalla().getTiempo()+computadora.getRam().getTiempo()+computadora.getHdd().getTiempo()+computadora.getTeclado().getTiempo()) {
                        centinela = "procesador";
                        tabla();
                    }
                    cont++;
                } else if (cont == duracion) {
                    vive = false;
                }
            }
            try {
                Thread.sleep(1000
                );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void tabla() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        if (centinela.equals("ram")) {

            Object newrow[] = {
                computadora.getRam()
            };
            modelo.addRow(newrow);
            
        } else if (centinela.equals("disco duro")) {

            Object newrow[] = {
                computadora.getHdd()
            };
            modelo.addRow(newrow);
            
        } else if (centinela.equals("bateria")) {

            Object newrow[] = {
                computadora.getBateria()
            };
            modelo.addRow(newrow);
            tabla.setModel(modelo);
        } else if (centinela.equals("teclado")) {
            Object newrow[] = {
                computadora.getTeclado()
            };
            modelo.addRow(newrow);
            
        } else if (centinela.equals("pantalla")) {
            Object newrow[] = {
                computadora.getPantalla()
            };
            modelo.addRow(newrow);
            tabla.setModel(modelo);
        } else if (centinela.equals("procesador")) {
            Object newrow[] = {
                computadora.getProcesador()
            };
            modelo.addRow(newrow);
            
        }
        tabla.setModel(modelo);
    }
}
